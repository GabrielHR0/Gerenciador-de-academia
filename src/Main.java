
import controller.ExercicioController;
import model.Exercicio;
import model.TipoExercicio;
import service.ExercicioService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Instancia o controlador de exercício
        ExercicioController exercicioController = ExercicioController.getInstancia();

        // Define um tipo de exercício (exemplo)
        TipoExercicio tipoExercicio = new TipoExercicio("Agachamento", "Pernas");

        // Teste de cadastro
        System.out.println("Testando cadastro de exercício:");
        Exercicio exercicio1 = exercicioController.cadastrar(tipoExercicio, 10, 3);
        Exercicio exercicio2 = exercicioController.cadastrar(tipoExercicio, 15, 4);
        System.out.println("Exercício 1 cadastrado: " + exercicio1.getId() + " - Repetições: " + exercicio1.getRepeticoes() + ", Séries: " + exercicio1.getSeries());
        System.out.println("Exercício 2 cadastrado: " + exercicio2.getId() + " - Repetições: " + exercicio2.getRepeticoes() + ", Séries: " + exercicio2.getSeries());

        // Teste de buscarTodos
        System.out.println("\nTestando busca de todos os exercícios:");
        List<Exercicio> todosExercicios = exercicioController.buscarTodos();
        for (Exercicio e : todosExercicios) {
            System.out.println("Exercício ID: " + e.getId() + " - Tipo: " + e.getTipoExercicio().getNome() + " - Repetições: " + e.getRepeticoes() + ", Séries: " + e.getSeries());
        }

        // Teste de deletar
        System.out.println("\nTestando exclusão de exercício:");
        boolean deletado = ExercicioService.getInstancia().deletarExercicio(exercicio1.getId()) != null;
        System.out.println("Exercício ID " + exercicio1.getId() + " deletado: " + deletado);

        // Teste de buscarTodos após exclusão
        System.out.println("\nTestando busca após exclusão:");
        todosExercicios = exercicioController.buscarTodos();
        for (Exercicio e : todosExercicios) {
            System.out.println("Exercício ID: " + e.getId() + " - Tipo: " + e.getTipoExercicio().getNome() + " - Repetições: " + e.getRepeticoes() + ", Séries: " + e.getSeries());
        }
    }
}
