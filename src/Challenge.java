public class Challenge {
    public static void main(String[] args) {

        double doubleValue = 20.00d ;

        double doubleValue2 = 80.00d ;

        double doubletotal = (doubleValue + doubleValue2) * 100.00 ;

        double doubleValueremainder = doubletotal % 40.00 ;

        boolean result = doubleValueremainder == 0 ? true : false ;
            System.out.println("my result = " + result);
            if (!result) {
                System.out.println("got some remainder");}
    }
}
