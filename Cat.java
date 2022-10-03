public class Cat {
    public String name;
    public int age;
    public boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void displayInfo() {
        if (this.likesCuddles) {
            System.out.printf("This is %s who is %s and likes to cuddle \n", this.name, this.age);
        } else {
            System.out.printf("This is %s who is %s and does not like to cuddle \n", this.name, this.age);
        }
    }

}