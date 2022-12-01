package apis;

import data.CardDetails;
import data.Ticket;
import payments.ParkingFeeProcessor;
import payments.PaymentMode;
import payments.PaymentProcessor;
import payments.PaymentProcessorFactory;

import java.util.Map;

public class PayParkingFeesAPI {

    public boolean payParkingFee(Ticket ticket, PaymentMode paymentMode,
                                 Map<String,String> paymentDetails){


        PaymentProcessor paymentProcessor = null;

        if(paymentProcessor.equals(PaymentMode.CARD)){
            double amount = Double.parseDouble(paymentDetails.get("Amount"));
            CardDetails cardDetails = null;
            //logic to create above object
            paymentProcessor = PaymentProcessorFactory.getCardBasedPaymentProcessor(amount,
                    cardDetails);
        }else if(paymentMode.equals(PaymentMode.CASH)){

            double amount = Double.parseDouble(paymentDetails.get("Amount"));
            CardDetails cardDetails = null;
            //logic to create above object
            paymentProcessor = PaymentProcessorFactory.getCashBasedPaymentProcessor(amount);
        }
        else {
            new IllegalArgumentException("");
        }

        return new ParkingFeeProcessor().processParkingFees(ticket, paymentProcessor);

    }
}
