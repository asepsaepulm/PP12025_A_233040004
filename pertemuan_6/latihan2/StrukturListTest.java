package pertemuan_6.latihan2;

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

        list.addHead(6); //Menambahkan elemen 6 di awal list
        list.addHead(2); //Menambahkan elemen 2 di awal list
        list.addTail(5); //Menambahkan elemen 5 di akhir list
        list.addTail(1); //Menambahkan elemen 1 di akhir list
        list.addMid(3, 3); //Menyisipkan elemen 3 di posisi ketiga
        list.displayElement(); //Menampilkan isi list
        System.out.println(""); //Mencetak 1 baris kosong
        list.removeMid(3); //Menghapus elemen 3 dari tengah
        list.displayElement(); //Menampilkan isi list
        System.out.println(""); //Mencetak 1 baris kosong
        list.removeMid(6); //Menghapus elemen 6 dari tengah
        list.removeMid(5); //Menghapus elemen 5 dari tengah
        list.displayElement(); //Menampilkan isi list
    }
}