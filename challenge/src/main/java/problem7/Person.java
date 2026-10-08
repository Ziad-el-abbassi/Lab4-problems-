package problem7;

public abstract class Person {
    private String name;
    public Person(){};
    public Person(String n){
        this.name=n;
    };
    public String getName(){
        return this.name;
    }
    public abstract void display();
}
