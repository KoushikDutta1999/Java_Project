import java.util.Scanner;

class school1 {
    private String name, address, phonenumber, principleName, statusOfSchool;
    private int noNonteachingStaff, noTeacher;
    private boolean admissionOpen;

    school1() {
        name = null;
        address = null;
        phonenumber = null;
        principleName = null;
        statusOfSchool = null;
        noNonteachingStaff = 0;
        noTeacher = 0;
        admissionOpen = false;
    }

    school1(String name, String address, String phonenumber, String principleName, String StatusOfSchool,
            int noNonteachingStaff, int noTeacher, boolean admissionOpen) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.principleName = principleName;
        this.statusOfSchool = StatusOfSchool;
        this.noNonteachingStaff = noNonteachingStaff;
        this.noTeacher = noTeacher;
        this.admissionOpen = admissionOpen;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        this.name = n;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String a) {
        this.address = a;
    }

    String getNumber() {
        return phonenumber;
    }

    void setNumber(String num) {
        this.phonenumber = num;
    }

    String getPrincipleName() {
        return principleName;
    }

    void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    String getStatusOfSchool() {
        return statusOfSchool;
    }

    void setStatusOfSchool(String StatusOfSchool) {
        this.statusOfSchool = StatusOfSchool;
    }

    int getnoNonteachingStaff() {
        return noNonteachingStaff;
    }

    void setnoNonteachingStaff(int noNonteachingStaff) {
        this.noNonteachingStaff = noNonteachingStaff;
    }

    int getnoTeacher() {
        return noTeacher;
    }

    void setnoTeacher(int noTeacher) {
        this.noTeacher = noTeacher;
    }

    boolean getadmissionOpen() {
        return admissionOpen;
    }

    void setAdmissionOpen(boolean admissionOpen) {
        this.admissionOpen = admissionOpen;
    }

}

class Student extends school1 {
    private String studentName, studentAddress, studentPhone, studentClass;

    Student() {
        studentName = null;
        studentAddress = null;
        studentPhone = null;
        studentClass = null;
    }

    Student(String studentName, String studentAddress, String studentPhone, String studentClass) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentPhone = studentPhone;
        this.studentClass = studentClass;
    }

    String getstudentName() {
        return studentName;
    }

    void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    String getstudentAddress() {
        return studentAddress;
    }

    void setstudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    String getstudentPhone() {
        return studentPhone;
    }

    void setstudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    String getstudentClass() {
        return studentClass;
    }

    void setstudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}

class Teacher extends school1 {
    String teacherName, teacherPhone, teacherAddress;

    Teacher() {
        teacherName = null;
        teacherPhone = null;
        teacherAddress = null;
    }

    Teacher(String teacherName, String teacherPhone, String teacherAddress) {
        this.teacherName = teacherName;
        this.teacherPhone = teacherPhone;
        this.teacherAddress = teacherAddress;
    }

    String getteacherName() {
        return teacherName;
    }

    void setteacherName(String name) {
        this.teacherName = teacherName;
    }

    String getteacherAddress() {
        return teacherAddress;
    }

    void setteacherAddress(String address) {
        this.teacherAddress = teacherAddress;
    }

    String getteacherPhone() {
        return teacherPhone;
    }

    void setteacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }
}

class parent extends Student {
    private String parentName, relation;

    parent() {
        parentName = null;
        relation = null;
    }

    parent(String parentName, String relation) {
        this.parentName = parentName;
        this.relation = relation;
    }

    String getParentName() {
        return parentName;
    }

    void setParentName(String parentName) {
        this.parentName = parentName;
    }

    String getRelation() {
        return relation;
    }

    void setPhone(String relation) {
        this.relation = relation;
    }
}

public class school {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        int pass = 12345;
        System.out.println("Enter user name : ");
        String uname = sc.next();
        System.out.println("Enter Password");
        int pas = sc.nextInt();
        if (user.equals(uname) && pas == pass) {
            System.out.println("Enter School name");
            String scname = sc.next();
            System.out.println("Enter School Address");
            String scAddress = sc.next();
            System.out.println("Enter School phoneNumber");
            String scNumber = sc.next();
            System.out.println("Enter School Principal Name");
            String scPrincipal = sc.next();
            System.out.println("Enter Status of School");
            String scsos = sc.next();
            System.out.println("Enter Number of non technical stuff ");
            int nonts = sc.nextInt();
            System.out.println("Enter Number of non Teacher ");
            int not = sc.nextInt();
            System.out.println("Enter admission open or not ");
            boolean ado = sc.nextBoolean();
            school1 obj = new school1(scname, scAddress, scNumber, scPrincipal, scsos, nonts, not, ado);
            System.out.println("School Name : " + obj.getName());
            System.out.println("School Address : " + obj.getAddress());
            System.out.println("School PhoneNumber : " + obj.getNumber());
            System.out.println("School PrincipleName : " + obj.getPrincipleName());
            System.out.println("School Status of School : " + obj.getStatusOfSchool());
            System.out.println("School Non Teaching Stuff : " + obj.getnoNonteachingStaff());
            System.out.println("School Teacher : " + obj.getnoTeacher());
            System.out.println("School Get Admission Open : " + obj.getadmissionOpen());
            System.out.println("press 1 for teacher / press 2 for Student ");
            int val = sc.nextInt();
            switch (val) {
                case 1:
                    System.out.println("You are Teacher ");
                    String teacherName, teacherPhone, teacherAddress;
                    break;
                case 2:
                    System.out.println("You are Student ");
                    System.out.println("Enter Student name");
                    String studentName = sc.next();
                    System.out.println("Enter Student Address");
                    String studentAddress = sc.next();
                    System.out.println("Enter Student phoneNumber");
                    String studentPhone = sc.next();
                    System.out.println("Enter Student Class");
                    String studentclass = sc.next();
                    Student obj1 = new Student(studentName, studentAddress, studentPhone, studentclass);
                    System.out.println("Student Name : " + obj1.getstudentName());
                    System.out.println("Student Address : " + obj1.getstudentAddress());
                    System.out.println("Student phone number : " + obj1.getstudentPhone());
                    System.out.println("Student class : " + obj1.getstudentClass());
                    break;
                default:
                    System.out.println("You chose Wrong option");
            }
        } else {
            System.out.println("Please Enter correct Username & Password");
        }
    }

}