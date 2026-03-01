package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static javax.management.Query.and;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "alice",
                "alice2@gmail.com",
                "+0 32442",
                LocalDate.of(2000, 1, 2)
        );
        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.valid(customer));
        CustomerRegistrationValidator.ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);
        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
