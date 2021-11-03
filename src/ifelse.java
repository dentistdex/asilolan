import java.util.Scanner;


public class ifelse {
        public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
            System.out.println("Lütfen Notu Giriniz!");
            int not =s.nextInt();

            if(not>=90) {
                System.out.println("AA");
            }
            else if(not>=80 && not<90) {
                System.out.println("NOTUNUZ = BB");
            }
            else if(not>=70 && not<80) {
                System.out.println("NOTUNUZ = CC");
            }
            else  {
                System.out.println("NOTUNUZ = FF");
            }

        }
        }

