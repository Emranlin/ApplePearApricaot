import java.util.Scanner;

public class Apple {

        private String name;
        private int price;
        private int totalWeight;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getTotalWeight() {
            return totalWeight;
        }

        public void setTotalWeight(int totalWeight) {
            this.totalWeight = totalWeight;
        }
        public void sellingFruits(){
            System.out.println(name+" is selling "+price+"som per killo.");

        }
        Scanner scanner=new Scanner(System.in);
        int kg=scanner.nextInt();
        public void moneyOfSelling(){
            System.out.println("Total summa:"+kg*price);






            }



        }
