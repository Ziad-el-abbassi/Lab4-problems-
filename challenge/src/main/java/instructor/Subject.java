package instructor;

public class Subject {
    private int id;
    public Instructor instructor;
    private String code;
    private String title;
    public Subject(int id1, String code1,String title1){
        this.id=id1;
        this.code=code1;
        this.title=title1;
    }
    public Subject(){};
    public String normalizedCode(){
        return this.code.toUpperCase();
    }
    public String properTitle(){
        StringBuilder s=new StringBuilder();
        s.setCharAt(0,Character.toUpperCase(title.charAt(0)));
        for(int i=0;i<title.length()-1;i++){
            if(title.charAt(i)==' '){
                s.setCharAt(i+1,Character.toUpperCase(title.charAt(i+1)));
            }
        }
        return s.toString();
    }
    public boolean isIntroCourse(){
        if(this.title.substring(0,5).toLowerCase()=="intro"){
            return true;
        }
        if(this.code.substring(0,6)=="INTRO-"){
            return true;
        }
        return false;
    }
    public String syllabusLine(){
        StringBuilder s=new StringBuilder();
        s.append(this.code+" - "+this.title+" (Instructor: "+ instructor.getSecondName()+" "+instructor.getFirstName()+")");
        return s.toString();
    }
}


