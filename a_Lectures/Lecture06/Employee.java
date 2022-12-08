public class Employee {
    int id;
    int salary;
    String firstName;
    String lastName;

//    @Override
//    public String toString() {
//        return String.format("id: %d; fname: %s; lname: %s; salary: %d",
//                id, firstName, lastName, salary);
//    }

    @Override
    public boolean equals(Object obj) {
        Employee t = (Employee) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
