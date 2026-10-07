package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
        this.students=new Student[50];
    }
    public Major(){};
    // Method to add a student
    public void addStudent(Student s) {

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
        for(int i=0;i<students.length;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
        }
    public int getStudentCount() {
        int k = 0;
        for (int i = 0; i < students.length; i++) {
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
        for(int i=0;i<students.length;i++){
            if(students[i].getCne().equals(cne)){
                for(int j=i;j<students.length;j++){
                    students[j]=students[j+1];
                }
            }
        }
        return true;
    }

    public String getOccupancyRate(){
        return this.name+" capacity: "+students.length+" students\n Current enrollement: "+this.getStudentCount()+" students\n Occupancy rate= "+(double)this.getStudentCount()/students.length *100+"%";
    }

    public StringBuilder getStudentListAsString(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<students.length;i++){
            s.append(students[i].toString()+", ").append("\n");
        }
        return s;
    }
    // Display all students in the major
    public void displayStudents() {
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }
    }


}
