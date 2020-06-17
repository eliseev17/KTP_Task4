public class Task35 {
    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
    }

    public static String BMI(String weight, String height) {
        String[] Weight = weight.split(" ");
        String[] Height = height.split(" ");
        double ParsedWeight = Double.parseDouble(Weight[0]);
        double ParsedHeight = Double.parseDouble(Height[0]);
        final double kilosToPounds = 2.20462;
        final double metersToInches = 39.3701;
        if (Weight[1].equals("pounds"))
            ParsedWeight /= kilosToPounds;
        if (Height[1].equals("inches"))
            ParsedHeight /= metersToInches;
        double result = ParsedWeight / ParsedHeight / ParsedHeight;
        result = (double) (java.lang.Math.round(result * 10)) / 10;
        String category = "";
        if (result < 18.5)
            category = "Underweight";
        else if (result < 25)
            category = "Normal weight";
        else
            category = "Overweight";
        return Double.toString(result) + " " + category;
    }
}
