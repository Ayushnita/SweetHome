package com.sweethome.paymentservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum BookingMode {

UPI("upi"), NET_BANKING("net_banking"), CREDIT_CARD("credit_card"), DEBIT_CARD("debit_card");
	
	private String text; 
	
	
	
	private BookingMode(String text) {
		this.text = text;
	}


	@JsonValue
    public String getText(){return this.text;}
	
    @JsonCreator
    public static BookingMode fromText(String text){
        for(BookingMode r : BookingMode.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }

	@Override
	public String toString() {
	    return text;
	}
	
}
