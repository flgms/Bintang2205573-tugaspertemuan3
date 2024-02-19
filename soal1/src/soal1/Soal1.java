package soal1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //deklarasi variabel
        int bil1,bil2,bil3;
        char operasi;
        int hasil;
        
        //input
        System.out.print("Masukan bilangan pertama: ");
        bil1 = scanner.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        bil2 = scanner.nextInt();
        System.out.print("Masukan bilangan ketiga: ");
        bil3 = scanner.nextInt();
        System.out.print("Masukan operasi (+,-,*,/): ");
        operasi = scanner.next().charAt(0);
        
        //proses
        switch (operasi) {
            case '+':
                hasil = bil1 + bil2 + bil3;
                break;
            case '-':
                hasil = bil1 - bil2 - bil3;
                break;
            case '*':
                hasil = bil1 * bil2 * bil3;
                break;
            case '/':
                hasil = bil1 / bil2 / bil3;
                break;
            default:
                System.out.println("Operasi tidak valid!");
                return;
        }
        //output 
        System.out.println("Hasil operasi " + bil1 + " " + operasi + " " + bil2 + " " + operasi + " " + bil3 + " = " + hasil);
    }
}
