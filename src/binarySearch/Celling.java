package binarySearch;

public class Celling {
    public static int cellingOfArray(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        int celli = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(num > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
                celli = arr[mid];
            }
        }

        return celli;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,11,13,15};
        int target = 2;
        System.out.println(cellingOfArray(arr, target));
    }
}
