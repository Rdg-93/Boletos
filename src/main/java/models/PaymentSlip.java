package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.With;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter @Setter
public class PaymentSlip {

    private String id;
    private LocalDate dueDate;
    private BankCustomer payer;
    private BankCustomer payee;
    private BigDecimal value;
    private String barcode;
}