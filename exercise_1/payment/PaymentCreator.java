package pl_java.interface_.exercise_1.payment;


public class PaymentCreator {
    public static Payable getPaymentProvider(int paymentType) {
        switch (paymentType) {
            case 1: // "DEBIT CARD"
                return new DebitCard();
            case 2: // "NET BANKING"
                return new NetBanking();
            case 3: // "UPI"
                return new UPI();
            case 4: // "PAYTM_WAllet"
                return new Paytm();
            default:
                return null;
        }
    }
}
