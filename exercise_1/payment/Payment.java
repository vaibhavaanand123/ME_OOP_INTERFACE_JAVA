package pl_java.interface_.exercise_1.payment;

public class Payment{
    /*
    .
    .
    Rest of the payment methods
    .
    .
    */
    public void PayWithUPI(){
      UPI upiPay = new UPI();
      upiPay.payWithUPI();
    }
    public void PayWithDebitCard(){
      DebitCard debitCardPay = new DebitCard();
      debitCardPay.payWithDebitCard();
    }
    public void PayWithNetBanking(){
      NetBanking netBankingPay = new NetBanking();
      netBankingPay.payWithNetBanking();
    }
    public void PayWithPaytmWallet(){
      Paytm paytmPay = new Paytm();
      paytmPay.payWithPaytmWallet();
    }
  }
