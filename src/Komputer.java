
public class Komputer implements Comparable <Komputer>{
    private String name;
    private int cpu;
    private int memory;

    public Komputer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public int compareTo(Komputer k) {
        //  if (this.name==k.name) && (this.cpu==k.cpu) && (this.memory==k.memory)
        //      return 0
        if (this.cpu > k.cpu)
            return 1;
        else if (this.cpu < k.cpu)
            return -1;

        if (this.memory > k.memory)
            return 1;
        else  if (this.memory < k.memory)
            return -1;

        return this.name.compareTo(k.name);



    }

    @Override
    public String toString() {
        return "Komputer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }
}
