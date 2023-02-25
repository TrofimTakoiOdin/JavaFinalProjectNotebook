import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private List<Cpu> cpus = new ArrayList<>();


    public void NotebookMod(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }



    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void addCpu(Cpu cpu){
        this.cpus.add(cpu);
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", \n" + cpus +
                '}';
    }
    @Override
    public boolean equals (Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Notebook))//если объект проверки не является типом Notebook
            return false;
        Notebook other = (Notebook) obj;
        if (this.ram == other.ram && this.hdd == other.hdd && this.os.equals(other.os)&&
                this.color.equals(other.color) && this.cpus.equals(other.cpus))
            return true;
        else return false;
    }
}
