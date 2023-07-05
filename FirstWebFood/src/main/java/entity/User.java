package entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id ;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "phone_number")
    private int phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private Set<Order> orders = new HashSet<>();
    public void add(Order order) {

        if (order != null) {

            if (orders == null) {
                orders = new HashSet<>();
            }

            orders.add(order);
            order.setUser(this);
        }
    }
	public User(Long id, String name, String last_name, int phone_number, String email, String role,
			Set<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email = email;
		this.role = role;
		this.orders = orders;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
