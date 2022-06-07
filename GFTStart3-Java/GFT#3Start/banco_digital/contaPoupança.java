public class contaPoupança extends conta{
    public contaPoupança(cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato conta corrente ***");
        super.imprimirInfosComuns();
    }

}

