public class CalculateInterest {
    public static void main(String[] args) {


        for (int i = 8; i > 0; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }
    public static double calculateInterest ( double amount, double interestrate){
        return (amount * (interestrate / 100));
    }
    }

