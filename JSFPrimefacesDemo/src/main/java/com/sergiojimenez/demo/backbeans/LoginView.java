package com.sergiojimenez.demo.backbeans;

import java.io.Serializable;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.commons.codec.digest.DigestUtils;

import com.sergiojimenez.demo.dao.LoginDAO;

@Named("panelLogin")
@ViewScoped
public class LoginView implements Serializable {

	private static final long serialVersionUID = 1L;

	private String usuario; // Usuario introducido.
	private String hash; // Hash de la password introducida.
	private String mensaje;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
		System.out.println("usuario: " + usuario);
	}

	public String getPassword() {
		return ""; // Cifrada.
	}

	public void setPassword(String passwordIntroducida) {
		this.hash = DigestUtils.sha512Hex(passwordIntroducida);
		System.out.println("password: " + passwordIntroducida);
		System.out.println("hash: " + hash);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	// action="#{panelLogin.comprobarLogin()}"
	public void comprobarLogin() {
		if (LoginDAO.existeUsuario(usuario) && hash.equals(LoginDAO.leerHashPassword(usuario))) {
			mensaje = "Login correcto.";
		} else {
			mensaje = "Login incorrecto.";
			usuario = "";
		}
	}

	// actionListener="#{panelLogin.comprobarLogin}"
	public void comprobarLogin(ActionEvent event) {

	}

}
