package shirukalova.attestationspringapp.repositories;

import shirukalova.attestationspringapp.entities.CartEntity;
import shirukalova.attestationspringapp.entities.ProductEntity;
import shirukalova.attestationspringapp.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    List<CartEntity> findAllByUserEntity(UserEntity userEntity);

    Optional<CartEntity> findByUserEntityAndProductEntity(UserEntity userEntity, ProductEntity productEntity);

    void deleteAllByUserEntity(UserEntity userEntity);
}
