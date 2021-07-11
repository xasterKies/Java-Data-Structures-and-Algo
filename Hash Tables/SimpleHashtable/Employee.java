public class Employee {

    //Defining the variables of the employees
    public String firstName;
    public String lastName;
    public int age;
    public int id;

    //Initializing constructor class with firstname, lastname , id
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //Overiding the printout statement through the toString method
    @Override
    public String toString() {
        return "Employee( FirstName: " + firstName + ", LastName: " + lastName + ", Id: " + id + " )" ;
    }

    //Method for setting the firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Method for setting the lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Method for setting the age
    public void setAge(int age) {
        this.age = age;
    }

    //Method for setting the id
    public void setId(int id) {
        this.id = id;
    }

    //Method for getting the firstname
    public String getFirstName() {
        return firstName;
    }

    //Method for getting the lastname
    public String getLastName() {
        return lastName;
    }

    //Method for getting the age
    public int getAge() {
        return age;
    }

    //Method for getting the id
    public int id() {
        return id;
    }
}
