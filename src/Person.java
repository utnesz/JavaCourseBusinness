import businnes.Company;

import java.time.LocalDate;

// data types

public class Person {
        private final double PI = 3.14;
        private final String MY_BIG_CONSTANT = "Hi, this is my constant message";
        private String myBigConstant = "";
        private String firstName = "Jerry";
        private String middleName = "Christopher";
        public String lastName;
        protected LocalDate  dob;
        private int age = 25;
        private long id;
        private char middleInitial = 'J';
        private byte myByte;
        static private Company company = new Company();
        static private Company company1 = new Company();
        private NewsAgency agency;

        public static int[] nums = initNums();

        // this is also can work
        // static {
        //     nums = new int[5];
        //     nums[0] = 3;
        //     nums[1] = 4;
        //     nums[2] = 5;
        //     nums[3] = 6;
        //     nums[4] = 7;
        // }

        public static int[] initNums() {
            nums = new int[5];
            nums[0] = 3;
            nums[1] = 4;
            nums[2] = 5;
            nums[3] = 6;
            nums[4] = 7;
            return nums;


        }


        public void sayHello() {
            System.out.println("Hello");
        }

        public char getMiddleInitial() { return middleName.charAt(0);};

        public void saySomething( String message) {
            System.out.println(message);
        }

        public int add(int num1, int num2) {return num1 + num2;}

        public void myTestMethod() {
            var age = 21;
            var name = "Jake";
            String jName = "Jerry";
            int years = 67;
            var mary = "Mary";

        }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstName = "Christian";
        p1.lastName = "Smith";
        p1.myTestMethod();
        p1.sayHello();
        p1.saySomething("I'm just saying something...");
        System.out.println(p1.age * p1.PI);
        System.out.println(nums[2]);
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(4, 7));
        }

    }
