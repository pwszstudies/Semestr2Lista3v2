package Zadanie1;

public class Operations {

    public String calculate (String inputString) {
        inputString = inputString.toLowerCase();
        String[] split = inputString.split("[kmclb]");
        int value = extractInt(split[0]);

        return convert(inputString, value);

    }

    private String convert (String inputString, int value) {
        double result;
        if (inputString.contains("km")) {
            result = value / 1.609344f;
            return String.format("%.2fmi", result);
        }
        else if (inputString.contains("mi")) {
            result = value * 1.609344f;
            return String.format("%.2fkm", result);
        }
        else if (inputString.contains("kg")) {
            result = value * 0.45359f;
            return String.format("%.2flb", result);
        }
        else if (inputString.contains("lb")) {
            result = value / 0.45359f;
            return String.format("%.2fkg", result);
        }
        return "Incorrect data";
    }


    private int extractInt(String s) {
        return Integer.parseInt(s.trim());
    }
}