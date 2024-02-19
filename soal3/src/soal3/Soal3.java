package soal3;

public class Soal3 {
    public static void main(String[] args) {
       char karakter1 = '1';
        char karakter2 = '2';

        int kodeAscii1 = (int) karakter1;
        int kodeAscii2 = (int) karakter2;

        int jumlahKodeAscii = kodeAscii1 + kodeAscii2;

        System.out.println("Kode ASCII dari karakter '1' adalah: " + kodeAscii1);
        System.out.println("Kode ASCII dari karakter '2' adalah: " + kodeAscii2);
        System.out.println("Jumlah kode ASCII dari karakter '1' dan '2' adalah: " + jumlahKodeAscii);
    }
    
}
