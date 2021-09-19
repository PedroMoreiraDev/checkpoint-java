package zoologico;

public class Leao extends Animais{

    public Leao(String nome, String especie, boolean fome) {
        super(nome, especie, fome);
    }

    @Override
    public String acao() {

        if(this.isFome() == true){
            return "Rugir!";
        }


        return null;
    }


}
