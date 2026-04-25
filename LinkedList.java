class LinkedList {
    Node head;

    // Tambah di akhir
    void tambahBuku(String kode, String judul, String penulis) {
        Node newNode = new Node(kode, judul, penulis);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    // Hapus Terakhir
    void hapusBuku() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Data terakhir berhasil dihapus.");
    }

    // Cari Buku
    void cariBuku(String kode) {
        Node temp = head;
        while (temp != null) {
            if (temp.kodeBuku.equals(kode)) {
                System.out.println("Ditemukan: " + temp.judul + " - " + temp.penulis);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // Tampilkan Semua
    void tampilkan() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            System.out.println("Kode: " + temp.kodeBuku + " * Judul: " + temp.judul + " * Penulis: " + temp.penulis);
            temp = temp.next;
            count++;
        }
        System.out.println("Total Buku: " + count);
    }
}