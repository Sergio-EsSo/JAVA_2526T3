package cuentas;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}
	float sobregiro=0;

    public float getSobregiro(){
        return sobregiro;
    }
    public void setSobregiro(float sb){
        this.sobregiro = sb;
    }
    @Override
    public String toString(){
        String todo = super.toString();
        return todo +"\nCuenta Corriente [sobregiro= "+sobregiro+"]";
    }
}