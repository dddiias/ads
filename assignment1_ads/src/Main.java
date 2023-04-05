import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //problem 1
//    public static int minOfArray(int[] arr, int n){
//        if (n==1) return arr[0];
//
//        int min = minOfArray(arr, n-1);
//
//        if (arr[n-1] < min){
//            return arr[n-1];
//        } else {
//            return min;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int min = minOfArray(arr, n);
//        System.out.println("Minimum of array = " + min);
//    }

    //problem 2
//    public static double averageOfArray(int[] arr, int n){
//        if (n==1) return arr[0];
//
//        double sum = averageOfArray(arr, n-1) * (n-1);
//        System.out.println(sum);
//        sum += arr[n-1];
//        return sum/n;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        double average = averageOfArray(arr, n);
//        System.out.println("Average = " + average);
//    }

    //problem 3
//    public static boolean isPrime(int n, int i){
//        if (n<2) return false;
//
//        if (i > Math.sqrt(n)) {
//            return true;
//        }
//
//        if (n % i == 0) {
//            return false;
//        } else {
//            return isPrime(n, i+1);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");
//
//    }

    //problem 4
//    public static int factorial(int n){
//        if (n == 1) return 1;
//
//        int result = factorial(n-1)*n;
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//
//        System.out.println(factorial(n));
//    }

    //problem 5
//    public static int fibonacci(int n){
//        if (n<=1) return n;
//
//        return fibonacci(n-2)+fibonacci(n-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        System.out.println(fibonacci(n));
//    }

    //problem 6
//    public static double degree(int a, int n){
//        if (n==1) return a;
//
//        return degree(a, n-1)*a;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt(), n = sc.nextInt();
//
//        System.out.println(degree(a, n));
//    }

    //problem 7
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String symbols = sc.nextLine();
//
//    }

    //problem 8
//    public static boolean isDigit(String arr){
//        if (arr.length() == 0) return true;
//
//        char c = arr.charAt(0);
//        if (Character.isDigit(c)){
//            return isDigit(arr.substring(1));
//        }
//        else return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.nextLine();
//        System.out.println(isDigit(s) ? "Yes" : "No");
//    }

    //problem 9
//    public static int binomialCoefficient(int n, int k){
//        if (k == 0 || n == k) return 1;
//        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt(), k = sc.nextInt();
//
//        System.out.println(binomialCoefficient(n,k));
//    }

    //priblem 10
//    public static int gcd(int a, int b){
//        if (b == 0) return a;
//        return gcd(b, a%b);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt(), b = sc.nextInt();
//
//        System.out.println(gcd(a,b));
//    }
}