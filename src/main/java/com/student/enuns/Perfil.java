package com.student.enuns;

public enum Perfil {
	ADMINISTRADOR(1, "ROLE_ADMINISTRADOR"),
	AUTOR(2, "ROLE_AUTOR"),
	USUARIO(3, "ROLE_USUARIO");
	
	private int code;
	private String description;
	
	private Perfil(int code, String description){
		this.code = code;
		this.description = description;
	}
	
	public int getCode() {
		return code;
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
