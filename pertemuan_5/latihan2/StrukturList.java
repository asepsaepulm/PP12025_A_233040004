package pertemuan_5.latihan2;

public class StrukturList {
    Node HEAD;

    // Konstruktor untuk inisialisasi linked list kosong
    public StrukturList() {
        this.HEAD = null;
    }

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

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}