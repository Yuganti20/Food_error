package entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "product_category")

public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_category")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> product;

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

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Category(Long id, String name, Set<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
