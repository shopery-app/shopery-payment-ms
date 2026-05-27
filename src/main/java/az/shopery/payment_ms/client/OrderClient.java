package az.shopery.payment_ms.client;

import az.shopery.payment_ms.model.dto.response.OrderResponseDto;
import az.shopery.payment_ms.model.dto.shared.SuccessResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-ms", url = "${feign.client.config.order-ms.url}")
public interface OrderClient {

    @PostMapping("/api/v1/users/me/orders/checkout")
    ResponseEntity<SuccessResponse<List<OrderResponseDto>>> checkout(@RequestParam String email);
}
