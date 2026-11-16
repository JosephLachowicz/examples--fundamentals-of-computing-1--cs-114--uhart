public class Mains {

    public static void main(String[] args) {
        Student[] Class = new Student[4];

        Class[0] = new Student();
        Class[0].name = "Joe";
        Class[0].grades = new int[]{80, 90, 100};

        Class[1] = new Student();
        Class[1].name = "Kayton";
        Class[1].grades = new int[]{70, 65, 90};

        Class[2] = new Student();
        Class[2].name = "Anthony";
        Class[2].grades = new int[]{95, 92, 98};

        Class[3] = new Student();
        Class[3].name = "Sitara";
        Class[3].grades = new int[]{60, 80, 100};

        double bestAverage = 0;
        String bestStudent = "";

        for (int i = 0; i < Class.length; i++) {
            int sum = 0;
            for (int j = 0; j < Class[i].grades.length; j++) {
                sum += Class[i].grades[j];
            }
            double average = (double) sum / Class[i].grades.length;
            if (average > bestAverage) {
                bestAverage = average;
                bestStudent = Class[i].name;
            }
        }
        System.out.println("The best student is: " + bestStudent);
        System.out.println("The best average grade is: " + bestAverage);



    }
}