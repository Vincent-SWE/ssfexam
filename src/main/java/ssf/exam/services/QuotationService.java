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

        



        return null;
    }


}
