public class DönemNotu {
    public static void main(String[] args) {

        boolean sinavaGirdimi = true ;
        int sozlu1 = 48;
        int sozlu2 = 78;
        int fİnal  = 85;
        sonucHesaplama(sinavaGirdimi,sozlu1,sozlu2,fİnal);

        sinavaGirdimi = false;
        //bu sınava girdimi kısmında false durumnda dönem tekrarı yazısını nasıl yazdırıcam?

        sonucHesaplama(sinavaGirdimi,sozlu1,sozlu2,fİnal);

    }

    public static double sonucHesaplama (boolean sinavaGirdimi,int sozlu1,int sozlu2,int fİnal) {
        double sonuc1 = sozlu1 * 0.25 + sozlu2 * 0.25 + fİnal * 0.5;
                System.out.println("NOTUNUZ = " + sonuc1);
        if (sonuc1 >= 85) {
            System.out.println("AA Tebrikler ");
        }
        else if (sonuc1 >= 70 && sonuc1 < 85 ) {
            System.out.println("BB");
        }
        else if(sonuc1 >= 50 && sonuc1 < 70) {
            System.out.println("CC");
        }
        else {
            System.out.println("Dönem Tekrarı");
        }

        return sonuc1;
    }


}

