package herencia;

public class CuentaNormal extends Cuenta {

    public CuentaNormal(double saldo, int numeroCuenta, String titular) {
        super(saldo, numeroCuenta, titular);
    }

    public CuentaNormal(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void abonar(double cantidad) {
        super.abonar(cantidad);
        System.out.println("Abonando acuenta "+this.numeroCuenta);
    }

    @Override
    public void retirar(double cantidad) {
          if(cantidad>= saldo){
           this.saldo=cantidad;        
          }
        else{
              System.out.println("No se puede retirar");
        }
    }
    
    
    
}
