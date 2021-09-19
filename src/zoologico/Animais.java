package zoologico;

public abstract class Animais {
    private String  nome;
    private String especie;
    private boolean fome;

    public Animais(String nome, String especie, boolean fome) {
        this.nome = nome;
        this.especie = especie;
        this.fome = fome;
    }
//função abstrata que os animais irão executar
        public abstract String acao();


//gets e seters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public boolean isFome() {
        return fome;
    }
    public void setFome(boolean fome) {
        this.fome = fome;
    }
}

