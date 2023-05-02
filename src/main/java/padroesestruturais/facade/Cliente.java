package padroesestruturais.facade;

public class Cliente {

    public boolean retirarCarro() {
        return ClienteFacade.verificarPendenciasRetiradaCarro(this);
    }
}
