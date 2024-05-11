public class occurence {
    public static int isFind(int arr[],int i,int key){
        if (i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return isFind(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2,4, 2, 6, 7, 6, 1, 9};
        System.out.println(isFind(arr, 0, 7 ));

    }
}
