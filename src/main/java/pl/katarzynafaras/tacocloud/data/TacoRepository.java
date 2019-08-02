package pl.katarzynafaras.tacocloud.data;


import org.springframework.data.repository.CrudRepository;
import pl.katarzynafaras.tacocloud.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
