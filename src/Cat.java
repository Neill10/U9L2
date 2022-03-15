public class Cat extends Animal{
    private boolean hasPlayedWith;
    private String knockedOver;

    public Cat(String name, int age, boolean isVaccinated, boolean hasPlayedWith)
    {
        super(name,age,isVaccinated);
        this.hasPlayedWith = hasPlayedWith;
    }

    public Cat(String name, int age, boolean isVaccinated, String color, boolean hasPlayedWith, String knockedOver)
    {
        super(name,age,isVaccinated,color);

        this.hasPlayedWith = hasPlayedWith;
        this.knockedOver = knockedOver;
    }

    public void play()
    {
        if(hasPlayedWith = true)
        {
            System.out.println("You played with me already.");
        }
        else
        {
            System.out.println("You played with a cat!");

        }
        hasPlayedWith = true;
    }

    public void knockOver()
    {
        System.out.println("The Cat knocked over " + knockedOver + "!");
    }
    public boolean getHasPlayedWith()
    {
        return hasPlayedWith;
    }

    public String getKnockedOver() {
        return knockedOver;
    }

    public String toString()
    {
        String a = "Name: " + getName() ;
        String b = "Age: " + getAge();
        String c = "Vaccinated: " + isVaccinated();
        String d = "Color: " + getColor();
        String e = "Played: " + hasPlayedWith;
        String f = "Oh no! The cat knocked over " + knockedOver +"...Better go clean that up...";
        return a + "\n" + b +"\n" + c + "\n" + d + "\n" + e + "\n" + f;
    }

}
