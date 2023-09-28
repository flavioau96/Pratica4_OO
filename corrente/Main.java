package corrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca(); //Cp é o objeto do tipo conta  //como não tem construtor ele cria um objeto vazio
        cp.depositar(500.50);//chamar o metodo depositar R$500.50
        cp.sacar(25);//chamando o metodo sacar com valor de R$25

        GeradorExtratos gerador = new GeradorExtratos();//objeto gerador é criado do tipo Gerador Extrato
        gerador.geradorConta(cc);//Gerador conta recebe a conta corrente (get saldo retorna o valor da conta corrente
        gerador.geradorConta(cp);
    }
}
