package day15;

public class Shoes {
    private String model;
    private int size;
    private int kol;

    public Shoes(String model, int size, int kol) {
        this.model = model;
        this.size = size;
        this.kol = kol;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    @Override
    public String toString() {
        return "\n" + model + ", " + size + ", " + kol;
    }
}
