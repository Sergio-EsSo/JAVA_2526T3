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
    public void retirar(float cantidad){
        float sobrete = this.saldo-cantidad;
        if(sobrete>=0){
            this.saldo-=cantidad;
            this.numeroRetiros++;
        }
        else{
            this.sobregiro= -sobrete;
            this.saldo=0;
            System.out.println("La cantidad a retirar excede el saldo actual.");
            System.out.println("dicho exceso quedará como sobregiro: "+this.sobregiro);
        }
    }
    @Override
    public void consignar(float cantidad) {
        //SI NO HAY SOBREGIRO, todo funciona como en la clase Cuenta
		if(this.sobregiro==0){
            super.consignar(cantidad);
        }
        if(cantidad>=this.sobregiro){
            this.saldo=cantidad-this.sobregiro;
            this.sobregiro=0;
            this.numeroConsignaciones++;
        }
        else{
            this.sobregiro-=cantidad;
            this.numeroConsignaciones++;
        }
	}

    @Override
    public String toString(){
        String todo = super.toString();
        return todo +"\nCuenta Corriente [sobregiro= "+sobregiro+"]";
    }
}