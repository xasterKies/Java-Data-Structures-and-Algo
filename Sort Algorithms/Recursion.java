class Recursion {
    public static void main(String[] args) {
        //Driver Code
        System.out.println(iterativeRecursion(3));
        System.out.println(recursiveRecursion(3));
    }

    //Iterative Recursion
    public static int iterativeRecursion(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    //Recursive Recursion
    public static int recursiveRecursion(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveRecursion(num -1);
    }
}