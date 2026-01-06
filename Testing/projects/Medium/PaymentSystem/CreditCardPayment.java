package Testing.projects.Medium.PaymentSystem;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("\nPaid : %.2f | Using Credit Card", amount);
    }
}
