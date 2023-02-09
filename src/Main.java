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
        System.out.println(oblastar);







    }
}