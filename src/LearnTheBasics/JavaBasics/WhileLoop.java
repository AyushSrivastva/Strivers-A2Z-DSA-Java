package LearnTheBasics.JavaBasics;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        int i;

        if (d == 0) {
            i = 10;
        } else {
            i = d;
        }

        int sum = 0;
        int count = 0;

        while (count < 50) {
            sum += i;
            i += 10;
            count++;
        }

        System.out.println(sum);

        sc.close();
    }
}
