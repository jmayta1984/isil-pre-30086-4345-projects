package pe.isil;

public class Cliente {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprimirInfo() {
        System.out.println(name);
    }
}
