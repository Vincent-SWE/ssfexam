package ssf.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ssf.exam.services.ItemService;

@RestController
@RequestMapping(path="/quotation")
public class PurchaseRestController {
 
    @Autowired
    private ItemService itemSvc;

    @GetMapping(path="{quoteId}", produces = MediaType)



}
