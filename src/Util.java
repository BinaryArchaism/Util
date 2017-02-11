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
}
