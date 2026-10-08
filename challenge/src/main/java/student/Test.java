package student;

public class Test {
    public static void main(String[] args) {

        Major math = new Major("12", "Mathematics");
        Student s1 = new Student("SAFI", "Amal", "0600000001", "amal@mail.ma", "22885676");
        Major cs = s1.getMajor();
        Student s2 = new Student("ALAMI", "Samir", "0600000002", "samir@mail.ma", "23585976");
        Student s3 = new Student("BENANI", "Yassine", "0600000003", "yassine@mail.ma", "21111111", math);

        System.out.println("The list of students in the computer science major is:");
        System.out.println(cs.getStudentListAsString());
        System.out.println("\nFull name formatted: " + s1.getFullNameFormatted());
        System.out.println("Find 22885676: " + cs.findStudentByCNE("22885676"));
        System.out.println("Find 00000000: " + cs.findStudentByCNE("00000000"));
        System.out.println("\nCS student count: " + cs.getStudentCount());
        System.out.println("Math student count: " + math.getStudentCount());
        System.out.println("\n" + cs.getOccupancyRate());
        System.out.println("\nRemove 22885676: " + cs.removeStudent("22885676"));
        System.out.println("Remove 00000000: " + cs.removeStudent("00000000"));
        System.out.println("\nCS students after removal:");
        System.out.println(cs.getStudentListAsString());
        System.out.println("\nMath students:");
        System.out.println(math.getStudentListAsString());
    }
}

