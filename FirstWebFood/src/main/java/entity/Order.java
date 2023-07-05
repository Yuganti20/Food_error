package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;


@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orders")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @Column(name ="date_created")
    @CreationTimestamp
    private Date date;

    @Column(name = "order_tracking_numer")
    private String order_tracking_number;

    @Column(name = "total_price")
    private double total_price;

    @Column(name = "total_quantity")
    private int total_quantity;

    @Column(name = "status")
    private boolean status;

    @Column(name = "address_id")
    private Long address_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_orders", referencedColumnName = "id_address")
    private Address address;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getOrder_tracking_number() {
		return order_tracking_number;
	}
	public void setOrder_tracking_number(String order_tracking_number) {
		this.order_tracking_number = order_tracking_number;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public int getTotal_quantity() {
		return total_quantity;
	}
	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private Set<OrderItem> orderItems = new HashSet<>();
    public void add(OrderItem item) {

        if (item != null) {
            if (orderItems == null) {
                orderItems = new HashSet<>();
            }

            orderItems.add(item);
            item.setOrder(this);
        }
        
        
        
    }
	public Order(Long id, User user, Date date, String order_tracking_number, double total_price, int total_quantity,
			boolean status, Long address_id, Address address, Set<OrderItem> orderItems) {
		super();
		this.id = id;
		this.user = user;
		this.date = date;
		this.order_tracking_number = order_tracking_number;
		this.total_price = total_price;
		this.total_quantity = total_quantity;
		this.status = status;
		this.address_id = address_id;
		this.address = address;
		this.orderItems = orderItems;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}