/**
 * Created by serio on 11.02.2017.
 */
public class Util {
    public static int maxNumber(int number) {
        int a, b, c, d, e , f, g, h, t;
        a = number/1000000000;
        b = number/100000000%10;
        c = number/10000000%10;
        d = number/1000000%10;
        e = number/100000%10;
        f = number/10000%10;
        g = number/1000%10;
        h = number/100%10;
        t = number%10;
        return a;
    }
}
