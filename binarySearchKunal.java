public class binarySearchKunal {

    public static void main(String[] args) {

        int[] a = {12, 22, 33, 45, 89,103,232,345};
        System.out.println(bs(a, 22));

    }

    // dekh kya kya variable change ho rhe or kaise kaise change ho rhe.. us change ko samne likh or
    //banata jaa prog
    private static int bs(int[] a, int target) {

        int start=0;
        int end= a.length-1;

        while(start<=end){
           int mid = start + (end-start)/2;

            if(target < a[mid]){
                end=mid-1;
            }
            else if(target > a[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
      return -1;
    }
}
