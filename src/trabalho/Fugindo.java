package trabalho;

public class Fugindo implements Estado {

    @Override
    public void enter() {
        System.out.println("[INVASOR] Entrou no estado: FUGINDO");
    }

    @Override
    public void execute() {
        System.out.println("[INVASOR] Está fugindo do guarda.");
    }

    @Override
    public void leave() {
        System.out.println("[INVASOR] Saiu do estado: FUGINDO");
    }
}