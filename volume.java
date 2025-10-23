public interface Volume {  // Changed 'volume' to 'Volume'
    double Innervolume();
    double outervolume();
}

public class PartMain implements Volume {
    private double s1, s2, s3;

    PartMain(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // Inner volume calculation
    public double Innervolume() {
        return (1.0 / 3) * Math.PI * s1 * s2 * s3;
    }

    // Outer volume calculation
    public double outervolume() {
        return (4.0 / 3) * Math.PI * s1 * s2 * s3;
    }

    public static void main(String[] args) {
        PartMain p = new PartMain(10, 20, 30);
        System.out.println("Inner Volume is " + p.Innervolume());
        System.out.println("Outer Volume is " + p.outervolume());
    }
}
