package org.jsp.hibernate.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserDTO  implements Serializable{
	
	private int id;
	
	private String name;
	
	private String email;
	
	

}
