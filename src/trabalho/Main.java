package trabalho;

public class Main {

    public static void main(String[] args) {

        Guarda guarda = new Guarda();
        Invasor invasor = new Invasor();

        int cicloDeteccao = 4;
        int cicloAlcance = 7;
        int cicloReinicio = 10;

        guarda.mudarEstado(new Patrulhando());
        invasor.mudarEstado(new Explorando());

        for (int i = 1; i <= 12; i++) {

            System.out.println("\n========== CICLO " + i + " ==========");

            // Guarda detecta o invasor
            if (i == cicloDeteccao) {

                System.out.println("[EVENTO] Guarda detectou o invasor.");

                guarda.detectarInvasor();

                System.out.println("[COMUNICAÇÃO] O invasor percebeu que foi detectado.");

                invasor.foiDetectado();
            }

            // Guarda alcança o invasor
            if (i == cicloAlcance) {

                System.out.println("[EVENTO] Guarda alcançou o invasor.");

                guarda.alcancarInvasor();

                System.out.println("[COMUNICAÇÃO] O invasor percebeu que o guarda se aproximou.");

                invasor.guardaSeAproximou();
            }
            
            if (i == cicloReinicio) {

                System.out.println("[EVENTO] O confronto terminou.");

                guarda.finalizarAtaque();

                System.out.println("[COMUNICAÇÃO] O invasor percebeu que não está mais sendo perseguido.");

                invasor.finalizarFuga();
            }            
            

            guarda.atualizar();
            invasor.atualizar();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}