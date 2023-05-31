package shirukalova.attestationspringapp.repositories;

import shirukalova.attestationspringapp.entities.OrderEntity;
import shirukalova.attestationspringapp.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    List<OrderEntity> findAllByUserEntity(UserEntity userEntity);
}
