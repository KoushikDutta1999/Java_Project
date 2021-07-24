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

    void setteacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    String getteacherAddress() {
        return teacherAddress;
    }

    void setteacherAddress(String teacherAddress) {
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
        System.out.println("Enter Username : ");
        String uname = sc.next();

        String flag = null;

        System.out.println("Enter Password : ");
        int pas = sc.nextInt();

        if (user.equals(uname) && pas == pass) {
            System.out.println("Enter School name :");
            String scname = sc.next();

            System.out.println("Enter School Address : ");
            String scAddress = sc.next();

            System.out.println("Enter School Phone Number : ");
            String scNumber = sc.next();

            System.out.println("Enter Status of School : ");
            String scsos = sc.next();

            System.out.println("Enter School Principal Name : ");
            String scPrincipal = sc.next();

            System.out.println("Enter Number of non technical stuff : ");
            int nonts = sc.nextInt();

            System.out.println("Enter Number of Teacher : ");
            int not = sc.nextInt();

            System.out.println("Enter Admission Open(true) or Closed(false) : ");
            boolean ado = sc.nextBoolean();
            System.out.println("--------------------------------------------------------------");

            school1 obj = new school1(scname, scAddress, scNumber, scPrincipal, scsos, nonts, not, ado);
            System.out.println("School Name : " + obj.getName());
            System.out.println("School Address : " + obj.getAddress());
            System.out.println("School PhoneNumber : " + obj.getNumber());
            System.out.println("School Status of School : " + obj.getStatusOfSchool());
            System.out.println("School PrincipleName : " + obj.getPrincipleName());
            System.out.println("School Non Teaching Stuff : " + obj.getnoNonteachingStaff());
            System.out.println("School Teacher : " + obj.getnoTeacher());
            System.out.println("School Get Admission Open : " + obj.getadmissionOpen());
            System.out.println("--------------------------------------------------------------");
            System.out.println("Press 1 for teacher / Press 2 for Student / Press 3 for Parent / Press 4 for Admin");
            int val = sc.nextInt();
            System.out.println("--------------------------------------------------------------");

            switch (val) {
                case 1:
                    System.out.println("You are a Teacher");
                    System.out.println("Enter Teacher name : ");
                    String teacherName = sc.next();
                    System.out.println("Enter Teacher Address : ");
                    String teacherAddress = sc.next();
                    System.out.println("Enter Teacher Phone Number : ");
                    String teacherPhone = sc.next();
                    Teacher obj1 = new Teacher(teacherName, teacherAddress, teacherPhone);
                    System.out.println("Teacher Name : " + obj1.getteacherName());
                    System.out.println("Teacher Address : " + obj1.getteacherAddress());
                    System.out.println("Teacher Phone Number : " + obj1.getteacherPhone());
                    System.out.println("--------------------------------------------------------------");
                    flag = "teacher";
                    break;

                case 2:
                    System.out.println("You are a Student");
                    System.out.println("Enter Student name : ");
                    String studentName = sc.next();
                    System.out.println("Enter Student Address : ");
                    String studentAddress = sc.next();
                    System.out.println("Enter Student Phone Number : ");
                    String studentPhone = sc.next();
                    System.out.println("Enter Student Class : ");
                    String studentclass = sc.next();
                    Student obj2 = new Student(studentName, studentAddress, studentPhone, studentclass);
                    System.out.println("Student Name : " + obj2.getstudentName());
                    System.out.println("Student Address : " + obj2.getstudentAddress());
                    System.out.println("Student Phone Number : " + obj2.getstudentPhone());
                    System.out.println("Student Class : " + obj2.getstudentClass());
                    System.out.println("--------------------------------------------------------------");
                    flag = "student";
                    break;

                case 3:
                    System.out.println("You are a Parent");
                    System.out.println("Enter Parent name : ");
                    String parentName = sc.next();
                    System.out.println("Enter Your Relation with Student : ");
                    String relation = sc.next();
                    parent obj3 = new parent(parentName, relation);
                    System.out.println("Parent Name : " + obj3.getParentName());
                    System.out.println("Relation with Student : " + obj3.getRelation());
                    System.out.println("--------------------------------------------------------------");
                    flag = "parent";
                    break;

                case 4:
                    System.out.println("You are an Admin");
                    flag = "admin";
                    break;

                default:
                    System.out.println("You chose Wrong option !!!");
            }
            if (flag.equals("admin")) {
                System.out.println("You can add Student details by pressing 1.");
                System.out.println("You can add Teacher details by pressing 2.");
                System.out.println("You can update School details by pressing 3.");
                int choice = sc.nextInt();
                System.out.println("--------------------------------------------------------------");

                switch (choice) {
                    case 1:
                        System.out.println("Enter Teacher name : ");
                        String teacherName = sc.next();
                        System.out.println("Enter Teacher Address : ");
                        String teacherAddress = sc.next();
                        System.out.println("Enter Teacher Phone Number : ");
                        String teacherPhone = sc.next();
                        Teacher obj1 = new Teacher(teacherName, teacherAddress, teacherPhone);
                        System.out.println("Teacher Name : " + obj1.getteacherName());
                        System.out.println("Teacher Address : " + obj1.getteacherAddress());
                        System.out.println("Teacher Phone Number : " + obj1.getteacherPhone());
                        System.out.println("--------------------------------------------------------------");
                        break;

                    case 2:
                        System.out.println("Enter Student name : ");
                        String studentName = sc.next();
                        System.out.println("Enter Student Address : ");
                        String studentAddress = sc.next();
                        System.out.println("Enter Student Phone Number : ");
                        String studentPhone = sc.next();
                        System.out.println("Enter Student Class : ");
                        String studentclass = sc.next();
                        Student obj2 = new Student(studentName, studentAddress, studentPhone, studentclass);
                        System.out.println("Student Name : " + obj2.getstudentName());
                        System.out.println("Student Address : " + obj2.getstudentAddress());
                        System.out.println("Student Phone Number : " + obj2.getstudentPhone());
                        System.out.println("Student Class : " + obj2.getstudentClass());
                        System.out.println("--------------------------------------------------------------");
                        break;

                    case 3:
                        System.out.println("You can now Update School details.");
                        System.out.println(
                                "Press 1 to update School name / Press 2 to update School Address / Press 3 to update Phone number / Press 4 to update Status of school/ Press 5 to update Principal name / Press 6 to update number of non Technical Staff / Press 7 to update number of Teachers");
                        int update = sc.nextInt();
                        System.out.println("--------------------------------------------------------------");

                        switch (update) {
                            case 1:
                                System.out.println("Update School Name : ");
                                String sName = sc.next();
                                obj.setName(sName);

                            case 2:
                                System.out.println("Updte School Address : ");
                                String sAddress = sc.next();
                                obj.setAddress(sAddress);

                            case 3:
                                System.out.println("Update School Phone Number : ");
                                String sPNumber = sc.next();
                                obj.setNumber(sPNumber);

                            case 4:
                                System.out.println("Update Status of School : ");
                                String soschool = sc.next();
                                obj.setStatusOfSchool(soschool);

                            case 5:
                                System.out.println("Update Name of Principal : ");
                                String NameoP = sc.next();
                                obj.setPrincipleName(NameoP);

                            case 6:
                                System.out.println("Update Number of Non technical Staff : ");
                                int nonTS = sc.nextInt();
                                obj.setnoNonteachingStaff(nonTS);

                            case 7:
                                System.out.println("Update Number of Teacher : ");
                                int numot = sc.nextInt();
                                obj.setnoTeacher(numot);
                        }
                }
            } else {
                System.out.println("You are not an Admin");
            }
        } else {
            System.out.println("Please Enter Correct Username & Password.");
        }
    }
}