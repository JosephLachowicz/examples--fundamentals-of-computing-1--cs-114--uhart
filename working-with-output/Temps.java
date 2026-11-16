public class Temps{

    public static void main(String[] args) {
        int temps[] = {21, 25, 19, 30, 27};
        int highest = temps[0];

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > highest) {
                highest = temps[i];
            }
        }

        System.out.println("The highest temperature is: " + highest);
    }
}