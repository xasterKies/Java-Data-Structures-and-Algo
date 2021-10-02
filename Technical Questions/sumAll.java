class sumAll {
    public static void main(String[] args) {

        System.out.println(sum([1, 4]))

    }

    public static int sum(int arr[]) {
        int sum = 0;
        int min, max;

        if(arr[0] < arr[1]){    
            min = arr[0];
            max = arr[1];
          }else{
            min = arr[1];
            max = arr[0];
          }
        
        for(int i = min; i <= max; i++){     
          sum += i;
        }

        return sum;
    }
}