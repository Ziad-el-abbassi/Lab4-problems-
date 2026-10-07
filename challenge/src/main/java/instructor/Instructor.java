package instructor;
import student.*;
public class Instructor extends Person{
    private static String employeeNumber;
    public Instructor(String nom, String prenom, String telephone, String email){
        super(prenom,nom,telephone,email);
    };
    public String cleanEmployeeNumber(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<employeeNumber.length();i++){
            if(employeeNumber.charAt(i)!=' '){
                s.append(employeeNumber.charAt(i));
            }
        }
        String str=s.toString();
        return str;
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s,lastName=%s,firstName=%s]",employeeNumber,this.getSecondName(),this.getFirstName());
    }

    public String toCard(){
        StringBuilder s=new StringBuilder();
        s.append("Instructor").append("\n");
        s.append("----------\n");
        s.append("Employee #: "+employeeNumber+"\n" +
                "Name : "+this.getSecondName()+", "+this.getFirstName()+"\n" +
                "Email : "+this.getEmail()+"\n" +
                "Phone : "+this.getPhone());
        return s.toString();
    }
    public String displayName(){
        StringBuilder s=new StringBuilder();
        if(this.getFirstName()==null && this.getSecondName()!=null){
            s.append(this.getSecondName());
        }
        if(this.getFirstName()!=null && this.getSecondName()==null){
            s.append(this.getFirstName());
        }
        if(this.getFirstName()!=null && this.getSecondName()!=null){
            s.append(this.getSecondName()+" "+this.getFirstName());
        }
        return s.toString();
    }
}
