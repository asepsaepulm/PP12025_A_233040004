package Pertemuan7.Latihan1;
import Pertemuan7.Node;

public class StrukturList {
    Node HEAD;

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
}
