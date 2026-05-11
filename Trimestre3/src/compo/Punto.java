package compo;

public class Punto {

	int x, y; /* Atributos que identifican el valor de las coordenadas (x,y) del círculo */
	
	Punto(int x, int y) {
	this.x = x;
	this.y = y;
	}
    
	int getX() {
	return x;
	}
	void setX(int x) {
	this.x = x;
	}
	int getY() {
	return y;
	}
	void setY(int y) {
	this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}	
}