public class InsertionSort {
    public static void main (String[] args) {
        int[] elements = {20, 35, -15, -7, 55, 1, 0};

       for(int firstUnsortedIndex = 1; firstUnsortedIndex < elements.length; firstUnsortedIndex++) {

            int newElement = elements[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i > 0 && elements[i-1] > newElement; i--) {
                elements[i] = elements[i - 1];
            }

            elements[i] = newElement;

       }

       for(int i = 0; i < elements.length; i++) {
           System.out.println(elements[i]);
       }
    }

    

    
}
