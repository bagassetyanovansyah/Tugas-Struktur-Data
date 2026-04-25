class Stack {
    Node top;

    void push(Node data) {
        data.next = top;
        top = data;
    }

    void tampilkan() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.kode + " - " + temp.nama + " - " + temp.total);
            temp = temp.next;
        }
    }
}