package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;
RequestMapping("/all")
    public @ResponseBody List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
