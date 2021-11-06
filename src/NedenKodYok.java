import java.util.Scanner;

public class NedenKodYok{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int kodYazilmaSaati = s.nextInt() ;

            boolean kodSaat = kodYazilmaSaati == 20 ? true : false ;
                System.out.println("Yazdım daha ne yazayım " + kodSaat);

                if (!kodSaat) {
                    System.out.println("Gündüz çalısıyordum aksam oyundaydım :( ");
                }
        //VEYAHUT

        Scanner y = new Scanner(System.in);

                System.out.println("Kod Yazılmadan Geçen Süreyi Giriniz! " );

                int kodyazilmasaati2 = s.nextInt() ;

                if (kodyazilmasaati2 < 20 ) {

                    System.out.println("Yazmışım İşte Hocam");
                }
                else if (kodyazilmasaati2 ==20 ) {

                    System.out.println("Şimdi Bitti Hocam! ");
                }
                else  {

                    System.out.println("Gündüz Çalıştım Akşam Oyun Oynadım Hocam :( ");
                }
    }
}

