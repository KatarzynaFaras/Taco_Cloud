package pl.katarzynafaras.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.katarzynafaras.tacocloud.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
