package Testing.projects.Medium.PaymentSystem;

public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("\nPaid: %.2f | Using Upi", amount);
    }
}
