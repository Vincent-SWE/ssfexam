package ssf.exam.controllers;

import java.io.Reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ssf.exam.services.ItemService;

@RestController
@RequestMapping(path="/quotation")
public class PurchaseRestController {
 
	@Autowired
	private ItemService itmSvc;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> Quotation(@RequestBody String payload) {

		Reader reader = new StringReader(payload);
		JsonReader jsonReader = Json.createReader(reader);
		JsonObject json = jsonReader.readObject();

		String quoteId = ;

		json = resp.toJson();

		return ResponseEntity.ok().body(json.toString());
	}

}
