package UD21Junit;

public class EjGeometria {

	private int id;
	private String nombre;
	private double area;

	public EjGeometria(int id) {
		this.id = id;
		this.nombre = figura(id);
	}

	public EjGeometria() {
		this.id = 9;
		this.nombre = "Default";
	}


	public int areaCuadrado(int n1) {
		return n1 * n1;
	}

	public double areaCirculo(int r) {
		final double PI = 3.1416;
		return PI * Math.pow(r, 2);
	}

	public int areaTriangulo(int a, int b) {
		return (a * b) / 2;
	}

	public int areaRectangulo(int b, int h) {
		return b * h;
	}

	public int areaPentagono(int p, int a) {
		return (p * a) / 2;
	}

	public int areaRombo(int D, int d) {
		return (D * d) / 2;
	}

	public int areaRomboide(int b, int h) {
		return b * h;
	}

	public int areaTrapecio(int B, int b, int h) {
		return ((B + b) / 2) * h;
	}

	public String figura(int fiCode) {

		String Figura = "";

		switch (fiCode) {
		case 1:
			Figura = "cuadrado";
			break;
		case 2:
			Figura = "Circulo";
			break;
		case 3:
			Figura = "Triangulo";
			break;
		case 4:
			Figura = "Rectangulo";
			break;
		case 5:
			Figura = "Pentagono";
			break;
		case 6:
			Figura = "Rombo";
			break;
		case 7:
			Figura = "Romboide";
			break;
		case 8:
			Figura = "Trapecio";
			break;
		default:
			Figura = "Default";
			break;
		}
		return Figura;

	}

	// Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nombre;
	}

	/**
	 * @param nombre the nom to set
	 */
	public void setNom(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Geometria [id=" + id + ", nombre=" + nombre + ", area=" + area + "]";
	}

}
