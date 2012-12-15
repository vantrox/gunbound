package com.gunbound.server;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckConnections implements Filter, Runnable{
	public CheckConnections(){
		new Thread(this).start();
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(5000);
				//JugadorServiceImpl.dao.clearConnections();
				
			}catch(Exception e){e.printStackTrace();}
		}
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
}
