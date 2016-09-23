package katav1;

import java.util.Date;

public class KataV1 {

    public static void main(String[] args) {
        Person person = new Person("Alejandro",new Date(96,10,9));
        System.out.println(person.getName()+ " tiene " + person.getAge() + " años");
    }
}
