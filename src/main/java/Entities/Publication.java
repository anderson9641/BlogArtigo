package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
		private User user;
		
		@Getter
		@Setter
		private List<Comment> Comments;
}
