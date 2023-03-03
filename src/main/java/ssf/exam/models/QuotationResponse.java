package ssf.exam.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;


public class QuotationResponse {
    
	private String quoteId;
	private String message;

    public void setQuoteId(String quoteId) { this.quoteId = quoteId; }
	public String getquoteId() { return this.quoteId; }

	public void setMessage(String message) { this.message = message; }
	public String getMessage() { return this.message; }

	public JsonObject toJson() {
		return Json.createObjectBuilder()
			.add("quoteId", quoteId)
			.add("message", message)
			.build();
	}

}
