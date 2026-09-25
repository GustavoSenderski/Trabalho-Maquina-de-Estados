package trabalho;

public class Escondendo implements Estado {

    @Override
    public void enter() {
        System.out.println("[INVASOR] Entrou no estado: ESCONDENDO");
    }

    @Override
    public void execute() {
        System.out.println("[INVASOR] Está se escondendo do guarda.");
    }

    @Override
    public void leave() {
        System.out.println("[INVASOR] Saiu do estado: ESCONDENDO");
    }
}