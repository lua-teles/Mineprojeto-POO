package CAMPEONATO;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
public class Campeonato {
    //clubes
    public ArrayList<Clube> clube = new ArrayList<Clube>();


    public Campeonato(ArrayList<Clube> clube){
        this.clube = clube;
    }

    public void jogarCampeonato(){

        for(int i = 0; i < clube.size();i++){
            for(int j = 0; j < clube.size();j++ ){
                //como i e j começa em 0 eles vão se encontar algumas vezes;
                if(i == j){
                    continue;
                }
                else{
                    jogarPartida(clube.get(i), clube.get(j));
                }
            }
        }
    }
    //jogarpartida(Clube m, Clube v)

    private void jogarPartida(Clube m, Clube n){
        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";
        Random rand = new Random();
        int golsClubm = rand.nextInt(6);
        int golsClubn = rand.nextInt(6);

        int saldoM = golsClubm - golsClubn;
        int saldoN = golsClubn - golsClubm;

        System.out.println("Gols de: " +m.nome+ " " + golsClubm);
        System.out.println("Gols de: " +n.nome+ " " + golsClubn);
        System.out.println("Vencedor:");

        if(golsClubm>golsClubn){
            System.out.println(RED + m.nome + RESET);
            m.ganhar(saldoM);
            n.perder(saldoN);
            System.out.println("Pontos de: " + m.nome + ": " + m.pontos + "\nPontos de: " + n.nome + ": " + n.pontos + "\n");

        }
        else if(golsClubm<golsClubn){
            System.out.println(RED + n.nome + RESET);
            n.ganhar(saldoN);
            m.perder(saldoM);
            System.out.println("Pontos de: " + m.nome + ": " + m.pontos + "\nPontos de: " + n.nome + ": " + n.pontos + "\n");
        }
        else{
            n.empatar();
            m.empatar();
            System.out.println("Empate\n" + "Pontos de: " + m.nome + ": " + m.pontos + "\nPontos de: " + n.nome + " " + n.pontos + "\n");

        }

    }
    //getClassificação()
    public String getClassificaçao(){
        for(int i = 0; i < this.clube.size();i++){
            for(int j = i+1; j<this.clube.size();j++){
                Clube m = this.clube.get(i);
                Clube n = this.clube.get(j);
                if(m.pontos<n.pontos || (m.pontos == n.pontos && m.saldoGols < n.saldoGols)){
                    this.clube.set(i,n);
                    this.clube.set(j,m);
                }
            }
        }
        StringBuilder colocaçao = new StringBuilder();
        colocaçao.append("");
        for (int i = 0; i < this.clube.size(); i++) {
            colocaçao.append(this.clube.get(i).nome + " - Pontos: " + this.clube.get(i).pontos + ", Saldo: " + this.clube.get(i).saldoGols);
            if (i < this.clube.size() - 1) {
                colocaçao.append("\n");
            }
        }
        colocaçao.append("");
        return colocaçao.toString();
    }
    //getCampeao()
    public Clube getCampeao(){
        return this.clube.get(0);
    }
}
