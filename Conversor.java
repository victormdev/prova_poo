
package q1;

public class Conversor {
	
	public Double m2;
	public Double p2;
	public Double acre;
	public Double cm2;
	
	public Double getMetroQuadrado() {
		return m2;
	}
	public void setMetroQuadrado(Double metroQuadrado) {
		this.m2 =  (Double) (p2 / 10.76);
	}
	public Double getPeQuadrado() {
		return p2;
	}
	public void setPeQuadrado(Double peQuadrado) {
		this.p2 =  (Double) (m2 * 10.76);
	}
	public Double getAcre() {
		return acre;
	}
	public void setAcre(Double acre) {
		this.acre = p2 / 43560;
	}
	public Double getCentimetrosQuadrados() {
		return cm2;
	}
	public void setCentimetrosQuadrados(Double centimetrosQuadrados) {
		this.cm2 = p2 * 929.00;
	}
	
	
}
