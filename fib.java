public class fib {
    public static int fibona(int n){
        if (n==0 || n ==1) {
            return n;
        }
        int a = fibona(n-1);
        int b = fibona(n-2);
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibona(n));
    }
}
