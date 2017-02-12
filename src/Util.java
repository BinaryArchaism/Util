/**
 * Created by serio on 11.02.2017.
 */
public class Util {
    public static int maxNumber(int number) {
        int a, b, c, d, e , f, g, h, t;
        int max;
        a = number/100000000;
        b = number/10000000%10;
        c = number/1000000%10;
        d = number/100000%10;
        e = number/10000%10;
        f = number/1000%10;
        g = number/100%10;
        h = number/10%10;
        t = number%10;
        max = a>b? a:b; max = max>c? max:c; max = max>d? max:d;
        max = max>e? max:e; max = max>f? max:f; max = max>g? max:g;
        max = max>h? max:h; max = max>t? max:t;
        return max;
    }

    public static int factorial(int n) {
        int result;
        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static int minNumber(int number){    /**Не доделано, когда число меньше 9-ти знаков, выдает ноль, даже если его в числе нет.**/
        int a, b, c, d, e , f, g, h, t;
        int min;
        a = number/100000000;
        b = number/10000000%10;
        c = number/1000000%10;
        d = number/100000%10;
        e = number/10000%10;
        f = number/1000%10;
        g = number/100%10;
        h = number/10%10;
        t = number%10;
        min = a<b? a:b; min = min<c? min:c; min = min<d? min:d;
        min = min<e? min:e; min = min<f? min:f; min = min<g? min:g;
        min = min<h? min:h; min = min<t? min:t;
        return min;
    }
    public static int sumNumber(int number){
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
        return (a+b+c+d+e+f+g+h+t);
    }

    public static int multiplicationNumber(int number){
        int a, b, c, d, e , f, g, h, t;
        a = number/100000000; if (a == 0) a = 1;
        b = number/10000000%10; if (b == 0) b = 1;
        c = number/1000000%10; if (c == 0) c = 1;
        d = number/100000%10; if (d == 0) d = 1;
        e = number/10000%10; if (e == 0) e = 1;
        f = number/1000%10; if (f == 0) f = 1;
        g = number/100%10; if (g == 0) g = 1;
        h = number/10%10; if (h == 0) h = 1;
        t = number%10; if (t == 0) t = 1;
        return (a*b*c*d*e*f*g*h*t);
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
