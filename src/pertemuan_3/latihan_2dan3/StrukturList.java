package pertemuan_3.latihan_2dan3;

import pertemuan_3.latihan_1.Node;


public class StrukturList {

    Node HEAD;
    public void addTail(int data)
    {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

        public void displayElement() {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.print(curNode.getData()+ " ");
                curNode = curNode.getNext();
            }
        }
    }

