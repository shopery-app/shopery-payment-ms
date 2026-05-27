package az.shopery.payment_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableJpaAuditing
@SpringBootApplication
public class PaymentMsApplication {

	static void main(String[] args) {
		SpringApplication.run(PaymentMsApplication.class, args);
	}
}
