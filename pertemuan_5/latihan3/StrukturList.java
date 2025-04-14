package pertemuan_5.latihan3;

public class StrukturList {
    Node HEAD;

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

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

}