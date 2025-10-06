

// 2. WAP to accept selling price and cost price and find the profit or loss.

public class Q2_ProfitOrLoss {
    public static void main(String[] args) {

        int cost = 40;
        int selling = 10;

        if (selling > cost) {
            int profit = selling - cost;
            System.out.println("Profit: " + profit);
        } else if (cost > selling) {
            int loss = cost - selling;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}

