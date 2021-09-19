package zoologico;

import java.security.spec.RSAOtherPrimeInfo;

public class Cuidador {
    private String nome;
    private String cpf;
    private Macaco Macaco;
    private Leao Leao;

    public Cuidador(String nome, String cpf, Macaco macaco) {
        this.nome = nome;
        this.cpf = cpf;
       Macaco = macaco;
    }

    public Cuidador(String nome, String cpf, Leao leao) {
        this.nome = nome;
        this.cpf = cpf;
        Leao = leao;
    }

    public void cuidarMacaco() {
        if (Macaco.acao() == null) {

            System.out.println("O macaco " + this.Macaco.getNome() + " não precisa de cuidados. Eu " + this.nome + ", Vou alimentar outro animal.");
        } else {
            System.out.println("Eu " + this.nome + ", estou alimentando o Macaco " + this.Macaco.getNome());
        }
    }


    public void cuidarLeao() {
        if (Leao.acao() == null) {

            System.out.println("O leao " + this.Leao.getNome() + " não precisa de cuidados. Eu " + this.nome + ", Vou alimentar outro animal.");
        } else {
            System.out.println("Eu " + this.nome + ", estou alimentando o Leão " + this.Leao.getNome());
        }
    }
    }




