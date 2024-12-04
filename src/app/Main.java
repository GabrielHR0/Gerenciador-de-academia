package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Exercicio;
import model.Instrutor;
import model.TipoExercicio;
import model.Treino;
import repository.TreinoRepository;
import service.TreinoService;

public class Main {

    public static void main(String[] args) {
        // Obter a instância do serviço
        TreinoService treinoService = TreinoService.getInstancia();

        // Criar um instrutor para associar aos treinos
        Instrutor instrutor = new Instrutor("Carlos Silva","21238", "84859647", "carlosslva");

        // Criar um TipoExercicio para associar ao Exercicio
        TipoExercicio tipoExercicio1 = new TipoExercicio("Força", "Peito");
        TipoExercicio tipoExercicio2 = new TipoExercicio("Hipertrofia", "Pernas");

        // Criar uma lista de exercícios com TipoExercicio
        List<Exercicio> exercicios = new ArrayList<>();
        exercicios.add(new Exercicio(tipoExercicio1, 3, 10));
        exercicios.add(new Exercicio(tipoExercicio2, 4, 12));

        // Cadastrar um novo treino
        Treino treino1 = treinoService.cadastrarTreino(
            "Treino A",
            "Treino de força",
            exercicios,
            instrutor,
            new Date()
        );

        if (treino1 != null) {
            System.out.println("Treino cadastrado com sucesso: " + treino1.getNome());
        } else {
            System.out.println("Falha ao cadastrar treino.");
        }

        // Buscar todos os treinos
        List<Treino> todosTreinos = treinoService.buscarTodosTreinos();
        System.out.println("\nLista de treinos cadastrados:");
        for (Treino treino : todosTreinos) {
            System.out.println("- " + treino.getNome());
        }

        // Buscar treino por ID
        Treino treinoBuscado = treinoService.buscarPorId(treino1.getId());
        if (treinoBuscado != null) {
            System.out.println("\nTreino encontrado: " + treinoBuscado.getNome());
        } else {
            System.out.println("\nTreino não encontrado.");
        }

        // Editar o treino
        List<Exercicio> novosExercicios = new ArrayList<>();
        TipoExercicio tipoExercicio3 = new TipoExercicio("Endurance", "Costas");
        novosExercicios.add(new Exercicio(tipoExercicio3, 4, 10));
        Treino treinoEditado = TreinoRepository.getInstancia().editar(
            treino1.getId(),
            "Treino B",
            "Treino de costas",
            novosExercicios,
            instrutor,
            new Date()
        );

        if (treinoEditado != null) {
            System.out.println("\nTreino editado: " + treinoEditado.getNome());
        } else {
            System.out.println("\nFalha ao editar treino.");
        }

        // Deletar treino
        Treino treinoDeletado = treinoService.deletaTreino(treino1.getId());
        if (treinoDeletado != null) {
            System.out.println("\nTreino deletado: " + treinoDeletado.getNome());
        } else {
            System.out.println("\nFalha ao deletar treino.");
        }
    }
}
