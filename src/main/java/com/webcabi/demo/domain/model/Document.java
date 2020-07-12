package com.webcabi.demo.domain.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Setter;

@DynamoDBTable(tableName = "document")
@Setter
public class Document implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public Document() {
		this("");
	}
	
	public Document(String name) {
		this.name = name;
	}
	
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey
	public String getId() {
		return id;
	}
	
	@DynamoDBAttribute
	public String getName() {
		return name;
	}
}