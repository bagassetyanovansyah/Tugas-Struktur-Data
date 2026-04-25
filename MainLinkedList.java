import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.println("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Buku: ");
                    String kode = sc.nextLine();

                    if (kode.length() > 5) {
                        System.out.println("Kode maksimal 5 karakter!");
                        break;
                    }

                    System.out.print("Judul: ");
                    String judul = sc.nextLine();

                    System.out.print("Penulis: ");
                    String penulis = sc.nextLine();

                    list.tambahBuku(kode, judul, penulis);
                    break;
                
                case 2:
                    list.hapusBuku();
                    break;
                
                case 3:
                    System.out.print("Masukkan kode: ");
                    list.cariBuku(sc.nextLine());
                    break;
                
                case 4:
                    list.tampilkan();
                    break;
            }
        } while (pilihan != 5);
    }
}