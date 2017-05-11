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

    public static void leftArr( int arr[]) {
        int t = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = t;
    }

    public static int[] leftKArr (int a[], int k) {
        int tmp[]= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            tmp[i] = a[i];
        }
        for (int i = 0; i < k; i++) {
            leftArr(tmp);
        }
        return tmp;
    }

    public static void printArray( int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " | ");
        }
        System.out.println(" ");
    }

    public static void turn(int arr[], int x, int y) {
        while (x < y) {
            int t = arr[x];
            arr[x] = arr[y];
            arr[y] = t;
            x++;
            y--;
        }
    }
    public static void sort1(int a[]){
        int n = 0, p = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[n] < a[p+1]) {
                int t = a[n];
                a[n] = a[p+1];
                a[p+1] = t;
            }
            p++;
            if (a.length - i == 1) {
                i = 0;
                n++;
                p = n;
            }
        }
    }

    public static void bubble(int a[]) {
        boolean No = true;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - i - 1; j++ ) {
                if (a[j] > a[j+1]) {
                    int p = a[j];
                    a[j] = a[j+1];
                    a[j+1] = p;
                    No = false;
                }
            }
            if (No) break;
        }
    }

    public static void insert(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }
}
