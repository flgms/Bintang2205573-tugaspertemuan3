package soal2;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input uang
        System.out.print("Masukkan jumlah uang yang Anda miliki: ");
        int uang = scanner.nextInt();

        // Meminta input kondisi cuaca
        System.out.print("Apakah hujan? (ya/tidak): ");
        String hujanStr = scanner.next();
        boolean hujan = hujanStr.equalsIgnoreCase("ya");

        // Periksa apakah uang lebih besar dari 5000 dan tidak hujan
        if (uang > 5000 && !hujan) {
            System.out.println("Anda akan keluar membeli gorengan.");
        } else {
            System.out.println("Anda tidak akan keluar membeli gorengan.");
        }
    }
    
}
