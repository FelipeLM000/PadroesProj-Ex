package Exemplo_Adapter;

public class Cachorro implements Animal {
    @Override
    public void comer() {
        System.out.println("Vou atrás de ração!");
    }
}
