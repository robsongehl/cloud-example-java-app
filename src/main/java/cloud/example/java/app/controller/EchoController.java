package cloud.example.java.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @GetMapping()
    public Mono<Map> redirect(@RequestParam String value) {
        Map<String, String> data = new HashMap<>();
        data.put("value", value);
        return Mono.just(data);

    }
}
