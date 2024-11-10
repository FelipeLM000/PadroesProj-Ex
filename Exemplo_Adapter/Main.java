package Exemplo_Adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Leao());
        animais.add(new DinossauroAdapter());

        animais.forEach(Animal::comer);

    }
    
}