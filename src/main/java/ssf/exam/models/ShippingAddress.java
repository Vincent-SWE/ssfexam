package ssf.exam.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ShippingAddress {
    
    @NotNull(message = "Please enter your name")
    @Size(min = 2, message = "Your name must contain at least 2 characters")
    private String name;

    @NotNull(message = "Please enter your address")
    @Size(min = 2, message = "Your address must contain at least 2 characters")
    private String address;

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    
    

}
