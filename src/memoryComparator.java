import java.util.Comparator;

public class memoryComparator implements Comparator <Komputer> {

    @Override
    public int compare (Komputer k1, Komputer k2)  {
       if (k1.getMemory()>k2.getMemory()) return 1;
       else if (k1.getMemory()<k2.getMemory()) return -1;
       return 0;

    }

    public memoryComparator() {
    }
}
