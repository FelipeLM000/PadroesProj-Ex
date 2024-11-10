package Exemplo_Adapter;

public class DinossauroAdapter implements Animal{

    private final Dinossauro dinossauro = new Dinossauro();
    
    @Override
    public void comer(){
        dinossauro.horaDeComer();
    }


}
