package Level1_practice;

public class PenForStudent {
    public static void main(String[] args){
        int pens = 14;
        int students = 3;
        int PenPerStudent = (pens / students);
        int RemainingPen = (pens % students);
        System.out.println("The Pen Per Student is " + PenPerStudent + " and the remaining pen not distributed is " + RemainingPen);
    }
}
