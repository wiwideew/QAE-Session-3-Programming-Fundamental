package javaprogram;
import java.util.Scanner;

public class Segitiga {
    public static void main (String[] args){
        int input;
        Scanner inputJumlah = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        input = inputJumlah.nextInt();

        for (int i = 0; i < input * 2; i++) {
            if (i < input) {
                // Bagian pertama (pola menurun)
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else if (i==input) {
                    continue;
            } else {
                // Bagian kedua (pola menaik)
                for (int j = 0; j < input * 2 - i  ; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
