import java.util.Scanner;
public class Tugas {
    
        static int totalRekursif(int angka[], int jumlah) {
        if (jumlah<0) {
            return (0);
        } else {
            return (angka[jumlah]+totalRekursif(angka, jumlah-1));
        }
    }

    static int totalIteratif(int angka[]) {
        int total=0;
        for (int i=0; i<angka.length; i++) {
            total+=angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung: ");
        int jumlah= sc.nextInt();

        int angka[]= new int[jumlah];
        for (int i=0; i<jumlah; i++) {
            System.out.print("Masukkan angka ke-"+(i+1)+": ");
            angka[i]= sc.nextInt();
        }

        int hasilRekursif= totalRekursif(angka, jumlah-1);
        System.out.println("Total (rekursif) dari "+jumlah+" angka yang dimasukkan adalah "+hasilRekursif);
        int hasilteratif= totalIteratif(angka);
        System.out.println("Total (iteratif) dari "+jumlah+" angka yang dimasukkan adalah "+hasilteratif);

        
    }
}
