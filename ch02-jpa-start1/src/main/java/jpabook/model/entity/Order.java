package jpabook.model.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id @GeneratedValue;
	@Column(name="ORDER_ID")
	private Long id;
	
	@Column(name="MEMBER_ID")
	private Long meberId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMeberId() {
		return meberId;
	}

	public void setMeberId(Long meberId) {
		this.meberId = meberId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", meberId=" + meberId + ", orderDate=" + orderDate + ", status=" + status + "]";
	}
}
