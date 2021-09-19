package zoologico;

public class Macaco extends Animais {

    public Macaco(String nome, String especie, boolean fome) {
        super(nome, especie, fome);
    }



    @Override
    public String acao() {

        if(this.isFome() == true){
            return "bate na grade";
        }


        return null;
    }


}
