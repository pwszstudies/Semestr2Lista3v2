package Zadanie3;

import java.util.Map;
import java.util.TreeMap;

public class TradeSession {
    private TreeMap<String, Integer> coinsInside;

    public TradeSession() {
        coinsInside = new TreeMap<>();
    }

    public void addCoin(String coinValue) {

        try {
            if (coinsInside.containsKey(coinValue)) {
                int temp = coinsInside.get(coinValue) + 1;
                coinsInside.put(coinValue, temp);
            }
            else {
                coinsInside.put(coinValue, 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public float sumCoins() {
        float sum = 0f;
        if (coinsInside.containsKey("5zl")) sum = sum + coinsInside.get("5zl") *5f ;
        if (coinsInside.containsKey("2z;")) sum = sum + coinsInside.get("2z;") *2f ;
        if (coinsInside.containsKey("1zl")) sum = sum + coinsInside.get("1zl") *1f;
        if (coinsInside.containsKey("50gr")) sum = sum + coinsInside.get("50gr") * 0.50f ;
        if (coinsInside.containsKey("20gr")) sum = sum + coinsInside.get("20gr") * 0.20f;
        if (coinsInside.containsKey("10gr")) sum = sum + coinsInside.get("10gr") * 0.10f;
        return sum;
    }

    public void cancelSession() {
        System.out.println("Returning coins: " + coinsInside.toString());
        coinsInside.clear();
    }

    public float buyItem (float price) {
        if (sumCoins() > price) {
            System.out.println("You paid " + price + "zl");
            System.out.println("Here is your spare change: " + (sumCoins()-price) + "zl");
            float spare = sumCoins()-price;
            coinsInside.clear();
            return spare;
        }
        else {
            System.out.println("You lack " + (price - sumCoins()) + "zl");
            return -1;
        }
    }

}
