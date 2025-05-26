package org.example;
public class Main {

    public static boolean checkForPalindrome(String x){
        String cleaned = x.toLowerCase().replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals((reversed));
    }

    public static String convertDecimalToBinary(int number){
        int remainder;
        StringBuilder binary = new StringBuilder();
        while(true){
            remainder = number % 2;
            binary.append(remainder);
            number = number / 2;
            if(number == 0){
                return binary.reverse().toString();
            }
        }

    }
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(convertDecimalToBinary(13));

    }

}