package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students=new Student[50];
    private int studentCount=0;

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
    }
    public Major(){
        this.id=nextId++;
    };
    // Method to add a student
    public boolean addStudent(Student s) {
        if(studentCount>=50){
            return false;
        }
        students[studentCount++]=s;
        return true;
    }
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }
    public void setId(int idx){
        this.id=idx;
    }
    public void setCode(String code1){
        this.code=code1;
    }

    public void setName(String name1){
        this.name=name1;
    }
    // Getters
    public String toString(){
        return "Major: id: "+this.id+", code: "+this.code+", name: "+this.name;
    }

    public Student findStudentByCNE(String cne){
        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
        }
    public int getStudentCount() {
        int k = 0;
        for (int i = 0; i < studentCount; i++) {
            if(students[i]!=null){
                k++;
            }
        }
        return k;
    }

    public boolean removeStudent(String cne){
        if(this.findStudentByCNE(cne)==null){
            return false;
        }
        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                for(int j=i;j<studentCount-1;j++){
                    students[j]=students[j+1];
                }
                students[studentCount-1]=null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public String getOccupancyRate(){
        return this.name+" capacity: "+students.length+" students\n Current enrollement: "+this.getStudentCount()+" students\n Occupancy rate= "+(double)this.getStudentCount()/students.length *100+"%";
    }

    public String getStudentListAsString(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<studentCount;i++){
            s.append(students[i].toString()+", ").append("\n");
        }
        return s.toString();
    }
    // Display all students in the major
    public void displayStudents() {
        for(int i=0;i<studentCount;i++){
            System.out.println(students[i].toString());
        }
    }


}
