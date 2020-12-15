package com.student.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Login implements Serializable {

		
		private static final long serialVersionUID = 1L;
		
		@Getter
		@Setter
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@Getter
		@Setter
		private String email;
		
		@Getter
		@Setter
		private String passowrd;
}
