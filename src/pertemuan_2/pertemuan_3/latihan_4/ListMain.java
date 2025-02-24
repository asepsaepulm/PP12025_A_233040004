package pertemuan_3.latihan_4;

import pertemuan_3.latihan_2dan3.StrukturList;

public  class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        System.out.println("Elemen :");
        list.displayElement();
    }
}