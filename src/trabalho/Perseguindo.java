package trabalho;

public class Perseguindo implements Estado {

    @Override
    public void enter() {
        System.out.println("[GUARDA] Entrou no estado: PERSEGUINDO");
    }

    @Override
    public void execute() {
        System.out.println("[GUARDA] Está perseguindo o invasor.");
    }

    @Override
    public void leave() {
        System.out.println("[GUARDA] Saiu do estado: PERSEGUINDO");
    }
}