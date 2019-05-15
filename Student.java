import java.text.DecimalFormat;

    public class Student {
    //this integer holds the student's id
    private int ID;
    //this string holds the student's firstname
    private String firstName;
    //this string holds the student's surname
    private String surname;
    //this integer holds the mark of the first coursework1
    private int coursework1;
    //this integer holds the mork for corsework2
    private int coursework2;
    //this integer holds the mark for the exam
    private int exam;
    //this double value holds the final mark
    private double finalMark;
    //this round the value to a single deciaml digit
    private DecimalFormat decimalFormat = new DecimalFormat("0.0");

    //this is a constructor
    Student(int ID, String firstName, String surname, int coursework1, int coursework2, int exam){
        setID(ID);
        setFirstName(firstName);
        setSurname(surname);
        setCoursework1(coursework1);
        setCousework2(coursework2);
        setExam(exam);
        setFinalMark(coursework1, coursework2, exam);
    }

    //this method sets the student's id as an integer
    private void setID(int ID){
        this.ID = ID;
    }

    //this method sets the student's firstname as a string
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //this method sets the student's surname as a string
    private void setSurname(String surname){
        this.surname = surname;
    }

    //this method sets the corsework1 mark as an integer
    private void setCoursework1(int coursework1){
        this.coursework1 = coursework1;
    }

    //this method sets the coursework2 mark as an integer
    private void setCousework2(int coursework2){
        this.coursework2 = coursework2;
    }

    //this method sets the exam mark as an integer
    private void setExam(int exam){
        this.exam = exam;
    }

    //this method sets the final mark by summing the marks on coursework1,coursework2 and exam
    private void setFinalMark(int coursework1, int coursework2, int exam){
        this.finalMark = (coursework1*0.1) + (coursework2*0.1) + (exam*0.8);
    }

    //this method gets the sutdent's id
    private int getID(){
        return ID;
    }

        //this method gets the sutdent's firstname
    private String getFirstName() {
        return firstName;
    }

    ////this method gets the sutdent's surname
    private String getSurname() {
        return surname;
    }

    //this method gets the mark for coursework1
    public int getCoursework1() {
        return coursework1;
    }

        //this method gets the mark for coursework2
    public int getCoursework2() {
        return coursework2;
    }

        //this method gets the mark for exam
    public int getExam() {
        return exam;
    }

        //this method gets the final mark
    private double getFinalMark() {
        return finalMark;
    }

    //this method returns the surname,the firstname,the id and the final mark with one decimal digit
    @Override
    public String toString() {
        return (getSurname() + " " + getFirstName() + "--" + getID() + ": " + decimalFormat.format(getFinalMark()));
    }
}
