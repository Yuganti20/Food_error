package DTO;

import lombok.Data;
import pl.tiuprojekt.sandwitch.entity.Address;
import pl.tiuprojekt.sandwitch.entity.Order;
import pl.tiuprojekt.sandwitch.entity.OrderItem;
import pl.tiuprojekt.sandwitch.entity.User;

import java.util.Set;

@Data
public class Purchase {
    private User customer;
    private Address orderAddress;
    private Order order;
    private Set<OrderItem> orderItems;
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Address getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(Address orderAddress) {
		this.orderAddress = orderAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
}
