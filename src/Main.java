public class Main {
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.setName("Apple");
        apple.setPrice(80);
        apple.setTotalWeight(100);
        System.out.println("Name of the fruit:\n"+apple.getName()+"\nPrice of the fruit:\n"+apple.getPrice()+"\nTotal weight of fruit:\n"+apple.getTotalWeight());
        apple.sellingFruits();
        apple.moneyOfSelling();
        System.out.println();

        Apricot apricot=new Apricot();
        apricot.setName("Appricot");
        apricot.setPrice(120);
        apricot.setTotalWeight(50);
        System.out.println("Name of the fruit:\n"+apricot.getName()+"\nPrice of the fruit:\n"+apricot.getPrice()+"\nTotal weight of fruit:\n"+apricot.getTotalWeight());
        apricot.sellingFruits();
        apricot.moneyOfSelling();
        System.out.println();

        Pear pear=new Pear();
        pear.setName("Pear");
        pear.setPrice(160);
        pear.setTotalWeight(200);
        System.out.println("Name of the fruit:\n"+pear.getName()+"\nPrice of the fruit:\n"+pear.getPrice()+"\nTotal weight of fruit:\n"+pear.getTotalWeight());
        pear.sellingFruits();
        pear.moneyOfSelling();

    }
}