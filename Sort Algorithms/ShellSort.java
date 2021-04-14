public class ShellSort {
    public static void main(String[] args) {}
    int[] elements = {20, 35, -15, -7, 55, 1, 0};

    for(int gap = elements.length / 2; gap > 0; gap /= 2) {

        for(int i = gap; i < elements.length; i++) {
            int newElement = elements[i];

            int j = i;
            while(j >= gap && elements[j - gap] > newElement )
        }
    }
}
