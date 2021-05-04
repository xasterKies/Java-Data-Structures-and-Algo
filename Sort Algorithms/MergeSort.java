public class MergeSort {
    public static void main(String args[]) {
        int[] elements = { 20, 35, -15, 7, 55, 1, -22};

        mergeSort(elements, 0, elements.length);


        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        
    }

   public static void mergeSort(int[] input, int start, int end) {

    if(end - start < 2) {
        return;
    }

    int mid = (start + end) / 2;
    //creating the first partition from start to mid
    mergeSort(input, start, mid); 
    mergeSort(input, mid, end);
    merge(input, start, mid, end);
   }

   public static void merge (int[] input, int start, int mid, int end) {

    if(input[mid-1] <= input[mid]) {
        return;
    }

    int i = start;
    int j = mid;
    int tempIndex = 0;

    int[] temp = new int[end - start];
    while (i < mid && j < end) {
        temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }

    System.arraycopy(input, i, input, start + tempIndex, mid - i);
    System.arraycopy(temp, 0, input, start, tempIndex);
   }
}
