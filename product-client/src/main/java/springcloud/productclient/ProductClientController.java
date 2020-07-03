package springcloud.productclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ProductClientController {
    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    @ResponseBody
    public List<ProductDTO> getProducts(){
        ResponseEntity response = restTemplate.exchange("http://localhost:8189/", HttpMethod.GET, null, List.class);
        return (List<ProductDTO>) response.getBody();
    }
}
