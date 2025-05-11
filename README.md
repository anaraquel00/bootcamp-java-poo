# Bootcamp Java POO

Este projeto foi desenvolvido como parte de um bootcamp para reforçar os conceitos de **Programação Orientada a Objetos (POO)** em Java. Ele simula a estrutura de um bootcamp, permitindo a criação de cursos, mentorias, desenvolvedores e a inscrição destes em um bootcamp. O objetivo é aplicar os pilares da POO: **abstração**, **encapsulamento**, **herança** e **polimorfismo**.

---

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src`**: Contém os arquivos-fonte do projeto.
  - **`br.com.dio.desafio`**: Pacote principal com as classes do domínio.
    - `Curso`: Representa um curso com título, descrição e carga horária.
    - `Mentoria`: Representa uma mentoria com título, descrição e data.
    - `Bootcamp`: Representa o bootcamp, contendo cursos, mentorias e desenvolvedores inscritos.
    - `Dev`: Representa um desenvolvedor que pode se inscrever em bootcamps e progredir nos conteúdos.
    - `Conteudo`: Classe abstrata que serve como base para `Curso` e `Mentoria`.
  - **`Main`**: Classe principal que executa o programa e permite a interação com o usuário.

---

## Funcionalidades

### 1. **Cadastro de Cursos**
- Permite criar cursos com:
  - Título
  - Descrição
  - Carga horária
- Calcula o XP (experiência) com base na carga horária.

### 2. **Cadastro de Mentorias**
- Permite criar mentorias com:
  - Título
  - Descrição
  - Data
- Calcula o XP com base em um valor padrão.

### 3. **Criação de Bootcamps**
- Permite criar bootcamps com:
  - Nome
  - Descrição
  - Lista de conteúdos (cursos e mentorias).
- Define automaticamente a data de início e término (45 dias de duração).

### 4. **Cadastro de Desenvolvedores**
- Permite cadastrar desenvolvedores e inscrevê-los em bootcamps.
- Gerencia o progresso do desenvolvedor:
  - Conteúdos inscritos
  - Conteúdos concluídos
  - XP total acumulado

---

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Java Time API**: Para manipulação de datas.
- **Scanner**: Para entrada de dados pelo usuário.
- **Coleções Java**: Uso de `Set` e `LinkedHashSet` para gerenciar listas de conteúdos e desenvolvedores.

---

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
```

2. Abra o projeto no Visual Studio Code.
3. Compile e execute o arquivo Main.java:
* No terminal
```bash
javac src/Main.java -d bin
java -cp bin Main
```

* Ou use a interface do VS Code para compilar e executar.
4. Interaja com o programa:
* Insira os dados solicitados para criar cursos, mentorias, bootcamps e desenvolvedores.

Exemplos de uso
Entrada:
```bash
=== Cadastro de Curso ===
Digite o título do curso: Java Básico
Digite a descrição do curso: Introdução à linguagem Java
Digite a carga horária do curso (em horas): 10

=== Cadastro de Mentoria ===
Digite o título da mentoria: Mentoria de Java
Digite a descrição da mentoria: Dicas práticas para iniciantes
```
Saida:
```bash
Curso: Java Básico
Descrição: Introdução à linguagem Java
Carga Horária: 10 horas
XP: 100.0

Mentoria: Mentoria de Java
Descrição: Dicas práticas para iniciantes
Data: 11/05/2025
XP: 30.0
```

Conceitos de POO Aplicados
1. Abstraçao:
* Representaçao de conceitos como Curso, Mentoria, Bootcamp e Dev.
2.Encapsulamento:
* Uso de modificadores de acessos (private, public) e métodos get e set.
3. Herança:
* Curso e Mentoria herdam da classe abstrata Conteudo.
4. Polimorfismo:
* Implementaçao do método calculadoraXp() de forma diferente em Curso e Mentoria.

Melhorias Futuras

* Adicionar persistência de dados (salvar e carregar informaçoes de arquivos).
* Implementar uma interface grafica para facilitar a interaçao.
* Adicionar testes unitarios para validar as funcionalidades.

Autor 

Projeto desenvolvido por Ana Raquel 
Bootcamp oferecido pela DIO - Digital Innovation One.
