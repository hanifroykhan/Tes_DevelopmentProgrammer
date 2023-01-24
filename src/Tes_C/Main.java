package Tes_C;

import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan teks : ");
        String teks = in.nextLine();
        String[] kata = teks.split("");
        System.out.println("======HASIL======");
        for (int counter = 0;counter< kata.length;counter++){
            System.out.println(kata[counter] + " : 1");
        }

    }
}
