public class QuickSort {

    public static void main(String[] args) {
        int[] elements = {20, 35, -15, -7, 55, 1, 0};

        quickSort(elements, 0, elements.length);

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // Empty loop
            while(i < j && input[--j] >= pivot);
            if(i < j) {
                input[i] = input[j];
            }

            //Empty loop
            while(i < j && input[++i] <= pivot );
            if(i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

}

