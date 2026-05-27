package az.shopery.payment_ms.controller;

import az.shopery.payment_ms.model.dto.response.StripeCheckoutResponseDto;
import az.shopery.payment_ms.model.dto.shared.SuccessResponse;
import az.shopery.payment_ms.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/stripe/checkout")
    public ResponseEntity<SuccessResponse<StripeCheckoutResponseDto>> createCheckoutSession(String email) {
        return ResponseEntity.ok(paymentService.createCheckoutSession(email));
    }

    @PostMapping("/stripe/webhook")
    public ResponseEntity<SuccessResponse<Void>> stripeWebhook(@RequestBody String payload, @RequestHeader("Stripe-Signature") String signatureHeader) {
        return ResponseEntity.ok(paymentService.handleStripeWebhook(payload, signatureHeader));
    }
}
