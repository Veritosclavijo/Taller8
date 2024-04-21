package gradebook;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeBook {

    private String courseName;
    private int total;
    private int grade;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;





    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {

        courseName = name;
    }

    public String getCourseName() {

        return courseName;
    }


    public void displayMessage(){
        System.out.printf("Bienvenido a la planilla de notas" + getCourseName());

    }

    public void inputGrades(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Ingrese su nota en un rango de 0 a 100\n");

        while (input.hasNext()){
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            incrementLetterGradeCounter(grade);

            if (gradeCounter != 0) {

                double average = (double) total / gradeCounter;

                System.out.println("Total de las notas ingresadas es: " + total);
                System.out.println("El promedio de la clase es: " + average);
                System.out.println("número de estudiantes que recibieron cada nota: \n" +
                        "A: " + aCount + "\n" +
                        "B: " + bCount + "\n" +
                        "C: " + cCount + "\n" +
                        "D: " + dCount + "\n" +
                        "F: " + fCount);
            } else {
                System.out.println("no ingresaron notas");
            }
        }

    }

    private void incrementLetterGradeCounter(int grade){
        switch (grade/10){
            case 9:
            case 10:
                ++aCount;
                break;

            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;

            default:
                ++fCount;
                break;


        }


    }







}
