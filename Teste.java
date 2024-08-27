import CAMPEONATO.Campeonato;
import CAMPEONATO.Clube;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Clube> clube = new ArrayList<Clube>();

        Campeonato campeonato = new Campeonato(clube);

        System.out.println("Insira a quantidade de times, entre 2 e 6, que participarão do campeonato");

        int n = scan.nextInt();
        switch (n){

            case 1:
                System.out.println("Número invalido de times");
                break;
            case 2:
                clube.add(new Clube("Bar_sem_lona"));
                clube.add(new Clube("CaiNaRealMadrid"));
                break;
            case 3:
                clube.add(new Clube("Bar_sem_lona"));
                clube.add(new Clube("CaiNaRealMadrid"));
                clube.add(new Clube("Bayern de Favela"));
                break;
            case 4:
                clube.add(new Clube("Bar_sem_lona"));
                clube.add(new Clube("CaiNaRealMadrid"));
                clube.add(new Clube("Bayern_de_Favela"));
                clube.add(new Clube("Chuta_que_é_macumba"));
                break;
            case 5:
                clube.add(new Clube("Bar_sem_lona"));
                clube.add(new Clube("CaiNaRealMadrid"));
                clube.add(new Clube("Bayern_de_Favela"));
                clube.add(new Clube("Chuta_que_é_macumba"));
                clube.add(new Clube("Esquenta_Banco"));
                break;
            case 6:
                clube.add(new Clube("Bar_sem_lona"));
                clube.add(new Clube("CaiNaRealMadrid"));
                clube.add(new Clube("Bayern_de_Favela"));
                clube.add(new Clube("Chuta_que_é_macumba"));
                clube.add(new Clube("Esquenta_Banco"));
                clube.add(new Clube("Turma_do_Pagode"));
                break;
        }
    campeonato.jogarCampeonato();
        String colocaçao = campeonato.getClassificaçao();
        Clube Campeao = campeonato.getCampeao();

        final String GREEN = "\u001B[32m";
        final String PURPLE = "\u001B[35m";
        final String RESET = "\u001B[0m";
        final String CYAN = "\u001B[36m";
        System.out.println(GREEN + "[RANK FINAL]" + RESET);
        System.out.println(PURPLE + colocaçao + RESET);
        System.out.println("\nParabéns ao campeão:\n" + CYAN + Campeao.nome + "!" + RESET);



    }
}
