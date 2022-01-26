import java.util.ArrayList;
import java.util.Scanner;

public class Agendador {

    public Agendador(){}

    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void agendarTarefa(){

        Data data = new Data();

        System.out.println("Informe o titulo da tarefa");
        String titulo = scanner.next();

        System.out.println("Informe o Descricao da tarefa");
        String descricao = scanner.next();

        System.out.println("Informe o dia da tarefa");
        data.setDia(scanner.nextInt());

        System.out.println("Informe o mes da tarefa");
        data.setMes(scanner.nextInt());

        System.out.println("Informe o ano da tarefa");
        data.setAno(scanner.nextInt());

        adicionarTarefa(titulo, descricao, data);
    }

    public void adicionarTarefa(String titulo, String descricao, Data data){
        Tarefa tarefa = new Tarefa();

        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setData(data);
        tarefa.setStatus(false);

        tarefas.add(tarefa);
    }

    public void listTarefasPendentes(){
        for (int i = 0; i < tarefas.size(); i++){
            if (!tarefas.get(i).getStatus()){
                System.out.println("Tarefa: " + tarefas.get(i).getTitulo());
            }
        }
    }

    public void listTarefasConcluidas(){
        for (int i = 0; i < tarefas.size(); i++){
            if (tarefas.get(i).getStatus()){
                System.out.println("Tarefa: " + tarefas.get(i).getTitulo());
            }
        }
    }

    public void removeTarefa(String nomeTarefa){
        for (int i = 0; i < tarefas.size(); i++){
            if (tarefas.get(i).getTitulo().equals(nomeTarefa)){
                tarefas.remove(i);
                System.out.println("Tarefa removida");
                return;
            }
        }

        System.out.println("Tarefa nao encontrada");
    }

    public void checkTarefaConcluida(String nomeTarefa){
        for (int i = 0; i < tarefas.size(); i++){
            if (tarefas.get(i).getTitulo().equals(nomeTarefa)){
                tarefas.get(i).setStatus(true);
                System.out.println("Tarefa concluida");
                return;
            }
        }

        System.out.println("Tarefa nao encontrada");
    }

    public void consultaTarefa(String nomeTarefa){
        for (int i = 0; i < tarefas.size(); i++){
            if (tarefas.get(i).getTitulo().equals(nomeTarefa)){
                System.out.println("Tarefa: " + tarefas.get(i).getTitulo());
                System.out.println("Descricao: " + tarefas.get(i).getDescricao());
                System.out.println("Data: " + tarefas.get(i).getData().getDia() + "-" + tarefas.get(i).getData().getMes() + "-" + tarefas.get(i).getData().getAno());
                System.out.println("Concluida: " + tarefas.get(i).getStatus());
                return;
            }
        }

        System.out.println("Tarefa nao encontrada");
    }
}
