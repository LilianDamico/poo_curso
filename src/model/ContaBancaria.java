package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {

    //#region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private double saldo;
    private Double VALOR_MINIMO_DEPOSITO = 10.0;

    //#endregion

    //#region Construtor

    public ContaBancaria(String agencia, String conta, Integer digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    //#endregion

    //#region Getters e Setters

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public Integer getDigito() {
        return digito;
    }
    public void setDigito(Integer digito) {
        this.digito = digito;
    }
    public double getSaldo() {
        return saldo;
    }

    //#endregion


    //#region metodos

    public void depositar(Double valor){

        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor mínimo de depósitto é R$ " + VALOR_MINIMO_DEPOSITO);
        }
        
        this.saldo += valor;
    }

    public Double sacar(Double valor){

        if(valor > this.saldo){
            throw new InputMismatchException("Saldo insuficiente.");
        }

        this.saldo -= valor;
        return valor;
    }

    //#endregion




    
}
