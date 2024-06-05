package assignment1;
public class ConversionTest {
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t\tMeters\tFeet");
        System.out.println("----\t------\t\t------\t----");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = Conversion.footToMeter(feet);
            double meters2 = 20.0 + 5.0 * (feet - 1.0);
            double feet2 = Conversion.meterToFoot(meters2);
            System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f%n", feet, meters, meters2, feet2);
        }
    }

    public class Conversion {
        // convert from feet to meters
        public static double footToMeter(double feet) {
            return 0.305 * feet;
        }
    
        // convert from meters to feet
        public static double meterToFoot(double meter) {
            return 3.279 * meter;
        }
    }
}
