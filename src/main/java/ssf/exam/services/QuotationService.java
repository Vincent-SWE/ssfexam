package ssf.exam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssf.exam.models.Quotation;
import ssf.exam.repositories.ItemRepos;

@Service
public class QuotationService {
    
    @Autowired
    private ItemRepos itemRepos;

    public Quotation getQuotations(List<String> itemList) throws Exception {

        float total = 0f;
        // switch case to calculate the cost here
        switch (item.getQuotation()) {
            case "apple":
            total += 0.3;
            break; 
            case "bread":
            total += 2.5;
            break; 
        }




        return null;
    }


}
