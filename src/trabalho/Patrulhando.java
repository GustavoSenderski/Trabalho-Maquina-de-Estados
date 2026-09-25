package trabalho;

public class Patrulhando implements Estado {

    @Override
    public void enter() {
        System.out.println("[GUARDA] Entrou no estado: PATRULHANDO");
    }

    @Override
    public void execute() {
        System.out.println("[GUARDA] Está patrulhando a área.");
    }

    @Override
    public void leave() {
        System.out.println("[GUARDA] Saiu do estado: PATRULHANDO");
    }
}