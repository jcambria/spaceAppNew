package restControllers;

import Entities.Planet;
import Repos.PlanetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class PlanetController {
    final private PlanetRepo planetRepo;
    final String nasaApi =  "https://images-api.nasa.gov/asset/{nasa_id}";
    public PlanetController(final @Autowired PlanetRepo planetRepo) {
        this.planetRepo = planetRepo;
    }
    @Autowired
    private WebClient.Builder webClientBuilder;
    @GetMapping ("/assets")
    public Planet getPlanet(){
       return webClientBuilder.build()
               .get()
               .uri(nasaApi)
               .retrieve()
               .bodyToMono(Planet.class)
               .block();
    }
}
