package trabalho;

public class Invasor {
	
	private Estado estadoAtual;

	public void foiDetectado() {
	    mudarEstado(new Escondendo());
	}

	public void guardaSeAproximou() {
	    mudarEstado(new Fugindo());
	}
	
	public void finalizarFuga() {
	    mudarEstado(new Explorando());
	}
	
    

    public void mudarEstado(Estado novoEstado) {

        if (estadoAtual != null) {
            estadoAtual.leave();
        }

        estadoAtual = novoEstado;
        estadoAtual.enter();
    }

    public void atualizar() {

        if (estadoAtual != null) {
            estadoAtual.execute();
        }
    }
}