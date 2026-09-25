package trabalho;

public class Atacando implements Estado {

    @Override
    public void enter() {
        System.out.println("[GUARDA] Entrou no estado: ATACANDO");
    }

    @Override
    public void execute() {
        System.out.println("[GUARDA] Está atacando o invasor.");
    }

    @Override
    public void leave() {
        System.out.println("[GUARDA] Saiu do estado: ATACANDO");
    }
}