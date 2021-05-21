package Doubled_Linked_List;

public class EmployeeLinkedList {

    public EmployeeNode head;
    public int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.print("null");

    }

    public int getSize(){
        return size;
    }

    public EmployeeNode removeFromFront() {
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        

        return removeNode;

    }

    
}
