package ssf.exam.repositories;

import java.util.ArrayList;
import java.util.List;

import ssf.exam.models.Item;

import org.springframework.stereotype.Repository;



@Repository
public class ItemRepos {

    private List<Item> itemList;

        public List<Item> getCartItems() {

            itemList = new ArrayList<Item>();

            Item theItem = new Item();
            theItem.setItem("Orange");
            theItem.setQuantity(5);
            itemList.add(theItem);

            theItem = new Item();
            theItem.setItem("Bread");
            theItem.setQuantity(10);
            itemList.add(theItem);

            return itemList;

        }

    

}
