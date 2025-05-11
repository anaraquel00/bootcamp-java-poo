package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.Conteudo;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); ;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }   


    public Set<Conteudo> getConteudosInscritos() {
        
        return conteudos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setConteudos(Collection<? extends Conteudo> conteudos) {
        this.conteudos = new LinkedHashSet<>(conteudos);
    }

    public Collection<? extends Conteudo> getConteudos() {
        
        return conteudos;
    }

    public String getDataTermino() {
        return "Data de término: " + dataFinal;
    }

}
