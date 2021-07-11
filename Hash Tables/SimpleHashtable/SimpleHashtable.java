

/* Author:  Tiokeng Samuel
  * Class: arrayHashtable()
  * Description: Easy implementation of a Hash table in arrays with the use of the Employee.java class
  * Date: 11th July 2021
  */

 public class SimpleHashtable {
    
    //Declaring the hashtable with the type employee
    private Employee[] hashtable = new Employee[10];

    //Declaring Hashtable with the default constructor
    public SimpleHashtable() {
        
    }

    //Put method for inserting and element in the hashtable
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at position" + hashedKey);
        }
        else {
            hashtable[hashedKey] = employee;
        }
    }

    //Method for initializing the hashtable with the hashkey
    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    
    //Method responsible for creating the hashKey
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    //Method for printing out the hashTables
    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
 }