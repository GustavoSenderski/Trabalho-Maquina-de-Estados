package trabalho;

public class Guarda {
	
	private Estado estadoAtual;

	public void detectarInvasor() {
	    mudarEstado(new Perseguindo());
	}

	public void alcancarInvasor() {
	    mudarEstado(new Atacando());
	}
	
	public void finalizarAtaque() {
	    mudarEstado(new Patrulhando());
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