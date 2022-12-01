package payments;

public class CashPaymentProccessor implements PaymentProcessor{

    private final double amount;

    public CashPaymentProccessor(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean executePayment() {
        return false;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
