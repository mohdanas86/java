package Testing.projects.Medium.PaymentSystem;

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(2000);

        payment = new UpiPayment();
        payment.pay(500);
    }
}
