package exercise.develhope.android;

public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Programmer programmer2 = new Programmer();
        programmer.name = "Mia";
        programmer.age = 25;
        programmer.wearsGlasses = true;
        programmer2.name = "Christian";
        programmer2.age = 25;
        programmer2.wearsGlasses = true;
        programmer.drinkCoffee();
        programmer.printDetails();
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}

