package p0_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int n = 3;
        GeomInterface g[] = new GeomInterface[n];
        g[0] = new Line();
        g[1] = new Rectangle();
        g[2] = new Triangle();

        for (GeomInterface geom : g) {
            ((Geom) geom).draw();
            if (geom instanceof MathGeom) {
                System.out.println(((MathGeom) geom).getSquare());
            }
            System.out.println(Arrays.toString(geom.getCoords()));
        }
    }
}
