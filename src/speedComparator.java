import java.util.Comparator;

public class speedComparator implements Comparator <Komputer> {

    @Override
    public int compare (Komputer k1, Komputer k2)  {
        if (k1.getCpu()>k2.getCpu()) return 1;
        else if (k1.getCpu()<k2.getCpu()) return -1;
        return 0;

    }

    public speedComparator() {
    }
}
