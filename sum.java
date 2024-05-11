public class sum {
    public static int sumprint(int n){
        if(n==1){
            return 1;
        }
        int s = sumprint(n-1);
        int sn=n+s;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumprint(5));
    }
}
