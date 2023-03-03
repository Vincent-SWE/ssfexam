package ssf.exam.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Item {

    @Pattern(regexp = "^(apple|orange|bread|cheese|chicken|mineral_water|instant_noodles)$", message = "We do not stock your requested item")
    private String itemName;

    @NotNull(message = "You must add at least 1 item")
    @Min(value = 1, message = "You must add at least 1 item")
    private Integer quantity;


    // Setters and Getters
    public void setItemName(String itemName) {this.itemName = itemName;}
    public String getItemName() {return itemName;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}


    
}