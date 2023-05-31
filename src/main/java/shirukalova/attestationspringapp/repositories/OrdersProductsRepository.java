package shirukalova.attestationspringapp.repositories;

import shirukalova.attestationspringapp.embeddable.OrdersProductsKey;
import shirukalova.attestationspringapp.entities.OrdersProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersProductsRepository extends JpaRepository<OrdersProductsEntity, OrdersProductsKey> {

}
