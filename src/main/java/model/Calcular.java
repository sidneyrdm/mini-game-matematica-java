package model;

import java.util.Random;

public class Calcular {
    
    private int dificuldade;
    private int valor1, valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade){
        Random random = new Random();
        this.operacao = random.nextInt(3); // 0 - soma | 1 - subtração | 2 - multiplicação

        this.dificuldade = dificuldade;

        if(dificuldade == 1){
            //Fácil
            this.valor1 = random.nextInt(10); // gerar valor aleatório entre 0 e 9
            this.valor2 = random.nextInt(10); // gerar valor aleatório entre 0 e 9
        }else if(dificuldade == 2){
            //Médio
            this.valor1 = random.nextInt(100); // gerar valor aleatório entre 0 e 99
            this.valor2 = random.nextInt(100); // gerar valor aleatório entre 0 e 99
        }else if(dificuldade == 3){
            //Difícil
            this.valor1 = random.nextInt(1000); // gerar valor aleatório entre 0 e 999
            this.valor2 = random.nextInt(1000); // gerar valor aleatório entre 0 e 999
        }else if(dificuldade == 4){
            //Insano
            this.valor1 = random.nextInt(10000); // gerar valor aleatório entre 0 e 9999
            this.valor2 = random.nextInt(10000); // gerar valor aleatório entre 0 e 9999
        }else{
            ///Ultra
            this.valor1 = random.nextInt(100000); // gerar valor aleatório entre 0 e 99999
            this.valor2 = random.nextInt(100000); // gerar valor aleatório entre 0 e 99999
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString(){
        String op = "";
        if(this.getOperacao() == 0){
            op = "Soma";
        }else if(this.getOperacao() == 1){
            op = "Subtração";
        }else{
            op = "Multiplicação";
        }

        return "valor 1.: "+this.getValor1() +
                "\nValor 2.: "+this.getValor2() +
                "\nDificuldade.: "+this.getDificuldade() +
                "\nOperação.: "+op;
    }

    public boolean soma(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean correto = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Incorreta!");
        }
        System.out.println(this.getValor1()+" + "+this.getValor2()+" = "+this.getResultado());
        return correto;
    }

    public boolean subtracao(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean correto = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Incorreta!");
        }
        System.out.println(this.getValor1()+" - "+this.getValor2()+" = "+this.getResultado());
        return correto;
    }

    public boolean multiplicacao(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean correto = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Incorreta!");
        }
        System.out.println(this.getValor1()+" * "+this.getValor2()+" = "+this.getResultado());
        return correto;
    }

}
