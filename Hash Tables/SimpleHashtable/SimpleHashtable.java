import java.util.Hashtable;

/* Author:  Tiokeng Samuel
  * Class: arrayHashtable()
  * Description: Easy implementation of a Hash table in arrays with the use of the Employee.java class
  * Date: 11th July 2021
  */

 public class SimpleHashtable {
    
    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at position" + hashedKey);
        }
        else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
 }