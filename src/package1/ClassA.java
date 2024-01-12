package package1;

import package2.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
//        classB.privateMethod(); - doesn't work
//        classB.protectedMethod(); - doesn't work either
//        classB.packageProtected(); - nope, this is also not working
    }
}