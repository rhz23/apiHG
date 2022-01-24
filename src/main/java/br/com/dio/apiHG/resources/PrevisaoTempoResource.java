package br.com.dio.apiHG.resources;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrevisaoTempoResource {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public String test(){
        return "OK";
    }
}
