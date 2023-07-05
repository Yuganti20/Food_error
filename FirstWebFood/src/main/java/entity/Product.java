package entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_product")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name = "unit_price")
    private double unit_price;

    @Column(name = "available")
    private boolean available;

    @Column(name = "image_url")
    private String imgUrl;


    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;


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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getUnit_price() {
		return unit_price;
	}


	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Product(Long id, String name, String description, double unit_price, boolean available, String imgUrl,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.unit_price = unit_price;
		this.available = available;
		this.imgUrl = imgUrl;
		this.category = category;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
