/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
/**
 *
 * @author Alumno CG
 */
public class Cuenta {
    protected double saldo;
    protected int numeroCuenta;
    protected String titular;

    public Cuenta(double saldo, int numeroCuenta, String titular) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    public Cuenta(int numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo=0;
    }
    
    public void abonar(double cantidad){
     this.saldo+= cantidad;
    }
    
    
     public void retirar(double cantidad){
       
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
}
