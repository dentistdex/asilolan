public class TheSwitchStatement {
    public static void main(String[] args) {
        char charValue = 'G';
        switch (charValue) {
            case 'A':
                System.out.println("A Found");
                break;
            case 'B':
                System.out.println("B Found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " Found");
                break;
            default :
                System.out.println("Not Found");
        }
    }
}
