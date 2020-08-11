public class Main {
    public static void main(String[] args) {
        String unnamedPlayer = "unknown";
        printScore("peter", calculateScore("peter",500));
        printScore("unknown",calculateScore(100));

        int feet  = 5;
        int inches = 12;
        printImperialToMetricConversion(feet, inches, feetAndInchesToCentimeters(feet,inches));
        inches = 50;
        feet = 0;
        printImperialToMetricConversion(feet, inches, feetAndInchesToCentimeters(inches));

    }

    private static double feetAndInchesToCentimeters(int inches) {
        double centimeters = -1;
        if(inches>=0 ){
            //calculate feet
            int feet = inches/12;
            int inches2 = inches%12;
            centimeters = feetAndInchesToCentimeters(feet,inches2);
        }
        return centimeters;
    }

    private static void printImperialToMetricConversion(double feet, double inches, double centimeters) {
        System.out.println(feet +" feet and "+ inches +" inches is "+ centimeters +" centimeters");
    }

    private static double feetAndInchesToCentimeters(int feet, int inches) {
        double centimeters = -1;
        if(feet>=0 && (inches>=0 && inches<=12)){
            //calculate centimeters
            centimeters = (feet*12*2.54) + (inches*2.54);
        }
            return centimeters;
    }

    private static void printScore(String name, int score) {
        System.out.println(name+"'s score is:"+score);
    }

    private static int calculateScore(String player, int score) {
        return score*1000;
    }

    private static int calculateScore(int score) {
        return score*1000;
    }
}
