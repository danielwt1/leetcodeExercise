package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        //Input "III"
        String input = "IV";
        int result = romanToInteger.romanToInt(input);
        System.out.println(result);
    }

    public int romanToInt(String s) {
        // get initial values
        Map<String, Integer> romanMap = getInitialValue();
        int result = 0;
        int lastValue = 0;
        int currentValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (lastValue == 0) {
                lastValue = romanMap.get(String.valueOf(s.charAt(i)));
                result += lastValue;
            } else {
                currentValue = romanMap.get(String.valueOf(s.charAt(i)));
                if (currentValue < lastValue) {
                    result -= currentValue;
                }else{
                    result += currentValue;
                    lastValue = currentValue;
                }
            }


        }
        return result;
    }


    public Map<String, Integer> getInitialValue() {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        return romanMap;
    }
}
