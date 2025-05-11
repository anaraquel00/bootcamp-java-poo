package br.com.dio.desafio;


import java.time.LocalDate;

import br.com.Conteudo;

public class Mentoria extends Conteudo {

    public void printData(LocalDate now) {
        System.out.println("Data: " + now);
    }

    private static final double XP_Padrao = 10;
    private LocalDate data;     

    public LocalDate getData() {    
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_Padrao + 20;
    }
     @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

   
