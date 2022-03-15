    public class Tester {
        public static void main(String[] args) {
            //Animal
            Animal bruh = new Animal("bruh",5,true,"Red");

            System.out.println("Animals");
            System.out.println(bruh);

            System.out.println("\n");
            //Dog
            Dog woof = new Dog("Woof",2,false,"Blue",false, false);

            System.out.println("Dog");
            System.out.println(woof);
            woof.walk();
            woof.groom();
            System.out.println(woof);

            System.out.println("\n");
            //Cat

            Cat meow = new Cat("Meow",3,false,"Yellow",false, "Mug");
            System.out.println("Cat");
            System.out.println(meow);



        }
    }
