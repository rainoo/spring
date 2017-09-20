package com.gittoy.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService {

	@Resource
	private JsrDAO jsrDAO;

	@PostConstruct
	public void init() {
		System.out.println("jsrService init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("jsrService destroy.");
	}

	public void save() {
		jsrDAO.save();
	}
}
