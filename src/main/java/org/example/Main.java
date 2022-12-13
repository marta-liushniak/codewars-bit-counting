package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
    public static int countBits(int n) {
        int count = 0;
        String binaryValue = Integer.toBinaryString(n);
        for (int i = 0; i < binaryValue.length(); i++) {
            if (binaryValue.charAt(i) == '1') {
                count++;
            }
        }
        return count;
        // or it's possible to simplify to: return Integer.bitCount(n);
    }
}
