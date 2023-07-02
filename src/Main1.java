import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        int r,a = 0;
        double pi=3.14;
        Scanner inp = new Scanner(System.in);
        r=inp.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double daire =(pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: "+ alan);
        System.out.println("Dairenin cevresi: "+ cevre);
        System.out.println("Daire dilimin Alanı : "+ daire);










    }
}