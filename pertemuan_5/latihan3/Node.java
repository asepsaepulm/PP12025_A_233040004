package pertemuan_5.latihan3;

public class Node {
    public int data;
    public Node next;

    /** Inisialisasi atribut node */
    public Node(int data) {
        this.data = data;
    }

    /** Setter & Getter */
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}