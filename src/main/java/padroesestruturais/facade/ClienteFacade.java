package padroesestruturais.facade;

public class ClienteFacade {

    public static boolean verificarPendenciasRetiradaCarro(Cliente cliente) {
        if (Documentacao.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
