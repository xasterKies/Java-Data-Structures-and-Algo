import Doubled_Linked_List.Main;

public class main {
   public static void main(String[] args) {
    
    //Defining the employees
    Employee tiokengSamuel = new Employee("Tiokeng", "Samuel", 1);
    Employee quintaNjom = new Employee("Quinta", "Njom", 2);
    Employee isaacMathias = new Employee("Isaac", "Mathias", 3);
    Employee henCharles = new Employee("Hen", "Charles", 4);

    
    SimpleHashtable ht = new SimpleHashtable();
    ht.put("Samuel", tiokengSamuel);
    ht.put("quinta", quintaNjom);
    ht.put("isaac", isaacMathias);
    ht.put("hen", henCharles);

    ht.printHashTable();

   } 
}
