package com.student.enuns;


import lombok.Getter;
import lombok.Setter;

public enum Perfil {
	ADMINISTRADOR(1, "ROLE_ADMINISTRADOR"),
	AUTOR(2, "ROLE_AUTOR"),
	USUARIO(3, "ROLE_USUARIO");
	
	@Getter @Setter
	private int code;
	@Getter @Setter
	private String description;
	
	private Perfil(int code, String description){
		this.code = code;
		this.description = description;
	}
	
	public static Perfil toEnum(int code) {
		for(Perfil value : Perfil.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Perfil code"); 
	}
}
