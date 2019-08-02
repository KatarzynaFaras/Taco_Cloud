package pl.katarzynafaras.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.katarzynafaras.tacocloud.Order;


public interface OrderRepository
        extends CrudRepository<Order, Long> {

}
