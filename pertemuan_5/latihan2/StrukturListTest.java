package pertemuan_5.latihan2;

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

        list.addHead(2); // Menambahkan elemen 2 di awal list
        list.addHead(9); // Menambahkan elemen 9 di awal list
        list.addHead(7); // Menambahkan elemen 7 di awal list
        list.displayElement(); // Menampilkan isi list
        System.out.println(""); // Mencetak 1 baris kosong
        list.removeHead(); // Menghapus elemen pertama
        list.displayElement(); // Menampilkan isi list
        System.out.println("");
        list.removeHead();
        list.removeHead();
        list.removeHead();
        list.displayElement();
    }
}