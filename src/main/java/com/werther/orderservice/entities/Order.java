	package com.werther.orderservice.entities;
	
	import java.io.Serializable;
	import java.time.Instant;
	import java.util.HashSet;
	import java.util.Set;
	
	import com.fasterxml.jackson.annotation.JsonFormat;
	import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
	import com.werther.orderservice.entities.enums.OrderStatus;
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;
	import lombok.AccessLevel;
	import lombok.EqualsAndHashCode;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	
	@Entity
	@Table(name = "tb_order")
	@NoArgsConstructor
	@Getter
	@Setter
	@EqualsAndHashCode(of = "id")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	public class Order implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
		private Instant moment;
		
		@Setter(AccessLevel.NONE)
		private Integer orderStatus;
		
		@ManyToOne
		@JoinColumn(name = "client_id")
		private User client;
		
		@OneToMany(mappedBy = "id.order")
		@Setter(AccessLevel.NONE)
		@JsonManagedReference
		private Set<OrderItem> items = new HashSet<>();
	
		public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
			super();
			this.id = id;
			this.moment = moment;
			setOrderStatus(orderStatus);
			this.client = client;
		}
		
		public OrderStatus getOrderStatus() {
			return OrderStatus.valueOf(orderStatus);
		}
		
		public void setOrderStatus (OrderStatus orderStatus) {
			if (orderStatus != null) {
				this.orderStatus = orderStatus.getCode();
			}
		}
	}
