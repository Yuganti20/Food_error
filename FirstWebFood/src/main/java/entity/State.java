package entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="state")

public class State
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_state")
    private Long id ;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "state")
    private List<Address> addressList;

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

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public State(Long id, String name, List<Address> addressList) {
		super();
		this.id = id;
		this.name = name;
		this.addressList = addressList;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
