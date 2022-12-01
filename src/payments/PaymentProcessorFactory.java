package payments;

import data.CardDetails;

public class PaymentProcessorFactory {

    private PaymentProcessorFactory(){};

    public static PaymentProcessor getCardBasedPaymentProcessor(double amount, CardDetails cardDetails){

        return new CardPaymentProcessor(amount,cardDetails);
    }

    public static PaymentProcessor getCashBasedPaymentProcessor(double amount){
        return new CashPaymentProccessor(amount);
    }
}
