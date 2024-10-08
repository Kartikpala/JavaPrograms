import java.util.Arrays;

class PairSum{
    public static void main(String[] args) {
        System.out.println(pairsum(new int[] {12, 34, 10, 6, 40}));
    }
    public static int pairsum(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1]+arr[arr.length-2];
    }

}