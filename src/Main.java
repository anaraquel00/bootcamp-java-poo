import java.time.LocalDate;
import java.util.Scanner;

import br.com.Conteudo;
import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um curso interativamente
        System.out.println("=== Cadastro de Curso ===");
        Curso curso = new Curso();
        System.out.print("Digite o título do curso: ");
        curso.setTitulo(scanner.nextLine());
        System.out.print("Digite a descrição do curso: ");
        curso.setDescricao(scanner.nextLine());
        System.out.print("Digite a carga horária do curso (em horas): ");
        curso.setCargaHoraria(scanner.nextInt());
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Curso cadastrado com sucesso!");
        System.out.println("====================================");

        // Exibindo informações do curso
        System.out.println("Curso: " + curso.getTitulo());
        System.out.println("Descrição: " + curso.getDescricao());
        System.out.println("Carga Horária: " + curso.getCargaHoraria() + " horas");
        System.out.println("XP: " + curso.calcularXp());
        System.out.println("====================================");

        // Criando uma mentoria interativamente
        System.out.println("=== Cadastro de Mentoria ===");
        Mentoria mentoria = new Mentoria();
        System.out.print("Digite o título da mentoria: ");
        mentoria.setTitulo(scanner.nextLine());
        System.out.print("Digite a descrição da mentoria: ");
        mentoria.setDescricao(scanner.nextLine());
        mentoria.setData(LocalDate.now());
        System.out.println("Mentoria cadastrada com sucesso!");
        System.out.println("====================================");

        // Exibindo informações da mentoria
        System.out.println("Mentoria: " + mentoria.getTitulo());
        System.out.println("Descrição: " + mentoria.getDescricao());
        System.out.println("Data: " + mentoria.getData());
        System.out.println("XP: " + mentoria.calcularXp());
        System.out.println("====================================");
        // Exibindo informações da mentoria com data formatada
        System.out.println("Mentoria: " + mentoria.getTitulo());
        System.out.println("Descrição: " + mentoria.getDescricao());
        System.out.println("Data: " + mentoria.getData().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("XP: " + mentoria.calcularXp());
        System.out.println("====================================");


        // Criando um bootcamp interativamente
        System.out.println("=== Cadastro de Bootcamp ===");
        Bootcamp bootcamp = new Bootcamp();
        System.out.print("Digite o nome do bootcamp: ");
        bootcamp.setNome(scanner.nextLine());
        System.out.print("Digite a descrição do bootcamp: ");
        bootcamp.setDescricao(scanner.nextLine());
        bootcamp.getConteudosInscritos().add(curso);
        bootcamp.getConteudosInscritos().add((Conteudo) mentoria);
        System.out.println("Bootcamp cadastrado com sucesso!");
        System.out.println("====================================");

        // Exibindo informações do bootcamp
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Data Inicial: " + bootcamp.getDataInicial());
        System.out.println("Data Final: " + bootcamp.getDataFinal());
        System.out.println("Conteúdos inscritos: " + bootcamp.getConteudosInscritos());
        System.out.println("====================================");
        

        // Criando um desenvolvedor interativamente
        System.out.println("=== Cadastro de Desenvolvedor ===");
        Dev dev = new Dev();
        System.out.print("Digite o nome do desenvolvedor: ");
        dev.setNome(scanner.nextLine());
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Desenvolvedor cadastrado com sucesso!");
        System.out.println("====================================");

        // Exibindo informações do desenvolvedor
        System.out.println("Dev: " + dev.getNome());
        System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP total: " + dev.getXpTotal());
        System.out.println("====================================");

        scanner.close();
    }
}