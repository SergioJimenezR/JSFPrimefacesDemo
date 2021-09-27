package com.sergiojimenez.demo.backbeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("panelLogin")
@ViewScoped
public class LoginView implements Serializable {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
	}

}
