package src;

import src.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Banco Digital");
        System.out.println();

        ContaBancaria conta = new ContaBancaria("0001", "7542", 2, 500.0);

        System.out.println("Saldo atual é de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual é de R$" + conta.getSaldo());
        System.out.println();

        double saque = conta.sacar(150.0);
        System.out.println("Valor sacado é de R$" + saque);
        System.out.println();
        System.out.println("Saldo atual é de R$" + conta.getSaldo());
        System.out.println();


    }
}

