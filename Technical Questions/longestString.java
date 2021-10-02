class longestString() {
    public static void main(String[] args) {

        System.out.print(findLongestWordLength("Mary Likes Cooking"))

    }

    public static String findLongestWordLength(String str) {
        String splitStr = str.split(" ");
        int longestWord = 0;

        for(int i = 0; i < splitStr.length(); i++) {
            if (splitStr[i] > longestWord) {
                longestWord = splitStr[i].length();
            }
        }

        return longestWord;
    }
}