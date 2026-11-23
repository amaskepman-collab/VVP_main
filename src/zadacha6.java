import java.util.Scanner;

public class zadacha6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        double x = sc.nextDouble();

        System.out.print("n = ");
        int n = sc.nextInt();

        System.out.print("e = ");
        double e = sc.nextDouble();

        double ln2 = Math.log(2.0);

        double sumN = 0.0;
        double sumE = 0.0;
        double sumE10 = 0.0;

        double a = 1.0;
        int k = 0;

        while (k < n || Math.abs(a) > e || Math.abs(a) > e / 10.0) {
            if (k < n)                  sumN   += a;
            if (Math.abs(a) > e)        sumE   += a;
            if (Math.abs(a) > e / 10.0) sumE10 += a;

            k++;
            a = a * ln2 * x / k;
        }

        double mathValue = Math.pow(2.0, x);

        System.out.println("1) Сумма " + n + " слагаемых: " + sumN);
        System.out.println("2) Сумма  /a/ > e:        " + sumE);
        System.out.println("3) Сумма /a/  > e/10:     " + sumE10);
        System.out.println("4) Проверка(2, x):       " + mathValue);

        sc.close();
    }
}