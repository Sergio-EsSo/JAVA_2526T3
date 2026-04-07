package cuentas;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.activa= this.isActiva();
	}

/*	posee un atributo para determinar si la cuenta de ahorros está activa
 *  (tipo boolean). Si el saldo es menor a $10000, la cuenta está inactiva, 
 *  en caso contrario se considera activa. 
*/
	boolean activa;
	
	public boolean isActiva() {
		if(this.getSaldo()>10000)
			return true;
		else 
			return false;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	//metodos de ejercicio
    @Override
    public String toString(){
        return "CuentaAhorro [activa="+activa+"]";
    }
	
}