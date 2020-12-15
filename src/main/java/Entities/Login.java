package Entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Login implements Serializable {

		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue
		private Long id;
		
		@Getter
		@Setter
		private String email;
		
		@Getter
		@Setter
		private String passowrd;
}
