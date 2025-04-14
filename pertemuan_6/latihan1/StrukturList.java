package pertemuan_6.latihan1;

public class StrukturList {
    Node HEAD;

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

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

}