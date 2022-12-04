public class MainApp {
    public static void main (String[] arg) throws Exception{
        Perangkat a = new Perangkat("A",4,1.80f);
        a.informasi();
        System.out.println();

        Laptop b = new Laptop("A",4,2.40f,true);
        b.informasi();
        b.bukaGame("Mobile Legends");
        b.kirimEmail("paiz@gmail.com");
        b.kirimEmail("paizz@gmail.com","paizzz@gmail.com");
        System.out.println();

        Handphone c = new Handphone("A",4,2.20f,false);
        c.informasi();
        c.telfon(123);
        c.kirimSMS(234);
        c.kirimSMS(345,456);
        System.out.println();
    }
}