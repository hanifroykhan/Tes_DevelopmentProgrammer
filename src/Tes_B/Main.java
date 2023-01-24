package Tes_B;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan teks : ");
        String teks = in.nextLine();
        System.out.println("Masukkan kata yang ingin di cocokkan : ");
        String kata = in.nextLine();
        int total = 0;
        int hasil;
        hasil = teks.indexOf(kata);
        while (hasil >= 0)
        {
            ++ total;
            hasil += kata.length();
            hasil = teks.indexOf(kata, hasil);
        }
        System.out.println("Teks berisi kata " + kata + " sebanyak " + total);
    }
}



