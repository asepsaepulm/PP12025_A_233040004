package pertemuan_2;


public class Node {
    private int nilai;
    private Node next;

    //inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
    }

    //Seter & Getter
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



}