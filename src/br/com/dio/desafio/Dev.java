package br.com.dio.desafio;


import java.util.LinkedHashSet;
import java.util.Set;

import br.com.Conteudo;

public class Dev {
private String nome; 
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
private double xpTotal;

public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add((Dev) this);
}

public void progredir() {
    if (!conteudosInscritos.isEmpty()) {
        Conteudo conteudo = conteudosInscritos.iterator().next();
        conteudosConcluidos.add(conteudo);
        conteudosInscritos.remove(conteudo);
        xpTotal += conteudo.calcularXp();
    } else {
        System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
}

public void calcularXp(){
    if (!conteudosConcluidos.isEmpty()) {
        for (Conteudo conteudo : conteudosConcluidos) {
            xpTotal += conteudo.calcularXp();
        }
    } else {
        System.err.println("Você não concluiu nenhum conteúdo!");
    }
    System.out.println("XP Total: " + xpTotal);
    System.out.println("Parabéns! você concluiu um bootcamp!");
    System.out.println("Você ganhou " + xpTotal + " XP!");
    System.out.println("Conteúdos concluídos: " + conteudosConcluidos);
    System.out.println("Conteúdos inscritos: " + conteudosInscritos);
  
}



public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;      

}

public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
}

public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
}

public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
}

public double getXpTotal() {
    return xpTotal;
}

public void setXpTotal(double xpTotal) {
    this.xpTotal =  

xpTotal;
}
}


