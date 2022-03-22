package devoteam.training.javaoneforall.javacore.Kenum.test;

import devoteam.training.javaoneforall.javacore.Kenum.domain.Customer;
import devoteam.training.javaoneforall.javacore.Kenum.domain.CustomerType;
import devoteam.training.javaoneforall.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Timmy", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Wendy", CustomerType.COMPANY, PaymentType.CREDIT);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType.getReportValue());

    }
}
