
import java.lang.StringBuffer;
import java.lang.Character;

public class CeasarCipher {
    public static void main(String[] args) {
        String text = "ATTACKATONCE";
        int s = 4;

        System.out.println("Text: " + text);
        System.out.println("Key: " + s);
        try{
            System.out.println("Ciphered Text: " + encrypt(text, s));
        } catch(IndexOutOfBoundsException err) {
            System.out.println("Error Occured :" + err);
        }
        System.out.println("Diciphered Text: " + decrypt(text, s));
        


    }

    //Another formula 
    //  C = (text + key) % 26

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < text.length(); i++) {
            
            if(Character.isUpperCase(text.charAt(i))) {
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

    public static StringBuffer decrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        int key = 26 - s;

        for(int i = 0; i < text.length(); i++) {
            
            if(Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + (key - 65) % 26 + 65));
                result.append(ch);
            }
            else{
                char ch = (char)(((int)text.charAt(i) + (key - 97) % 26 + 97));
                result.append(ch);
            }
        }
        return result;
    }
}
