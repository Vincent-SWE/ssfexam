package ssf.exam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import ssf.exam.models.Item;
import ssf.exam.services.ItemService;


@Controller
public class PurchaseOrderController {
    
    @Autowired
    ItemService itmSvc;


    @GetMapping(path={"/", "/view1.html"})
    public String getView1(Model model, HttpSession sess) {
        List<Item> items = itmSvc.retrieveItemList();
        sess.invalidate();
        model.addAttribute("cartItems", items);
        return "view1";

    }


    
}
