package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity 
@Getter @Setter
public class Product {
	
	//Hibernate: select next_val as id_val from hibernate_sequence for update
	//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
	//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)

@Id	
@GeneratedValue//(strategy= GenerationType.IDENTITY)// Auto is the default generation or the strategy. generation type is the strategy which the JPA should use or follow to generate primary key values. The default generation type is auto. when the strategy is not specified the JPA uses auto strategy. When the underlined database is MYsql, GenerationType.AUTO means the JPA will create a hybernet sequence in the database for the generation of primary keys.
@Getter @Setter private long productId;// GenerationType.IDENTITY- for this strategy to work, first we have to create a table in mysql and explicitly specify the AutoIncrement(AI) column as checked for the primary key column. And in application.properties file, spring.jpa.hibernate.ddl-auto=none, this should not be set, if it is set it should have value as update.
@Getter @Setter private String name;
@Getter @Setter private String description;
@Getter @Setter private BigDecimal price;
@Getter @Setter private int qty;
	
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	
	

}
