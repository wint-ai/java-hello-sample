package ai.wint.javasample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping("/hello")
    public ResponseSample hello() {
        return new ResponseSample("Hello World!", profile);
    }

    private record ResponseSample(String msg,
                                  String env) {
    }
}
