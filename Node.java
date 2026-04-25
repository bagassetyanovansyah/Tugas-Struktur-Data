class Node {
    String kode, nama;
    int total;
    Node next;

    Node(String kode, String nama, int total) {
        this.kode = kode;
        this.nama = nama;
        this.total = total;
        this.next = null;
    }
}