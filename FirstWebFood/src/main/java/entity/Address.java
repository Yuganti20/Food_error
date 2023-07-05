package entity;
//Persistence Class
import jakarta.persistence.*;


@Entity
@Table(name="address")
public class Address
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_address")
  private Long id;
  @Column(name = "street")
  private String street;
  @Column(name = "zip_code")
  private String zip_code;
  @Column(name = "city")
  private String city;

  @ManyToOne
  @JoinColumn(name = "state")
  private State state;

  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

	public Address(Long id, String street, String zip_code, String city, State state) {
		super();
		this.id = id;
		this.street = street;
		this.zip_code = zip_code;
		this.city = city;
		this.state = state;
	}
	
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
  public String toString()
  {
      return "Address{" +
              "id=" + id +
              ", street='" + street + '\'' +
              ", zip_code='" + zip_code + '\'' +
              ", city='" + city + '\'' +
              ", state=" + state +
              '}';
  }


}
