package view;

import model.Calcular;

import java.util.Scanner;

public class Game {

    static Scanner teclado = new Scanner(System.in);
    static int score = 0;
    static Calcular calcular;

    public static void main(String[] args) {
        Game.jogar();
    }

    public static void jogar(){
        System.out.println("********************************************************************************");
        System.out.println("informe o nível de dificuldade.: 1 - fácil | 2 - médio | 3 - difícil | 4 - insano ");
        int dificuldade = Game.teclado.nextInt();

        Game.calcular = new Calcular(dificuldade);

        System.out.println("Qual o resultado da operação abaixo? ");

        //Soma
        if(calcular.getOperacao() == 0){
            System.out.println(calcular.getValor1()+" + "+calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calcular.soma(resposta)){
                Game.score += 1;
                System.out.println("Você tem "+Game.score+" Ponto(s)");
            }
        }

        //Subtracao
        if(calcular.getOperacao() == 1){
            System.out.println(calcular.getValor1()+" - "+calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calcular.subtracao(resposta)){
                Game.score += 1;
                System.out.println("Você tem "+Game.score+" Ponto(s)");
            }
        }

        //Multiplicacao
        if(calcular.getOperacao() == 2){
            System.out.println(calcular.getValor1()+" * "+calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calcular.multiplicacao(resposta)){
                Game.score += 1;
                System.out.println("Você tem "+Game.score+" Ponto(s)");
            }
        }

        System.out.println("\n\nDeseja Continuar jogando? [0 - SIM] [1 - NÃO]");
        int continuar = Game.teclado.nextInt();

        if(continuar == 0){
            Game.jogar();
        }

    }
}
