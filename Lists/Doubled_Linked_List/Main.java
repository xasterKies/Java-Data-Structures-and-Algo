package Doubled_Linked_List;

public class Main {
    public static void main(String[] args) {

        Employee tiokengSamuel = new Employee("Tiokeng", "Samuel", 1);
        Employee quintaNjom = new Employee("Quinta", "Njom", 2);
        Employee isaacMathias = new Employee("Isaac", "Mathias", 3);
        Employee henCharles = new Employee("Hen", "Charles", 4);

        EmployeeLinkedList list = new EmployeeLinkedList();
        
        //List of items
        list.addToFront(tiokengSamuel);
        list.addToFront(quintaNjom);
        list.addToFront(isaacMathias);
        list.addToFront(henCharles);

        list.printList();

        System.out.println( " Size of the Linked List is: " + list.getSize());

        list.removeFromFront();

        System.out.println( " Size of the Linked List is: " + list.getSize());

        list.printList();
    }
}
