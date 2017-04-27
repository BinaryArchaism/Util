/**
 * Created by serio on 11.02.2017.
 */
public class Util {

    static final int Max = 0;

    public static int maxNumber(int number, int max) {
        if (number == 0) return max;
        if (number % 10 > max) return maxNumber(number / 10, number % 10);
        else return maxNumber(number / 10, max);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    static final int Min = 10;

    public static int minNumber(int number, int min){
        if (number == 0) return min;
        if (number % 10 < min) return minNumber(number / 10, number % 10);
        else return minNumber(number / 10, min);
    }

    static final int Sum = 0;

    public static int sumNumber(int number, int sum){
        if (number == 0) return sum;
        return sumNumber(number / 10, sum + number % 10);
    }

    static final int Mult = 1;

    public static int multiplicationNumber(int number, int mult){
        if (number == 0) return mult;
        return multiplicationNumber(number / 10, mult * (number % 10));
    }

    public static boolean searchNumeral(int number, int n){
        if (number % 10 == n) return true;
        if (number == 0) return false;
        return searchNumeral(number / 10, n);
    }
    public static int[] inArr(int[] arr, int n, int place){
        place--;
        int t1;
        int t = arr[place];
        for (int i = place; i < arr.length-1; i++) {
            t1 = arr[i+1];
            arr[i+1] = t;
            t = t1;
        }
        arr[place] = n;
        return arr;
    }
    public static int[] outArr(int[] arr, int place) {

        for (int i = place; i < arr.length-1; i++) {
            arr[i-1] = arr[i];
        }
        return arr;
    }

    public static int sub( int a, int b) {
        if (b == 0) return a;
        return sub(a-1, b-1);
    }

    public static int div1( int a, int b, int c, int d ) {
        if (d == 0) return c;
        return div1(a,b,c+1, sub(d, a));
    }

    public static  int mod( int a, int b){
        if (a < b) return a;
        return mod(sub(a,b), b);
    }

    public static int swap1(int a, int b, int c, int d) {
        if (a == d && b == c) return a;
        return swap1(a-1, b+1, c, d);
    }
}
