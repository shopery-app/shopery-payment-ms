package az.shopery.payment_ms.service;

import az.shopery.payment_ms.model.dto.response.StripeCheckoutResponseDto;
import az.shopery.payment_ms.model.dto.shared.SuccessResponse;

public interface PaymentService {
    SuccessResponse<StripeCheckoutResponseDto> createCheckoutSession(String userEmail);
    SuccessResponse<Void> handleStripeWebhook(String payload, String signatureHeader);
}
