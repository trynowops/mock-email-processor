package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    public final static String API_KEY_NAME = "process-api-key";

    @PostMapping("/send_platform_order_summaries")
    public ResponseEntity<String> index(@RequestHeader(value = API_KEY_NAME, required = false) String apiKey) {

        if (apiKey == null) {
            return ResponseEntity.badRequest().body(String.format("Missing %s header", API_KEY_NAME));
        }

        return ResponseEntity.ok("");
    }

}
