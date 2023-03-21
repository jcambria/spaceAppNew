package com.example.JAC.restControllers;

import com.example.JAC.Entities.Planet;
import com.example.JAC.Repos.PlanetRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
//@RequestMapping("https://images-api.nasa.gov/asset")
public class PlanetController {
    final private PlanetRepo planetRepo;
    final String nasaApi = "https://images-api.nasa.gov/asset/PIA04591";
    public PlanetController(final @Autowired PlanetRepo planetRepo) {
        this.planetRepo = planetRepo;
    }
    @Autowired
    private WebClient.Builder webClientBuilder;
    @GetMapping ("/asset/{nasa_id}")
    public String getPlanet(@PathVariable String nasaId){
       return webClientBuilder.build()
               .get()
               .uri(nasaApi)
               .retrieve()
               .bodyToMono(String.class)
               .block();
    }
}
