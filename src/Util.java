/**
 * Created by serio on 11.02.2017.
 */
public class Util {
    public static int maxNumber(int number) {
        int max = -1;
        do {
            max = number%10>max? number%10:max;
            number/=10;
        } while (number>0);
        return max;
    }

    public static int factorial(int n) {
        int result;
        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static int minNumber(int number){
        int min = 10;
        while (number>0) {
            if (number%10<min) min = number%10;
            number /= 10;
        }
        return min;
    }
    public static int sumNumber(int number){
        int sum = 0;
        while (number>0) {
            sum = number%10 + sum;
            number /= 10;
        }
        return sum;
    }

    public static int multiplicationNumber(int number){
        int mult = 1;
        while (number>0) {
            if (mult!=0) mult = number%10 * mult;
            number /= 10;
        }
        return mult;
    }

    public static boolean searchNumeral(int number, int n){
        int a, b, c, d, e , f, g, h, t;
        a = number/100000000;
        b = number/10000000%10;
        c = number/1000000%10;
        d = number/100000%10;
        e = number/10000%10;
        f = number/1000%10;
        g = number/100%10;
        h = number/10%10;
        t = number%10;
        return true;
    }
}
