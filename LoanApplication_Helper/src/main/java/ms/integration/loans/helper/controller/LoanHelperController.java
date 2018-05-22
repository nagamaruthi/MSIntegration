package ms.integration.loans.helper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanHelperController {

	@RequestMapping(path = "/helper", method = RequestMethod.GET)
    public String index() {
        return "response from helper microservices";
    }
}
