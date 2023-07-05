package entity;

import jakarta.persistence.*;

@Entity
@Table(name="order_item")

public class OrderItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_item")
    private Long id ;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private double unit_price;

    @Column(name = "product_id")
    private int product_id;

    @ManyToOne
    @JoinColumn(name="order_id",nullable = false)
    private Order order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItem(Long id, int quantity, double unit_price, int product_id, Order order) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.product_id = product_id;
		this.order = order;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
