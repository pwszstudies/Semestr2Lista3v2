package Zadanie3;

import java.util.Map;
import java.util.TreeMap;

public class TradeSession {
    private TreeMap<String, Integer> coinsInside;

    public TradeSession() {
        coinsInside = new TreeMap<String, Integer>(){
            {
                put("5zl", 0);
                put("2zl", 0);
                put("1zl", 0);
                put("50gr", 0);
                put("20gr", 0);
                put("10gr", 0);
            }
        };
    }

    public TreeMap<String, Integer> getCoinsInside() {
        return coinsInside;
    }

    public float sumCoins() {

        return ((coinsInside.get("5zl") * 5f) +
                (coinsInside.get("2zl") * 2f) +
                (coinsInside.get("1zl") * 1f) +
                (coinsInside.get("50gr") * 0.50f) +
                (coinsInside.get("20gr") * 0.20f) +
                (coinsInside.get("10gr") * 0.10f));
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




}
