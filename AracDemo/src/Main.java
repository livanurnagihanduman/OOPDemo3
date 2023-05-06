public class Main {
    public static void main(String[] args) {
        System.out.println("***************************\n" +
                "ARACDEMO PROGRAMINA HOŞGELDİNİZ!\n" +
                 "******************************\n");
        AracDemo a1  = new AracDemo(4,"Peugeout",10,"Araba");
        a1.getir();
        a1.getir2();

        BikeDemo b1 = new BikeDemo(2,"KubaMotor",20,"Motorsiklet",4);
        b1.getir4();

        CarDemo c1 = new CarDemo(4,"TOGG",20,"Araba",4);
        c1.getir3();
        c1.getir2();
        c1.getir();

        TirDemo d1 = new TirDemo(6,"FİAT",10,"TIR",3);
        d1.getir5();
        d1.getir();
        d1.getir2();






    }
}