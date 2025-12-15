package non.access.modifiers;

import java.io.*;

class Employee implements Serializable {
    String name;
    transient String password;  

    Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class TestTransient {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("Bharath", "mySecret123");

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        oos.writeObject(emp);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
        Employee emp2 = (Employee) ois.readObject();
        ois.close();

        System.out.println("Name: " + emp2.name);         // Bharath
        System.out.println("Password: " + emp2.password); // null (ignored during serialization)
    }
}
