package org.example;

    public class ZeroDivisionExample {

        public static void main(String[] args) {
            int sayi = 10;
            int bolen = 0;

            try {
                int result = bolunenSayi(sayi, bolen);
                System.out.println("Result: " + result);
            } catch (DivisionByZeroException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public static int bolunenSayi(int sayi, int bolen) throws DivisionByZeroException {
            if (bolen == 0) {
                throw new DivisionByZeroException("Sıfıra bölünemez");
            }
            return sayi / bolen;
        }
    }

