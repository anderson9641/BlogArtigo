package com.student.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Publication implements Serializable {

		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue
		private Long id;
		
		@Getter
		@Setter
		private Date date;
		
		@Getter
		@Setter
		private String title;
		
		@Getter
		@Setter
		private byte[] content;
		
		@Getter
		@Setter
		@ManyToOne
		private User user;
		
		@Getter
		@Setter
		@OneToMany
		private List<Comment> Comments;
}
