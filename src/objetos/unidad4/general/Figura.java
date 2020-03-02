package objetos.unidad4.general;

public class Figura {
    private String name;

    protected Figura(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
