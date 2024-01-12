import model.Address;
import specific.animals.Cat;
import specific.animals.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
    //    System.out.println("Hello World, nice to meet you");

        Person tom = new Person("Thomas", "Jefferson", LocalDate.of(2000, 06, 15));
        Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));

        tom.setSpouse(janet);
        //janet.setSpouse(tom);

        Address tomsAddress = new Address("Main street", "42", "Michigan", "MC");
        Address janetsAddress = new Address("Fitzjohn ave.", "16/2", "London", "NE");

        tom.setAddress(tomsAddress);
        janet.setAddress(janetsAddress);

        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));

        tom.setPet(fido);
        fido.bark();


        Cat cindy = new Cat("Cindy", LocalDate.of(2000,3,10));
        janet.setPet(cindy);
        cindy.meow();

    //    System.out.println(tom);
    //    System.out.println(janet);

    }
}
