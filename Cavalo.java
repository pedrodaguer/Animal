
package br.univali.cc.zoologico.dominio;


public class Cavalo extends Animal implements Corredor, Som {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void correr() {
        System.out.println("Galopando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchando...");
    }
   
}
