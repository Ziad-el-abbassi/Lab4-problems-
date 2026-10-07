package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(prenom,nom, telephone, email,cne,new Major("23","Computer science"));
    }
    public Student(){};

    // Getters
    public String getCne(){
        return this.cne;
    }
    public Major getMajor(){
        return this.major;
    }
    public String toString(){
        return "Person: id: "+this.id+", First Name: "+this.firstName+", Second Name: "+this.secondName+", phone: "+this.phone+", email: "+this.email+", cne: "+this.cne+", major: "+this.major;
    }

    // Setters
    public void setCne(String c){
        this.cne=c;
    }
    public void setMajor(Major m){
        this.major=m;
    }
    public String getFullNameFormatted(){
        return String.format("%s, %s",this.secondName.toUpperCase(),this.firstName);
    }


}

