public class BasicOperations {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3

        System.out.println("1 + 2 = " +  result ) ;

        int previousResult = result ;

        System.out.println("previousResult = " + previousResult ) ;

        result = result - 1 ; // 3 - 1 = 2

        System.out.println("3 - 1 = " + result ) ;

        System.out.println("previousResult = " + previousResult ) ;

        result = result * 5;    // 2 * 5 = 10

        System.out.println("2 * 5 = " + result);

        System.out.println("previousResult = " + previousResult ) ;

        result = result / 10;   // 10 / 10 = 1

        System.out.println("10 / 10 = " + result);

            // result = result + 1

        result++ ;  // 1 + 1 = 2

        System.out.println("1 + 1 = " + result);

        result-- ;  //2 - 1 = 1

        System.out.println("2 - 1 = " + result) ;

            // result = result + 2
        result += 2 ;   //1 + 2 = 3

        System.out.println("1 + 2 = " + result);

            // result = result * 10

        result *= 10 ;  //3 * 10 = 30

        System.out.println("3 * 10 = " + result);

    }
}
