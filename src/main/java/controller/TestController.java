package controller;

import org.apache.el.util.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/test")
    public String testForm() {
        try {
            String googleFormUrl = "https://docs.google.com/forms/u/0/d/e/1FAIpQLSdPll8FURnGkUxRGnMyn4ynnqsSo7lh6dyxqxE6eLy7fXVRsg/formResponse";
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("entry.419085668", "Phuongluong200");
            map.add("entry.1179140125", "Phuong by code200");
            map.add("entry.2007674661", "");
            map.add("entry.1124823751", "test demo200");
            // The complete http request body.
            HttpEntity<MultiValueMap<String, String>> requestEntity
                    = new HttpEntity<>(map, headers);
            ResponseEntity<String> response =
                    restTemplate.exchange(googleFormUrl, HttpMethod.POST, requestEntity, String.class);
            return response.getBody();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return null;
    }
}
