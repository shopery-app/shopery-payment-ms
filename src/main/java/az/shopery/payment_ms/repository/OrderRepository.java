package az.shopery.payment_ms.repository;

import az.shopery.payment_ms.model.entity.OrderEntity;
import az.shopery.payment_ms.model.entity.UserEntity;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
    @EntityGraph(attributePaths = {"items", "shop"})
    List<OrderEntity> findAllByUserOrderByCreatedAtDesc(UserEntity userEntity);
    List<OrderEntity> findAllByShopId(UUID id);
}