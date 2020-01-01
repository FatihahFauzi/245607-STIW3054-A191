package Assignment_1;

import java.util.ArrayList;

public class Pair_Table {
    ArrayList<Data> studentsub = new ArrayList<Data>();
    ArrayList<Data> studentNotsub = new ArrayList<Data>();
    public void check(ArrayList<Data> studentSubmittedList, ArrayList<Data> studentList) {

        for (int x = 1; x < studentSubmittedList.size(); x++) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentSubmittedList.get(x).getMatric().equals(studentList.get(i).getMatric())||studentSubmittedList.get(x).getName().equals(studentList.get(i).getName())) {
                    studentsub.add(new Data(studentSubmittedList.get(x).getName(), studentSubmittedList.get(x).getMatric(), studentSubmittedList.get(x).getLink()));
                }
            }
        }
        System.out.println("");
        System.out.println("|***********************List all students who have submitted ***********************************|");
        System.out.println("");
        System.out.println("|***********************************************************************************************|");
        System.out.println("| No. | Matric | Name                                  | GitHub Link                            |");
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
        for (int i = 0; i < studentsub.size(); i++) {
            System.out.printf("|%-5s|%-8s|%-39s|%-40s|\n",i+1,studentsub.get(i).getMatric(),studentsub.get(i).getName(),studentsub.get(i).getLink());
        }

        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
    }

    public void studentnotsubmitted(ArrayList<Data> studentSubmittedList, ArrayList<Data> studentList) {
        int s = 0;
        studentNotsub = studentList;

        for (int x = 1; x < studentSubmittedList.size(); x++) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentSubmittedList.get(x).getMatric().equals(studentList.get(i).getMatric()) || studentSubmittedList.get(x).getName().equals(studentList.get(i).getName()) || studentSubmittedList.get(x).getLink().equals(studentList.get(i).getLink())){
                    studentsub.add(new Data(studentSubmittedList.get(x).getName(), studentSubmittedList.get(x).getMatric(), studentSubmittedList.get(x).getLink()));
                    s=i;
                    studentNotsub.remove(s);  //studentSubmittedList.get(x).getLink().equals((studentList.get(i).getLink())
                }
            }
        }

        System.out.println("");
        System.out.println("|**************************List all students who have not submitted*****************************|");
        System.out.println("");
        System.out.println("|***********************************************************************************************|");
        System.out.println("| No. | Matric | Name                                  | GitHub Link                            |");
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
        for (int i = 0; i < studentNotsub.size(); i++) {
            System.out.printf("|%-5s|%-8s|%-39s|\n", i + 1, studentNotsub.get(i).getMatric(), studentNotsub.get(i).getName(),studentNotsub.get(i).getLink());
        }

        System.out.println("|-----|--------|--------------------------------------------------------------------------------|");
    }


    public  ArrayList getstudentSub(){
        return studentsub;
    }
    public  ArrayList getstudentNotSub(){
        return  studentNotsub;
    }

}
