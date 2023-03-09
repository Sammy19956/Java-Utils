import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(binarySearch(array, 8));
    StringCompare("hello\nhava");

    }

    public static int StringCompare (String word) {

       String[] array = word.split("\n");
        String a = array[0];
        String b = array[1];

        int sum = a.length() + b.length();
        System.out.println(sum);

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String aCapital = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCapital = b.substring(0, 1). toUpperCase() + b.substring(1);
        System.out.println(aCapital + " " + bCapital);
        return sum;
    }


}

//    static int binarySearch(int[] sortedArray, int target) {
//
//        Arrays.sort(sortedArray);
//
//        if(sortedArray.length ==0){
//            return -1;
//        }
//        int start =0;
//        int end = sortedArray.length - 1;
//
//        while(start <= end){
//
//            int mid = (start + end)/2;
//
//            if(target < sortedArray[mid]){
//                end = mid -1;
//            }else if(target > sortedArray[mid]){
//                start = mid +1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//}