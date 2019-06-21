package Zadanie3;


import Zadanie3.tests.MiscOperations;

import java.util.Map;
import java.util.TreeMap;

public class vending {
    public static void main(String[] args) {
        Map<String, Float> products = new TreeMap<String, Float>() {
            {
                put("Coke", 2f);
                put("Orange Juice", 3f);
                put("Snickers", 1.80f);
                put("Chocolate Bar", 4.50f);
            }
        };

//        InputMoney inputMoney = new InputMoney();
//        TradeSession firstSession = new TradeSession();
//        inputMoney.inputCoin(firstSession, "50zl");
//        inputMoney.inputCoin(firstSession, "5zl");
//        inputMoney.inputCoin(firstSession, "5zl");
//        inputMoney.inputCoin(firstSession, "5zl");
//        inputMoney.inputCoin(firstSession, "50gr");
//        inputMoney.inputCoin(firstSession, "50gr");
//        inputMoney.inputCoin(firstSession, "50gr");
//        MiscOperations miscOperations = new MiscOperations();
//        System.out.println(miscOperations.sumCoins(firstSession));
//        miscOperations.buyItem(firstSession, products.get("Coke"));

        //miscOperations.cancelSession();
        //System.out.println(firstSession.sumCoins());


    }

    }

