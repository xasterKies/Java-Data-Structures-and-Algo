

public class SelectionSort {
    public static void main (String[] args) {
        int[] elements = {20, 35, -15, -7, 55, 1, 0};

        for(int lastUnsortedIndex = elements.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(elements[i] > elements[largest]) {
                    largest = i;
                    
                }

                }
                swap(elements, largest, lastUnsortedIndex);

                }

            

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
