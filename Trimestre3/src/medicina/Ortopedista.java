package medicina;

public class Ortopedista extends Medico {

	// Valor enumerado para definir diferentes tipo de ortopedista
	enum tipologia {
		MAXILOFACIAL, PEDIATRICA
	};

	protected tipologia tipo; // Atributo que define el tipo de ortopedista

	// const
	public Ortopedista(String nombre, tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public void setTipologia(tipologia tipo) {
		this.tipo = tipo;
    }
	public tipologia getTipologia() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
}