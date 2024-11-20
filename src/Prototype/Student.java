package Prototype;

public class Student implements Prototype<Student>{

    private String batchName;
    private String instructor;
    private int avgBatchPsp;
    private String name;
    private String Phonenumber;
    private String email;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(int avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String batchName, String instructor, int avgBatchPsp) {

        this.batchName = batchName;
        this.instructor = instructor;
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student(Student st){//copy constructor
      this.batchName=st.batchName;
      this.instructor=st.instructor;
      this.avgBatchPsp=st.avgBatchPsp;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "batchName='" + batchName + '\'' +
//                ", instructor='" + instructor + '\'' +
//                ", avgBatchPsp=" + avgBatchPsp +
//                ", name='" + name + '\'' +
//                ", Phonenumber='" + Phonenumber + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }

    public Student clone(){
        return new Student(this);//passing object of this class
    }


}
