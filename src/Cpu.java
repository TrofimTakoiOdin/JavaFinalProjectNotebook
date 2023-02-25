public class Cpu {
    private String name;
    private String cpuFrequency;
    private int coresNumber;

    public Cpu(String name, String cpuFrequency, int coresNumber) {
        this.name = name;
        this.cpuFrequency = cpuFrequency;
        this.coresNumber = coresNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(String cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                ",\n cpuFrequency=" + cpuFrequency + "GHz" +
                ",\n coresNumber=" + coresNumber +
                '}';
    }
    @Override
    public boolean equals (Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Cpu other))//если объект проверки не является типом Cpu
            return false;
        if (this.name.equals(other.name)&&this.cpuFrequency.equals(other.cpuFrequency)
                &&this.coresNumber==other.coresNumber)
            return true;
        else return false;
    }
}
