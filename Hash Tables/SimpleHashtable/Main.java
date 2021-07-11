
public class Main {
   public static void main(String[] args) {
    
    //Defining the employees
    Employee tiokengSamuel = new Employee("Tiokeng", "Samuel", 1);
    Employee quintaNjom = new Employee("Quinta", "Njom", 2);
    Employee isaacMathias = new Employee("Isaac", "Mathias", 3);
    Employee henCharles = new Employee("Hen", "Charles", 4);

    
    //Creating hashtable object
    SimpleHashtable ht = new SimpleHashtable();

    //Inputing content in the hashtable through the put() method
    ht.put("Samuel", tiokengSamuel);
    ht.put("quinta", quintaNjom);
    ht.put("isaac", isaacMathias);
    ht.put("hen", henCharles);
   
    //Printing out the hashtable through the printHashTable() method
    ht.printHashTable();

   //Getting/Retriving the employee with the key="isaac" and printing it out
    System.out.println("Retrive key Isaac: " + ht.get("isaac"));

   } 
}
