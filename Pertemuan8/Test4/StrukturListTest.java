package Pertemuan8.Tes4;

import Pertemuan8.Latihan1.Matakuliah;
import Pertemuan8.Node;

public class StrukturListTest {
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

    public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);

        if (HEAD == null || position <= 1) {
            newNode.setNext(HEAD);
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        Node prevNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        prevNode.setNext(newNode);
        newNode.setNext(curNode);
    }

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah: " + curNode.getData().getKode() + ", " + curNode.getData().getNama() + ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }

    public boolean isEmpty() {
        return (HEAD == null);
    }

    public static void main(String[] args) {

        StrukturListTest list = new StrukturListTest();

        list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 2);
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 2);
        list.displayElement();
    }
}
