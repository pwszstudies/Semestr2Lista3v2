package Zadanie3;


public class InputMoney {


    public void inputCoin(TradeSession tradeSession, String coin) {
        if (validateInput(coin)) {
            tradeSession.addCoin(coin);
            System.out.println("Inserted " + coin );
        }
        else {
            System.out.println("Inserted coin is not accepted in this vending machine(" + coin +").");
        }
    }

    public Boolean validateInput(String coin) {
         String[] validCoins = {"5zl", "2zl", "1zl", "50gr", "20gr", "10gr"};
        for (String validCoin : validCoins) {
            if (coin.toLowerCase().equals(validCoin)) return true;
        }
        return false;
    }

}
