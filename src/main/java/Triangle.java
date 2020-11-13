public class Triangle {

    private final int length1;
    private final int length2;
    private final int length3;

    public Triangle(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    String getType() {

        if (length1 + length2 > length3 && length1 + length3 > length2 && length2 + length3 > length1) {
            if (length1 == length2 && length2 == length3) {
                return "Equilateral";
            } else if (length1 == length2 || length1 == length3 || length2 == length3) {
                return "Isosceles";
            }

            return "Scalene";
        }
        return "Invalid";
    }
}
