import jdk.internal.vm.annotation.ForceInline;

public class BubbleSort {
    public static void main (String[] args) {
        int[] elements = {20, 35, -15, -7, 55, 1, 0};

        for(int lastUnsortedIndex = elements.length; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if (elements[i] == elements[i+1]) {
                    swap(elements, i, i+1 );
                }
            }
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    

    public swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp;

        array[i] = array[temp];
        array[j] = array[i];
        array[temp] = array[j];

    }
}
