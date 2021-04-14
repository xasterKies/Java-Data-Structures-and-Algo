import java.lang.StringBuffer;

public class CeasarCipher {
    public static void main(String[] args) {
        String text = "MEETMEATTHEPARK";
        int s = 4;

        System.out.print("Text: " + text);
        System.out.println("Key: " + s);
        System.out.println("Ciphered Text: " + encrypt(text, s));


    }

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for(int i = 0; i <= text.length(); i++) {
            
            if(Character.toUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + (s - 65) % 26 + 65));
                result.append(ch);
            }
            else{
                char ch = (char)(((int)text.charAt(i) + (s - 97) % 26 + 97));
                result.append(ch);
            }
        }
        return result;
    }
}
