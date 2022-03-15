public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean hasbeenGroomed;//added

    public Dog(String name, int age, boolean isVaccinated, boolean hasBeenWalked)
    {
        super(name,age,isVaccinated);
        this.hasBeenWalked = hasBeenWalked;
    }

    public Dog(String name, int age, boolean isVaccinated,String color, boolean hasBeenWalked, boolean hasbeenGroomed)
    {
        super(name,age,isVaccinated,color);
        this.hasBeenWalked = hasBeenWalked;
        this.hasbeenGroomed = hasbeenGroomed;
    }

    public void walk()
    {
        if(hasBeenWalked)
        {
            System.out.println("You walked " + getName() + " already.");
        }
        else
        {
            System.out.println("You walked " + getName());

        }
        hasBeenWalked = true;
    }

    public void groom()
    {
        if(hasbeenGroomed)
        {
            System.out.println("You groomed " + getName()+ " already.");
        }
        else
        {
            System.out.println("You groomed " + getName());

        }
        hasbeenGroomed = true;
    }

    public boolean isHasbeenGroomed() {
        return hasbeenGroomed;
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public String toString()
    {
        String a = "Name: " + getName() ;
        String b = "Age: " + getAge();
        String c = "Vaccinated: " + isVaccinated();
        String d = "Color: " + getColor();
        String e = "Walked: " + hasBeenWalked;
        String f = "Groomed: " + hasbeenGroomed;
        return a + "\n" + b +"\n" + c + "\n" + d + "\n" + e + "\n" + f;
    }


}
