package ssf.exam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssf.exam.models.Item;
import ssf.exam.repositories.ItemRepos;

@Service
public class ItemService {
    
    @Autowired
    ItemRepos itmRepos;

    public List<Item> retrieveItemList() {
        return itmRepos.getCartItems();
    }



}
