
public class Categoria {
	private int cat1,cat2,cat3,cat4,cat5,cat6,Generala;
	private boolean n1,n2,n3,n4,n5,n6,ng;
	

	public int getCat1() {
		return cat1;
	}

	public void setCat1(int cat1) {
		this.cat1 = cat1;
	}

	public int getCat2() {
		return cat2;
	}

	public void setCat2(int cat2) {
		this.cat2 = cat2;
	}

	public int getCat3() {
		return cat3;
	}

	public void setCat3(int cat3) {
		this.cat3 = cat3;
	}

	public int getCat4() {
		return cat4;
	}

	public void setCat4(int cat4) {
		this.cat4 = cat4;
	}

	public int getCat5() {
		return cat5;
	}

	public void setCat5(int cat5) {
		this.cat5 = cat5;
	}

	public int getCat6() {
		return cat6;
	}

	public void setCat6(int cat6) {
		this.cat6 = cat6;
	}
	
	public void cerrarCategoria1(boolean n) {
		this.n1=n;
	}
	public boolean categoria1Cerrada(){
		return this.n1;
	}
	public void cerrarCategoria2(boolean n) {
		this.n2=n;
	}
	public boolean categoria2Cerrada(){
		return this.n2;
	}

	public void cerrarCategoria3(boolean n) {
		this.n3=n;
	}
	public boolean categoria3Cerrada(){
		return this.n3;
	}

	public void cerrarCategoria4(boolean n) {
		this.n4=n;
	}
	public boolean categoria4Cerrada(){
		return this.n4;
	}

	public void cerrarCategoria5(boolean n) {
		this.n5=n;
	}
	public boolean categoria5Cerrada(){
		return this.n5;
	}

	public void cerrarCategoria6(boolean n) {
		this.n6=n;
	}
	public boolean categoria6Cerrada(){
	
		return this.n6;
	}
	
	public void cerrarCategoriaGenerala(boolean n) {
		this.ng=n;
	}
	public boolean categoriaGeneralaCerrada(){
		return this.ng;
	}

	public int getGenerala() {
		return Generala;
	}

	public void setGenerala(int generala) {
		Generala = generala;
	}
	
	


}
