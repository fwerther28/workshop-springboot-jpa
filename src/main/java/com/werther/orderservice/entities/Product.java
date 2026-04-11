package com.werther.orderservice.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_product")
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	private Long id;
	
	@Setter
	private String name;
	
	@Setter
	private String description;
	
	@Setter
	private Double price;
	
	@Setter
	private String imgUrl;
	
	@ManyToMany
	@JoinTable(name = "tb_product_category",
		joinColumns = @JoinColumn(name = "product_id"),
		inverseJoinColumns = @JoinColumn(name = "category_id"))
	@Setter(lombok.AccessLevel.NONE)
	private Set<Category> categories = new HashSet<>();
	
	public Product(Long id, String name, String description, Double price, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
}
