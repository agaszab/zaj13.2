import java.util.*;

public class Program {

    public static void main(String[] args) {


        Komputer komp1 = new Komputer("komputerX", 356, 600);
        Komputer komp2 = new Komputer("komputerY", 500, 900);
        Komputer komp3 = new Komputer("komputerY", 500, 400);
        Komputer komp4 = new Komputer("komputerY", 200, 1400);

        Komputer komp5 = new Komputer("komputerY", 100, 400);
        Komputer komp6 = new Komputer("komputerY", 800, 1400);

        List<Komputer> komputery = new ArrayList<>();

        komputery.add(komp1);
        komputery.add(komp2);
        komputery.add(komp3);
        komputery.add(komp4);


        Komputer[] kompy = new Komputer[3];

        kompy[0] = komp4;
        kompy[1] = komp5;
        kompy[2] = komp6;

        //   Collections.sort(komputery);
        //   System.out.println(komputery);





        OpcjeSortowania[] opcje = OpcjeSortowania.values();

        System.out.println("Wybierz opbję sortowania:");

        for (OpcjeSortowania opcja : opcje) {
            System.out.println(opcja);
        }

        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt();

        Comparator comparator;

        switch (wybor) {
            case 0: comparator = new nazwaComparator();
                break;
            case 1:
                comparator = new memoryComparator();

                break;

            case 2:
                comparator = new speedComparator();
                break;

            default: comparator = new nazwaComparator();

        }


        Arrays.sort(kompy, comparator);
        String tab=Arrays.toString(kompy);
        System.out.println(tab);
    }
}
