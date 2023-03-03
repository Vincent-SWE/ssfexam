package ssf.exam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import ssf.exam.models.Item;
import ssf.exam.services.ItemService;
import ssf.exam.models.ShippingAddress;


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

    @PostMapping(path="/view2")
    public String postCart(Model model, HttpSession sess, 
    @Valid Item itemName, BindingResult bindings) {

        if (bindings.hasErrors())
            return "view2";

        sess.setAttribute("item", itemName);
        model.addAttribute("shippingaddress", new ShippingAddress());

        return "view2";
    }

    
}
