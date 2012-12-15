package com.gunbound.server.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.support.JpaDaoSupport;


@SuppressWarnings("deprecation")
public abstract class JpaDAO<K,E> extends JpaDaoSupport{
	protected Class<E> entityClass;
	
	@SuppressWarnings("unchecked")
	public JpaDAO(){
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<E>)genericSuperclass.getActualTypeArguments()[1];
	}
	public void persist(E entity){
		getJpaTemplate().persist(entity);
	}
	public void remove(E entity){
		getJpaTemplate().remove(entity);
	}
	public E merge(E entity){
		return getJpaTemplate().merge(entity);
	}
	public void refresh(E entity){
		getJpaTemplate().refresh(entity);
	}
	public E findById(K id){
		return getJpaTemplate().find(entityClass,id);
	}
	public E flush(E entity){
		getJpaTemplate().flush();
		
		return entity;
	}
	
	public String getName(){
		return entityClass.getName();
	}
	
	public Integer update(final String query){
		return getJpaTemplate().execute(new JpaCallback<Integer>() {
			@Override
			public Integer doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery(query);
				return q.executeUpdate();
			}
		});
	}
	public List<E> findList(String query){
		return findList(query,-1);
	}
	@SuppressWarnings("unchecked")
	public List<E> findList(final String query, final int size){
		return getJpaTemplate().execute(new JpaCallback<List<E>>() {
			@Override
			public List<E> doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery(query);
				if(size>0) q.setMaxResults(size);
				return q.getResultList();
			}
		});
	}
	
	public List<E> findAll(){
		return findList("SELECT h FROM "+entityClass.getName()+" h");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Integer removeAll(){
		return (Integer)getJpaTemplate().execute(new JpaCallback() {
			public Object doInJpa(EntityManager em)throws PersistenceException{
				Query q = em.createQuery("DELETE FROM "+getName()+" h");
				return q.executeUpdate();
			}
		});
	}
	
	public Long countAll(){
		return count(getName() + " h");
	}
	public Long count(final String query){
		return getJpaTemplate().execute(new JpaCallback<Long>() {
			@Override
			public Long doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery("SELECT count(*) FROM "+ query);
				return (Long) q.getSingleResult();
			}
		});
	}
	public Long countParametrer(final String query, final String ... parametros){
		return getJpaTemplate().execute(new JpaCallback<Long>() {
			@Override
			public Long doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery("SELECT count(*) FROM "+query);
				int k = 1;
				for(String x : parametros){
					q.setParameter(k, x);
					k++;
				}
				return (Long)q.getSingleResult();
			}
		});
	}
	public E findEntity(final String simpleQuery){
		return getJpaTemplate().execute(new JpaCallback<E>() {

			@Override
			public E doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery(simpleQuery);
				@SuppressWarnings("unchecked")
				List<E> list = q.getResultList();
				if(list.isEmpty()) return null;
				else return list.get(0);
			}
		});
	}
	public E findEntity(final String query, final String ... parameters){
		return getJpaTemplate().execute(new JpaCallback<E>() {
			@Override
			public E doInJpa(EntityManager em) throws PersistenceException {
				Query q = em.createQuery("SELECT h FROM "+query);
				int k = 1;
				for(String x: parameters){
					q.setParameter(k, x);
					k++;
				}
				@SuppressWarnings("unchecked")
				List<E> list = q.getResultList();
				if(list.isEmpty()) return null;
				return list.get(0);
			}
		});
	}
	public void performTransaction(Query q, EntityManager em){
		EntityTransaction transaction = em.getTransaction();
		try{
			transaction.begin();
			q.executeUpdate();
			transaction.commit();
		}catch(Exception e){
			if(transaction != null && transaction.isActive())
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
}




