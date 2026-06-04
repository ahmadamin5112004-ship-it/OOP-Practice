package java_discussion10;




class Restaurant {

    protected double taxRate = 0.10; 

    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    public void estimateDeliveryTime() {
        System.out.println("Estimated Delivery Time: 40 minutes");
    }
}


class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant() {
        taxRate = 0.15; 
    }

    @Override
    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    @Override
    public void estimateDeliveryTime() {
        System.out.println("Estimated Delivery Time: 20 minutes");
    }
}


class FineDiningRestaurant extends Restaurant {

    @Override
    public void estimateDeliveryTime() {
        System.out.println("Estimated Delivery Time: 60 minutes");
    }
}

public class User {
       public static void main(String[] args) {

        Restaurant r1 = new FastFoodRestaurant();
        Restaurant r2 = new FineDiningRestaurant();

        double foodPrice = 1000;

        System.out.println("Fast Food Restaurant");
        System.out.println("Total Bill: $" +
                r1.calculateTotalBill(foodPrice));
        r1.estimateDeliveryTime();

        System.out.println();

        System.out.println("Fine Dining Restaurant");
        System.out.println("Total Bill: $" +
                r2.calculateTotalBill(foodPrice));
        r2.estimateDeliveryTime();
    }
}
