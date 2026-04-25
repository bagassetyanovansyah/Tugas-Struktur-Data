import java.util.Scanner;

public class MainKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        Stack s = new Stack();

        int pilih;

        do {
            System.out.println("\n===== SISTEM KASIR =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.println("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
            case 1: 
                System.out.println("Kode: ");
                String kode = sc.nextLine();
                System.out.println("Nama: ");
                String nama = sc.nextLine();
                System.out.println("Total: ");
                int total = sc.nextInt();

                q.enqueue(kode, nama, total);
                break;
            
            case 2:
                Node pelanggan = q.dequeue();
                if (pelanggan != null) {
                    System.out.println("Melayani: " + pelanggan.nama);
                    s.push(pelanggan); 
                }
                break;
            
            case 3:
                q.tampilkan();
                break;

            case 4:
                s.tampilkan();
                break;
            }
        }while (pilih != 5);
    }
}