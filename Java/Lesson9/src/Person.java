package Java.Lesson9.src;

public class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        if (this.gender == 'm'){
            return "Mr." + name;
        }
        else if (this.gender == 'f'){
            return "Mrs." + name;
        }
        else{
            return "Incorrect gender";
        }
    }
}
