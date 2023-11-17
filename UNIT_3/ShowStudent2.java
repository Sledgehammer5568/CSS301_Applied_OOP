/**
 * Filename ShowStudent2.java
 *
 * this file was provided to test the Student.java file
 */

class ShowStudent2
{
    public static void main (String args[])
    {
        Student pupil = new Student();
        pupil.showIdNumber();
        pupil.showPoints();
        pupil.showHours();
        System.out.println("The grade point average is " +
                pupil.getGradePoint());
    }
}