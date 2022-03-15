public class Animal {
    private int age;
    private String name;
    private boolean isVaccinated;
    private String color;//added

    public Animal(String name, int age, boolean isVaccinated)
    {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public Animal(String name, int age, boolean isVaccinated,String color)
    {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.color = color;
    }

    public String toString()
    {
        String a = "Name: " + name ;
        String b = "Age: " + age;
        String c = "Vaccinated: " + isVaccinated;
        String d = "Color: " + color;
        return a + "\n" + b +"\n" + c +"\n" + d;
    }

    public String getColor() {
        return color;
    }

    public void adopt()
    {
        System.out.println("You adopted " + name);
    }

    public void feed()
    {
        System.out.println("You fed " + name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }


}
