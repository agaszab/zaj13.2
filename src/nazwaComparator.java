import java.util.Comparator;

public class nazwaComparator  implements Comparator <Komputer>{

  @Override
  public int compare (Komputer k1, Komputer k2)  {
      return k1.getName().compareTo(k2.getName());

  }

    public nazwaComparator() {
    }
}
