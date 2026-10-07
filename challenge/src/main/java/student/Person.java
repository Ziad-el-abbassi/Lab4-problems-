package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
        // add others
    }
    public Person(){};
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }

    public void setId(int idx){
        this.id=idx;
    }
    public void setFirstName(String s){
        this.firstName=s;
    }
    public void setSecondName(String s1){
        this.secondName=s1;
    }
    public void setPhone(String s2){
        this.phone=s2;
    }
    public void setEmail(String s3){
        this.email=s3;
    }
    public String toString(){
        return "Person: id: "+this.id+", First Name: "+this.firstName+", Second Name: "+this.secondName+", phone: "+this.phone+", email: "+this.email;
    }

}

