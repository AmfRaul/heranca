public class Main {
    public static void main(String args[]){
        Conta conta = new Conta();
        conta.saldo = 20000;
        conta.limite = 1000;

        System.out.println("Saldo da conta: "+conta.saldo);
        System.out.println("Limite disponivel: "+conta.limite);
    }
}
