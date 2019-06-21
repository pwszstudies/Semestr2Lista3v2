package Zadanie3.tests;

import Zadanie3.TradeSession;

public class MiscOperations {


    public void cancelSession(TradeSession session) {
        System.out.println("Returning coins: " + session.getCoinsInside().toString());
        session.getCoinsInside().clear();
    }

    public float buyItem (TradeSession session, float price) {
        if (session.sumCoins() > price) {
            System.out.println("You paid " + price + "zl");
            System.out.println("Here is your spare change: " + (session.sumCoins()-price) + "zl");
            float spare = session.sumCoins()-price;
            session.getCoinsInside().clear();
            return spare;
        }
        else {
            System.out.println("You lack " + (price - session.sumCoins()) + "zl");
            return -1f;
        }
    }
//    public float sumCoins(TradeSession session) {
//
//        return ((session.getCoinsInside().get("5zl") * 5f) +
//                (session.getCoinsInside().get("2zl") * 2f) +
//                (session.getCoinsInside().get("1zl") * 1f) +
//                (session.getCoinsInside().get("50gr") * 0.50f) +
//                (session.getCoinsInside().get("20gr") * 0.20f) +
//                (session.getCoinsInside().get("10gr") * 0.10f));
//    }

}
