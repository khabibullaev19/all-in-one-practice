package javapractice.classandobjects;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("Apple",1.5,5);

        Item item2 = new Item();
        item2.setInfo("Pen",2.5,10);

        System.out.println(item1);
        System.out.println(item2);

    }

}
