# 🚀 Bootcamp Java POO - Projeto Completo

## 📌 Visão Geral
Projeto desenvolvido para praticar **Programação Orientada a Objetos** em Java, simulando um sistema de bootcamp com cursos, mentorias e desenvolvedores.

## 🏗️ Estrutura do Projeto
```bash
src/
└── br/com/dio/desafio/
    ├── Conteudo.java       # Classe abstrata base
    ├── Curso.java          # Implementação de cursos
    ├── Mentoria.java       # Implementação de mentorias
    ├── Bootcamp.java       # Gerenciamento do bootcamp
    ├── Dev.java            # Classe de desenvolvedores
    └── Main.java           # Ponto de entrada do programa
```
# 🛠️ Funcionalidades Principais
1. Cadastro de Cursos
```bash
public class Curso extends Conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
2. Cadastro de Mentorias
java
public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
```
3. Gerenciamento de Bootcamp
```bash   
public class Bootcamp {
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
}
```
# 💻 Como Executar
Clone o repositório:

```bash
git clone https://github.com/javajdk2023/bootcamp-poo.git
```
# Compile e execute:

```bash
javac src/br/com/dio/desafio/Main.java -d bin
java -cp bin br.com.dio.desafio.Main
```

# 🧩 Exemplo de Uso
```bash
Cadastrando um novo curso:

Curso cursoJava = new Curso();
cursoJava.setTitulo("Java OO");
cursoJava.setDescricao("Aprenda POO com Java");
cursoJava.setCargaHoraria(8);
```
# 📊 Diagrama de Classes
```bash
classDiagram
    class Conteudo {
        <<abstract>>
        +String titulo
        +String descricao
        +calcularXp() double
    }
    
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    
    class Bootcamp {
        +String nome
        +Set~Dev~ devsInscritos
        +Set~Conteudo~ conteudos
    }
    
    class Dev {
        +String nome
        +Set~Conteudo~ conteudosInscritos
        +Set~Conteudo~ conteudosConcluidos
    }
```
# 🔧 Tecnologias Utilizadas
Java 17

Java Collections Framework

Java Time API

Paradigma OO

# 📚 Conceitos POO Aplicados
**Conceito**	

**Exemplo no Projeto**

**Abstração**	

**Classe abstrata**

**Conteudo**

**Encapsulamento**

**Atributos privados + getters/setters**

**Herança**	

**Curso e Mentoria herdam de Conteudo**

**Polimorfismo**	

**Método calcularXp() sobrescrito**

# 🔮 Roadmap
Persistência em banco de dados

Interface web

Testes unitários

Sistema de avaliações

👩‍💻 Autora
Ana Raquel
GitHub
