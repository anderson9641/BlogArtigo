package com.student.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.student.enuns.Perfil;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Entity
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	
	private Perfil profile;
	
	@Getter
	@Setter
	@Lob
	private byte[] imageProfile;
	
	@Getter
	@Setter
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Login login;
	
	@Getter
	@OneToMany(mappedBy = "user")
	private List<Publication> publications = new ArrayList<>();

	public User(Long id, String name, String description, Perfil profile, byte[] imageProfile, Login login) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.profile = profile;
		this.imageProfile = imageProfile;
		this.login = login;
	}
	
	
	

}
