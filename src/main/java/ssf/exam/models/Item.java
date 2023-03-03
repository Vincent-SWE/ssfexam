package ssf.exam.models;


import java.io.StringReader;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonValue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Item {

    @Pattern(regexp = "^(apple|orange|bread|cheese|chicken|mineral_water|instant_noodles)$", message = "We do not stock your requested item")
    private String item;

    @NotNull(message = "You must add at least 1 item")
    @Min(value = 1, message = "You must add at least 1 item")
    private int quantity;


    // Setters and Getters
    public void setItem(String string) {this.item = string;}
    public String getItem() {return item;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}


    @Override
    public String toString() {
        return "Item{item=%s, quantity=%d}".formatted(item, quantity);
    }

    public static Item create(JsonObject json) {
        Item item = new Item();
        item.setItem(json.getString("item"));
        item.setQuantity(json.getInt("quantity"));
        return item;                        
    }

    public static JsonObject toJSON(String str) {
		JsonReader reader = Json.createReader(new StringReader(str));
		return reader.readObject();
    }
    
}
