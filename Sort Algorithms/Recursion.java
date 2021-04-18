class Recursion {
    public static void main(String[] args) {

    }

    //Iterative Recursion
    public int iterativeRecursion(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i < num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}