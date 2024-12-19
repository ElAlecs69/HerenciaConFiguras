package mx.uaemex.fi.paradigmas_1;

public class MetodosFiguras {

		public double lado;
		public double apotema;
		public int NumeroDeLados;
		public double radio;
		
		public double getLado() {
			return lado;
		}
		public void setLado(double lado) {
			this.lado = lado;
		}
		public double getApotema() {
			return apotema;
		}
		public void setApotema(double apotema) {
			this.apotema = apotema;
		}
		public int getNumeroDeLados() {
			return NumeroDeLados;
		}
		public void setNumeroDeLados(int numeroDeLados) {
			NumeroDeLados = numeroDeLados;
		}
		public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
		
		public double PerimetroCuadrado() {
			return this.NumeroDeLados*this.lado;
		}
		
		public double AreaCuadrado() {
			return this.lado*this.lado;
		}
		
		public double PerimetroCirculo() {
			return 2*this.radio*Math.PI;
		}
		
		public double AreaCirculo() {
			return Math.PI*this.radio*this.radio;
		}

}
