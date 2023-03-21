package restControllers;

import Repos.PlanetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {
    final private PlanetRepo planetRepo;
    public PlanetController(final @Autowired PlanetRepo planetRepo) {
        this.planetRepo = planetRepo;
    }
    @GetMapping ("https://images-api.nasa.gov/asset/{nasa_id}")
    public void getPlanet(){

    }
}
