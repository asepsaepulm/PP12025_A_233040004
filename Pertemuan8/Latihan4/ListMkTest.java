package Pertemuan8.Latihan4;

import Pertemuan8.Latihan1.Matakuliah;
import Pertemuan8.Node;

public class ListMkTest {
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

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData().getKode()+" "+curNode.getData().getNama()+" "+curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return (HEAD == null);
    }

    public static void main(String[] args) {
        ListMkTest list = new ListMkTest();

        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.displayElement();
    }
}
