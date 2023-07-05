package DTO;

import lombok.Data;

@Data
public class PurchaseResponse {

    public PurchaseResponse(String orderTrackingNumber2, String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
		// TODO Auto-generated constructor stub
	}

//	public PurchaseResponse(String orderTrackingNumber2) {
//		// TODO Auto-generated constructor stub
//	}

//	public PurchaseResponse() {
//		super();
		// TODO Auto-generated constructor stub
//	}

	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}

	private final String orderTrackingNumber;
}
