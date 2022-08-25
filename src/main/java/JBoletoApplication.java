import models.BankCustomer;
import models.InvalidDueDateException;
import models.PaymentSlip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class JBoletoApplication {

    public static void main(String[] args) {

        PaymentSlip paymentSlip1 = new PaymentSlip();
        paymentSlip1.setId(UUID.randomUUID().toString());
        paymentSlip1.setDueDate(checkValidDate(LocalDate.now().plusMonths(1));
        paymentSlip1.setValue(new BigDecimal("299.99"));
        paymentSlip1.setPayer(new BankCustomer(paymentSlip1.getId(), ""));
        paymentSlip1.setPayee(new BankCustomer());

    }

    private static PaymentSlip generate(PaymentSlip paymentSlip) {

    }

    private static LocalDate checkValidDate(LocalDate inicialDate){
        if(inicialDate.isBefore(LocalDate.now())){
            throw new InvalidDueDateException("Date is before");
        }
        return inicialDate;
    }


}
