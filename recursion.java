public class recursion{
    public static void printdec(int n){
        if (n==1) {
            System.out.println(n+" ");
            return;
        }
        // System.out.print(n+" ");
        // printdec(n+1);
        printdec(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
}