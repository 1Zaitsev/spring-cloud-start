package pringcloud.productprovider.services;

import com.flamexander.spring-cloud.product-common.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pringcloud.productprovider.entities.Product;
import pringcloud.productprovider.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts(){
        return productRepository.findAllBy();
    }
}
