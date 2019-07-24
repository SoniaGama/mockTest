package com.pruebapost.dummy.model;

import lombok.Data;

@Data
public class ModelEntity {
	
	private String postTest;
	
	public ModelEntity() {}
	
	public ModelEntity(String postTest) {
		this.postTest = postTest;
	}	
	
}
