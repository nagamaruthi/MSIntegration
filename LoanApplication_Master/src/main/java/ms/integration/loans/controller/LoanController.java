package ms.integration.loans.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoanController {
	@RequestMapping("/")
    public String index() {
        callHelperMicroService ();
		return "response from master microservices";
    }

	private void callHelperMicroService() {

		RestTemplate restTemplate = new RestTemplateBuilder()
	            .rootUri("http://localhost:9080")
	            .build();
		String response= restTemplate.getForObject("/helper", String.class);
		System.out.println(response);
		System.out.println("Added new functionality");
	}
	
	
}
