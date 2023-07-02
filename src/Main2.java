import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
         int r,alfa;
         double pi=3.14,area;
        Scanner inp  =  new Scanner(System.in);
        System.out.print("Dairenin yarıçapı: ");
        r=inp.nextInt();

        System.out.print("Daire diliminin merkez açısı: ");
        alfa=inp.nextInt();

        area=(pi*(r*r)*alfa)/360;
        System.out.println("Daire Diliminin Alanı "+area);



    }
}
