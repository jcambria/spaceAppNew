package Repos;

import Entities.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepo extends CrudRepository<Planet,String> {
}
