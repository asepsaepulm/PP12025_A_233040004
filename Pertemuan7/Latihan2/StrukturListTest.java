package Pertemuan7.Latihan2;

import Pertemuan7.Node;

public class StrukturListTest {
    Node HEAD;

    public void addTail (int data) {
        Node posNode = null, curNode = null;

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public boolean find (int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData()==x)
                ketemu = true;
            else curNode = curNode.getNext();
        }
        return ketemu;
    }


    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public static void main(String[] args) {
        StrukturListTest list = new StrukturListTest();

        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.displayElement();
        System.out.println("\n" + list.find(6));
    }
}
