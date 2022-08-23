import models.BankCustomer;
import models.PaymentSlip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class JBoletoApplication {

    public static void main(String[] args) {

        PaymentSlip paymentSlip1 = new PaymentSlip();
        paymentSlip1.setId(UUID.randomUUID().toString());
        paymentSlip1.setDueDate(LocalDate.now().plusMonths(1));
        paymentSlip1.setValue(new BigDecimal("299.99"));
        paymentSlip1.setPayer(new BankCustomer(paymentSlip1.getId(), ""));
        paymentSlip1.setPayee(new BankCustomer());

    }

    private static PaymentSlip generate(PaymentSlip paymentSlip) {

    }
}
