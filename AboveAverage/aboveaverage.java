import java.util.Scanner;

class aboveaverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int i = 0; i < cases; i++) {
            int people = s.nextInt();
            int[] grades = new int[people];
            int classAverage = 0;
            for (int j = 0; j < people; j++) {
                int currentGrade = s.nextInt();
                grades[j] = currentGrade;
                classAverage += currentGrade;
            }
            classAverage /= people;
            int studentsAboveAverage = 0;
            for (int grade : grades) {
                if (grade > classAverage) {
                    studentsAboveAverage += 1;
                }
            }
            System.out.println(String.format("%.3f", ((float) studentsAboveAverage / (float) people) * 100) + "%");
        }
        s.close();
    }
}