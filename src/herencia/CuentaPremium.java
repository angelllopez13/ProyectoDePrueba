/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Alumno CG
 */
public class CuentaPremium extends Cuenta{

    public CuentaPremium(double saldo, int numeroCuenta, String titular) {
        super(saldo, numeroCuenta, titular);
    }

    public CuentaPremium(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void retirar(double cantidad) {
       this.saldo-=cantidad;    
    }
    
    
}
