package trabalho;

public class Explorando implements Estado {

    @Override
    public void enter() {
        System.out.println("[INVASOR] Entrou no estado: EXPLORANDO");
    }

    @Override
    public void execute() {
        System.out.println("[INVASOR] Está explorando a área.");
    }

    @Override
    public void leave() {
        System.out.println("[INVASOR] Saiu do estado: EXPLORANDO");
    }
}