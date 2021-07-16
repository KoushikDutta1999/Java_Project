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
    private String name, address, phone, Clas;

    Student() {
        name = null;
        address = null;
        phone = null;
        Clas = null;
    }

    Student(String name, String address, String phone, String Clas) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.Clas = Clas;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    String getClas() {
        return Clas;
    }

    void setClas(String clas) {
        this.Clas = clas;
    }
}

class Teacher extends school1 {
    String name, phone, address;

    Teacher() {
        name = null;
        phone = null;
        address = null;
    }

    Teacher(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
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
        school1 obj = new school1();
        obj.setName("Koushik");
        obj.setAddress("Garia");
        obj.setNumber("7890064332");
        obj.setPrincipleName("S.Ganguly");
        obj.setnoNonteachingStaff(10);
        obj.setnoTeacher(20);
        obj.setAdmissionOpen(true);
        obj.setStatusOfSchool("Secondary");

    }

}