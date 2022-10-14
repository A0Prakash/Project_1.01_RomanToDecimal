import java.util.HashMap;

//I gained a refresher on hashmaps/hashing from this url: https://www.geeksforgeeks.org/hashing-in-java/
public class RomanToDecimal {

    /**
     * @author 26prakash
     * @version 10.11.2022
     */

    /**
     *romanToDecimal method of RomanToDecimal class.
     * Takes roman input and outputs its value.
     * @param roman String of input in roman.
     * @return int with value of roman, will return -1 if invalid
     */
    public static int romanToDecimal(String roman) {
        roman = roman.toUpperCase();
        //Parse roman letter by letter
        //find raw point value based on the letter
        //sum point values
        //return decimal value of roman
        //"XI" ==> 11
        //"IV" ==> 6
        //string.length()
        //array.length
        //list.size()
        HashMap<String, Integer> romanVals = new HashMap<>();

        romanVals.put("I", 1);
        romanVals.put("V", 5);
        romanVals.put("X", 10);
        romanVals.put("L", 50);
        romanVals.put("C", 100);
        romanVals.put("D", 500);
        romanVals.put("M", 1000);


        int sum = 0;
        for(int i = 0; i < roman.length(); i++) {
            String temp = roman.substring(i, i+1);
            if(romanVals.containsKey(temp)) {
                sum += romanVals.get(temp);
            } else {
                return -1;
            }
        }



        /*
        public boolean logicalRoman(String roman)   {
            return t/f
        }
        private static decimalToRoman(int decimal)  {
            String roman = "";
            while number > 0:
                is there 1000 in it
                roman += "W"
                decimal -=1000

        }
        */




        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;

        String roman3 = decimalToRoman(sum);

        if(!roman.equals(roman3))
            return -2;

        return sum;
    }


    /**
     * decimalToRoman method of the RomanToDecimal class
     * @param decimal takes an input of a decimal
     * @return produces output of a string with the roman numeral that represents the decimal
     */
    public static String decimalToRoman(int decimal){
        String roman2 = "";
        HashMap<Integer, String> romanVals = new HashMap<>();
        romanVals.put(1, "I");
        romanVals.put(4, "IV");
        romanVals.put(5, "V");
        romanVals.put(9, "IX");
        romanVals.put(10, "X");
        romanVals.put(40, "XL");
        romanVals.put(50, "L");
        romanVals.put(90, "XC");
        romanVals.put(100, "C");
        romanVals.put(400, "CD");
        romanVals.put(500, "D");
        romanVals.put(900, "CM");
        romanVals.put(1000, "M");

        int[] valsArr;
        valsArr = new int[14];

        valsArr[0] = 1000;
        valsArr[1] = 900;
        valsArr[2] = 500;
        valsArr[3] = 400;
        valsArr[4] = 100;
        valsArr[5] = 90;
        valsArr[6] = 50;
        valsArr[7] = 40;
        valsArr[8] = 10;
        valsArr[9] = 9;
        valsArr[10] = 5;
        valsArr[11] = 4;
        valsArr[12] = 1;

        for(int i = 0; i < 13; i++)   {

            while(decimal >= valsArr[i]) {
                roman2 += romanVals.get(valsArr[i]);
                decimal = decimal - valsArr[i];
            }
        }

        return roman2;
    }
    /**
     * Main method of the RomanToDecimal class.
     * @param args Command line arguments, if needed.
     */
    public static void main(String[] args) {

        System.out.println(decimalToRoman(14));
        for(String roman : args) {
            int decimal = romanToDecimal(roman);
            if(decimal == -1)
                System.out.println("Input: " + roman + " => output: invalid");
            else if(decimal == -2)
                System.out.println("Input: " + roman + " => output: logically incorrect");
            else
                System.out.println("Input: " + roman + " => output: " + decimal);

        }
    }
}
