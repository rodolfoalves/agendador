import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Agendador agendador = new Agendador();
        int menu = 1;

        do{
            System.out.println("\n");
            System.out.println("+-------------------------------------+");
            System.out.println("|         Agendador de Tarefas        |");
            System.out.println("+-------------------------------------+");
            System.out.println(
                    "| 1 - Adicionar Tarefa                |\n" +
                    "| 2 - Remover Tarefa                  |\n" +
                    "| 3 - Marcar Tarefa como Concluída    |\n" +
                    "| 4 - Pesquisar Tarefa por Título     |\n" +
                    "| 5 - Mostrar Tarefas Pendentes       |\n" +
                    "| 6 - Mostrar Tarefas Concluidas      |\n" +
                    "| 0 - Sair                            |"
            );
            System.out.println("+--------------------------------------+\n\n");
            menu = scanner.nextInt();
            String tarefa = "";

            switch (menu){
                case 1:
                    agendador.agendarTarefa();
                    break;

                case 2:
                    System.out.println("Informe a tarefa para remover");
                    tarefa = scanner.next();

                    agendador.removeTarefa(tarefa);
                    break;

                case 3:
                    System.out.println("Informe a tarefa para concluir");
                    tarefa = scanner.next();

                    agendador.checkTarefaConcluida(tarefa);
                    break;

                case 4:
                    System.out.println("Informe a tarefa para pesquisar");
                    tarefa = scanner.next();

                    agendador.consultaTarefa(tarefa);
                    break;

                case 5:
                    agendador.listTarefasPendentes();
                    break;

                case 6:
                    agendador.listTarefasConcluidas();
                    break;
            }

        }while (menu != 0);
    }
}
