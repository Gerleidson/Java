public class Main {

    public static void main(String[] args) {
        cliente Gerleidson = new cliente();
        Gerleidson.setNome("Gerleidson");


        conta cc = new contaCorrente(Gerleidson);
        conta poupanca= new contaPoupança(Gerleidson);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
