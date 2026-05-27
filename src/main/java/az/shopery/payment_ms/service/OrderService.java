package az.shopery.payment_ms.service;

import az.shopery.payment_ms.model.dto.response.OrderResponseDto;
import az.shopery.payment_ms.model.dto.shared.SuccessResponse;
import java.util.List;

public interface OrderService {
    SuccessResponse<List<OrderResponseDto>> checkoutFromCart(String userEmail);
}
