package payments;

public interface PaymentProcessor {

    public boolean executePayment();

    public double getAmount();
}
