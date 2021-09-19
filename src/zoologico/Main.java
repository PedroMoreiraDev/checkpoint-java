package zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //iniciação dos arrays dois cuidadores fora do while
        List<Cuidador> arrayCuidadorMacaco = new ArrayList<>();
        List<Cuidador> arrayCuidadorLeao = new ArrayList<>();

        //iniciação dos arrays dois animais fora do while
        List<Macaco> arrayMacaco = new ArrayList<>();
        List<Leao> arrayLeao = new ArrayList<>();

        int j = 0;
        int l = 0;

        //criação do menu
        int opcoes = 1;
        while(opcoes >= 1 && opcoes <= 2) {
            System.out.println("Aperte 1 para adicionar um macaco, 2 para adicionar um leão e 0 para sair do programa: ");
            Scanner lerInput = new Scanner(System.in);
            opcoes = lerInput.nextInt();

            switch (opcoes) {
                case 1: //case 1 = macaco


                    int i = 0;
                    while (i <= 1000) {

                        //pegando atributos do macaco para inserir na instanciação
                        System.out.println("Informe o nome do macaco: ");
                        Scanner lerMacaco = new Scanner(System.in);
                        String nomeMacaco = lerMacaco.nextLine();
                        System.out.println("Informe a espécie do Macaco: ");
                        Scanner lerEspecieMacaco = new Scanner(System.in);
                        String especieMacaco = lerEspecieMacaco.nextLine();
                        System.out.println("Informe true ou false para a fome do macaco: ");
                        Scanner lerFomeMacaco = new Scanner(System.in);
                        Boolean fomeMacaco = lerFomeMacaco.nextBoolean();

                        //instanciando macaco com os atributos já coletados
                        Macaco construtorMacaco = new Macaco(nomeMacaco, especieMacaco, fomeMacaco);
                        //passando o objeto instanciado para o array
                        arrayMacaco.add(construtorMacaco);
                        i++;


                        while (j <= 1000) {

                            //pegando inputs para inserir na instanciação do Cuidador do Macaco
                            System.out.println("Informe o nome do cuidador do Macaco");
                            Scanner lerCuidador = new Scanner(System.in);
                            String nomeCuidador = lerCuidador.nextLine();
                            System.out.println("Informe o cpf do cuidador do Macaco");
                            Scanner lerCpfCuidador = new Scanner(System.in);
                            String cpfCuidador = lerCpfCuidador.nextLine();

                            //instanciando o obj cuidador do Macaco com os inputs coletados
                            Cuidador construtorCuidador = new Cuidador(nomeCuidador, cpfCuidador, arrayMacaco.get(i - 1));

                            //passando obj cuidado Macacojá instanciado para um array
                            arrayCuidadorMacaco.add(construtorCuidador);
                            j++;
                            break;
                        }
                        break;
                    }
                    break;
                case 2: //case 2 = adicionar leão

                    int k = 0;
                    while (k <= 1000) {
                        //pegando inputs para instanciar obj leão
                        System.out.println("Informe o nome do leão: ");
                        Scanner lerLeao = new Scanner(System.in);
                        String nomeLeao = lerLeao.nextLine();
                        System.out.println("Informe a espécie do leao: ");
                        Scanner lerEspecieLeao = new Scanner(System.in);
                        String especieLeao = lerEspecieLeao.nextLine();
                        System.out.println("Informe true ou false para a fome do leao: ");
                        Scanner lerFomeLeao = new Scanner(System.in);
                        Boolean fomeLeao = lerFomeLeao.nextBoolean();

                        //instanciando leão
                        Leao construtorLeao = new Leao(nomeLeao, especieLeao, fomeLeao);

                        //passando leão para array
                        arrayLeao.add(construtorLeao);
                        k++;


                        while (l <= 1000) {

                            //pegando inputs para instanciar obj cuidador do Leão
                            System.out.println("Informe o nome do cuidador do Leão");
                            Scanner lerCuidador = new Scanner(System.in);
                            String nomeCuidador = lerCuidador.nextLine();
                            System.out.println("Informe o cpf do cuidador do Leão");
                            Scanner lerCpfCuidador = new Scanner(System.in);
                            String cpfCuidador = lerCpfCuidador.nextLine();

                            //instanciando o obj cuidador leãocom os inputs coletados
                            Cuidador construtorCuidadorLeao = new Cuidador(nomeCuidador, cpfCuidador, arrayLeao.get(k - 1));
                            //armazenando o objt em um array
                            arrayCuidadorLeao.add(construtorCuidadorLeao);
                            l++;
                            break;
                        }
                        break;
                    }
                    break;
                case 3:
            }
        }
         //default

        //caso preencha 0 sem instanciar nenhum obj
        if(opcoes == 0 && arrayCuidadorMacaco.size() == 0 && arrayCuidadorLeao.size()==0) {
            System.out.println("Você saiu do programa antes de preencher os dados iniciais.");
        }
            // caso instancie obj e preencha 0
        if(opcoes == 0 && arrayCuidadorMacaco.size() != 0 || arrayCuidadorLeao.size() != 0) {
            if(arrayCuidadorMacaco.size() > 0) {
                for (int k = 0; k < arrayCuidadorMacaco.size(); k++) {
                    arrayCuidadorMacaco.get(k).cuidarMacaco();
                }
            }

            if(arrayCuidadorLeao.size()>0) {
                for (int k = 0; k < arrayCuidadorLeao.size(); k++) {
                    arrayCuidadorLeao.get(k).cuidarLeao();
                }
            }
        }
        //caso preencha qualquer numero no menu diferente do 0
        if(opcoes != 0) {
            System.out.println("Você apertou uma opção inválida!");
        }
    }
}




