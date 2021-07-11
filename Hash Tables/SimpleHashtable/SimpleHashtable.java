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
    
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
 }