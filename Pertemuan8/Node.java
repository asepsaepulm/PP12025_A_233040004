package Pertemuan8;
import Pertemuan8.Latihan1.Matakuliah;

public class Node {
    private Matakuliah data;
    private Node next;

    /** Inisialisasi atribut node */
    public Node (Matakuliah data) {
        this.data = data;
    }

    /** Setter & Getter */
    public Matakuliah getData() {
        return data;
    }

    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
