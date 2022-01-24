package br.com.dio.apiHG.resources;

import br.com.dio.apiHG.models.PrevisaoTempoResponseModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrevisaoTempoResource {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test(){
        var cet =  PrevisaoTempoResponseModel.builder()
                .nomeCidade("São Paulo")
                .hora(16)
                .temperatura(23)
                .build();
        return ResponseEntity.ok(cet);
    }
}
