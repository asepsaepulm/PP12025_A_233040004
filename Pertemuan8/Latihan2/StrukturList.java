package Pertemuan8.Latihan2;
import Pertemuan8.Node;
import Pertemuan8.Latihan1.Matakuliah;

public class StrukturList {
    Node HEAD;

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }


    public boolean isEmpty() {
        return (HEAD == null);
    }

}
