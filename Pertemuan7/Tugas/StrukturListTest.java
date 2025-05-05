package Pertemuan7.Tugas;

import Pertemuan7.Node;

public class StrukturListTest {
    Node HEAD;

    public void addHead (int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        if (position == 1) {
            newNode.next = HEAD;
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
        prevNode.next = newNode;
        newNode.next = curNode;
    }

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

    public void removeHead() {
        if (HEAD == null) {
            System.out.println("List kosong");
        }
        else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (HEAD == null) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;

            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu == true) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void removeTail() {
        if (HEAD != null) {
            // Jika hanya satu elemen
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Node preNode = null;
                Node lastNode = HEAD;

                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
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

    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
        return jumlah;
    }

    public void clearList() {
        while (HEAD != null) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void displayElement() {
        if (HEAD == null) {
            System.out.println("List kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public static void main (String[] args) {

        StrukturListTest list = new StrukturListTest();
        list.addTail(1);
        list.addHead(3);
        list.addMid(7,2);
        list.addHead(4);
        list.addTail(9);
        list.addMid(8,4);
        list.displayElement();
        System.out.println("\n");
        list.clearList();
        list.displayElement();
    }

}
