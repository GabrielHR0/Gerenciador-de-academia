import controller.ExercicioController;
import controller.TreinoController;
import model.Exercicio;
import model.Instrutor;
import model.TipoExercicio;
import model.Treino;
import service.ExercicioService;
import service.TreinoService;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Instanciando o controlador de Treino
        TreinoController treinoController = TreinoController.getInstancia();

        // Criando dados para o treino
        String nomeTreino1 = "Treino de Força";
        String descricaoTreino1 = "Foco em ganho de força muscular";
        List<Exercicio> exerciciosTreino1 = new ArrayList<>(); // Lista de exercícios (pode adicionar alguns se já tiver)
        Instrutor instrutor1 = new Instrutor("Carlos Silva", "1252422", "849847", "carlos@exemplo.com");
        Date diaTreino1 = new Date();

        // Cadastrando o primeiro treino
        Treino treino1 = treinoController.cadastrar(nomeTreino1, descricaoTreino1, exerciciosTreino1, instrutor1, diaTreino1);
        if (treino1 != null) {
            System.out.println("Treino cadastrado com sucesso: " + treino1.getNome());
        } else {
            System.out.println("Erro ao cadastrar o treino.");
        }

        // Criando e cadastrando um segundo treino
        String nomeTreino2 = "Treino de Cardio";
        String descricaoTreino2 = "Foco em resistência e cardio";
        List<Exercicio> exerciciosTreino2 = new ArrayList<>();
        Instrutor instrutor2 = new Instrutor("Joana Pereira", "0321413", "8498933","joana@exemplo.com");
        Date diaTreino2 = new Date();

        Treino treino2 = treinoController.cadastrar(nomeTreino2, descricaoTreino2, exerciciosTreino2, instrutor2, diaTreino2);
        if (treino2 != null) {
            System.out.println("Treino cadastrado com sucesso: " + treino2.getNome());
        } else {
            System.out.println("Erro ao cadastrar o treino.");
        }

        // Listando todos os treinos cadastrados
        List<Treino> todosTreinos = treinoController.buscarTodos();
        System.out.println("\nLista de todos os treinos:");
        for (Treino treino : todosTreinos) {
            System.out.println("ID: " + treino.getId() + ", Nome: " + treino.getNome() + ", Descrição: " + treino.getDescricao() + ", Instrutor: " + treino.getInstrutor());
        }

        // Deletando o primeiro treino cadastrado
        Treino treinoDeletado = treinoController.deletarTreino(treino1.getId());
        if (treinoDeletado != null) {
            System.out.println("\nTreino deletado com sucesso: " + treinoDeletado.getNome());
        } else {
            System.out.println("Erro ao deletar o treino.");
        }

        // Listando todos os treinos novamente após a exclusão
        todosTreinos = treinoController.buscarTodos();
        System.out.println("\nLista de todos os treinos após exclusão:");
        for (Treino treino : todosTreinos) {
            System.out.println("ID: " + treino.getId() + ", Nome: " + treino.getNome() + ", Descrição: " + treino.getDescricao());
    }
}
}
