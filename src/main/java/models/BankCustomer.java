package models;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class BankCustomer {
    private String id;
    private String name;
    private String agencyNumber;
    private String accountNumber;
    private BigDecimal balance;
}
