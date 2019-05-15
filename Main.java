        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.util.Scanner;
        import java.util.ArrayList;
        public class Main {
        public static void main(String[] args){
        //creating an array
        ArrayList<Student> students = new ArrayList<>();
        //creating a file and a parameter which holds the name of the file
        String filename = "student_data.txt";
        File inputFile = new File ( filename );
        Scanner in = null;

        //looking into the file
        try{
            in = new Scanner(inputFile);
        }
        //if an error is found it prints out a message
        catch (FileNotFoundException e) {
            System.out.println ("Cannot open " + filename);
            System.exit (0);
        }

        //reads first student's id firstname,surname,coursework1 coursework2 and exam
        int ID = in.nextInt();
        String firstName = in.next();
        String surname = in.next();
        int coursework1 = in.nextInt();
        int coursework2 = in.nextInt();
        int exam = in.nextInt();

        //adding in the array the student's details
        students.add(new Student(ID, firstName, surname, coursework1, coursework2, exam));

        //reads the  id firstname,surname,coursework1 coursework2 and exam until it gets to the last student
        while (in.hasNext()) {
            String curLine = in.nextLine ();
            Scanner line = new Scanner (curLine);

            ID = in.nextInt();
            firstName = in.next();
            surname = in.next();
            coursework1 = in.nextInt();
            coursework2 = in.nextInt();
            exam = in.nextInt();

            students.add(new Student(ID, firstName, surname, coursework1, coursework2, exam));
            line.close ();
        }
        //this closes the file
        in.close();

        //the data is writen in an output file
        String output = "output";
        File outputFile = new File(output);
        PrintWriter out = null;

        //looking in the output file
        try{
            out = new PrintWriter(outputFile);
        }

        //if there is an error it prints out a message
        catch (FileNotFoundException e) {
            System.out.println ("Cannot open " + output);
            System.exit (0);
        }

        //prints the deatails of each student
        for (Student student : students) {
            out.println(student.toString());
        }

        // closes the output file
        out.close();
    }


}