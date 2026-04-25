class Queue {
    Node front, rear;
    int size = 0;

    void enqueue(String kode, String nama, int total) {
        if (size >= 5) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node newNode = new Node(kode, nama, total);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Data masuk antrian!");
    }

    Node dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Node temp = front;
        front = front.next;

        if (front == null) rear = null;

        size--;
        return temp;
    }

    void tampilkan() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.kode + " - " + temp.nama);
            temp = temp.next;
        }
    }
}