import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double tutar,total,perKm = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilometreyi Giriniz : ");
        km = input.nextInt();
        total = (km * perKm);
        total += 10;
        total = (total < 20) ? 20 : total;

        /* if ile yazmak isterseniz
        if (total< 20){
            total = 20;
        }
*/
        System.out.println("Tutar : " + total);
    }
}