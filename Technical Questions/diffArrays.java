class diffArray {
    public static void main(String[] args) {
        
        System.out.print(difference([1, 2, 3, 5], [1, 2, 3, 4, 5]))

    }

    public static int[] difference(int arr1[], int arr2[]) {
        int newArr[] = [];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2.indexOf(arr1[i]) === -1) {
              // Pushing the elements unique to first to newArr
              newArr.push(arr1[i]);
            }
          }
      
        return newArr;
    }
}