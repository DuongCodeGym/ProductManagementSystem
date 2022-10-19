package TDDProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String roman) {

        int i = 0;
        String s;
        int result = 0;
        while(i<roman.length()){
            if(i>=roman.length()-1) {
                s = roman.substring(i,i+1);
            }
            else s = roman.substring(i,i+2);
           if(isValidTwoChar(s)){
               result += twoChar(s);
               i+=2;
           }
           else{
               result += oneChar(s.substring(0,1));
               i++;
           }
        }

        return result;
    }
    Map<Character,Integer> lists = new HashMap<>();

    public int romanToInt2(String roman){
        buildMap();
        char after = roman.charAt(roman.length()-1);
        int result = lists.get(after);
        for(int i = roman.length()-2;i>=0;i--){
            char curr = roman.charAt(i);
            if(lists.get(curr) < lists.get(after)) result -= lists.get(curr);
            else result += lists.get(curr);
            after = curr;
        }
    return result;
    }

    private void buildMap() {
        lists.put('I',1);
        lists.put('V',5);
        lists.put('X',10);
        lists.put('L',50);
        lists.put('C',100);
        lists.put('D',500);
        lists.put('M',1000);


    }

    public int oneChar(String s) {
        if(s.length() > 1) return 0;
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:return 0;
        }

    }
    public int twoChar(String s) {
        switch (s) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "CD":
                return 400;
            case "CM":
                return 900;
            case "XL":
                return 40;
            case "XC":
                return 90;
            default: return 0;
        }
    }

    public boolean isValidTwoChar(String s) {
        switch (s) {
            case "IV":

            case "IX":

            case "CD":

            case "CM":
                case "XL":

            case "XC":
                return true;
            default: return false;
        }
    }

}
