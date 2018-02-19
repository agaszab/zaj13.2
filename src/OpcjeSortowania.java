public enum OpcjeSortowania {
    NAZWA ("sortowanie po nazwie - 0",0),
    CPU ("sortowanie po prędkości -1",1),
    RAM ("sortowanie po pamięci -2",2);

    String name;
    int index;

    public int getIndex() {
        return index;
    }

    OpcjeSortowania(String name, int i) {
        this.name = name;
        this.index = i;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
