import java.util.Scanner;

public class NedenKodYok{
    public static void main(String[] args) {

        int kodYazılmaSaati = 23 ;

            boolean kodSaat = kodYazılmaSaati == 20 ? true : false ;
                System.out.println("Yazdım daha ne yazayım " + kodSaat);

                if (!kodSaat) {
                    System.out.println("Gündüz çalısıyordum aksam oyundaydım :( ");
                }
        //VEYAHUT

        Scanner s = new Scanner(System.in);

                System.out.println("Kod Yazılmadan Geçen Süreyi Giriniz! " );

                int kodyazılmasaati2 = s.nextInt() ;

                if (kodyazılmasaati2 < 20 ) {

                    System.out.println("Yazmışım İşte Hocam");
                }
                else if (kodyazılmasaati2 ==20 ) {

                    System.out.println("Şimdi Bitti Hocam! ");
                }
                else  {

                    System.out.println("Gündüz Çalıştım Akşam Oyun Oynadım Hocam :( ");
                }
    }
}

