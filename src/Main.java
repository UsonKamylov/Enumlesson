import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Season winter=Season.WINTER;
//        Season summer=Season.SUMMER;
//        Season spring=Season.SPRING;
//        Season autumn=Season.AUTUMN;
//
//
//        System.out.println(winter);
//        winter.method();
//        System.out.println(spring);
//        System.out.println(summer);
//        System.out.println(autumn);

        Scanner scanner=new Scanner(System.in);
        String soz= scanner.nextLine();
        Oblastar oblastar=Oblastar.valueOf(soz.toUpperCase());
        switch (oblastar){
            case BATKEN->  System.out.println(Oblastar.BATKEN);
            case YSSYK_KOL -> System.out.println(Oblastar.YSSYK_KOL);
            case OSH -> System.out.println(Oblastar.OSH);
            case JALAL_ABAD -> System.out.println(Oblastar.JALAL_ABAD);
            case NARYN -> System.out.println(Oblastar.NARYN);
            case TALAS -> System.out.println(Oblastar.TALAS);
            case CHUI -> System.out.println(Oblastar.CHUI);

        }



    }
}