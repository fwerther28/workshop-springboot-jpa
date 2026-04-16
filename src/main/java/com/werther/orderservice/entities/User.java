	package com.werther.orderservice.entities;
	
	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
	
	import com.fasterxml.jackson.annotation.JsonIdentityInfo;
	import com.fasterxml.jackson.annotation.ObjectIdGenerators;
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.EqualsAndHashCode;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	
	@Entity
	@Table(name = "tb_user")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@NoArgsConstructor
	@Getter
	@Setter
	@EqualsAndHashCode(of = "id")
	public class User implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String email;
		private String phone;
		private String password;
		
		public User(Long id, String name, String email, String phone, String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.password = password;
		}
	
		@OneToMany(mappedBy = "client")
		@Setter(lombok.AccessLevel.NONE)
		private List<Order> orders = new ArrayList<>();
	}
