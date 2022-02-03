import java.util.*;
/**
 * Esta clase permite crear un objeto de tipo "Jugador de dados" para implementarlo en cualquier juego de dados
 * con metodos comunes
 * @author Usuario
 *
 */
public class Jugador {
	
	private String nombre;
	private Dado[] dados=new Dado[5];
	
	private Categoria cat;
	private ArrayList<Dado> DadosGuardados=new ArrayList(); 
	private int tiros;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		cat=new Categoria();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}
	
	
	// Metodo para tirar Los dados la primera vez
	/**
	 * Este metodo permite tirar 5 dados, con valor aleatorio y devuelve un true si se hizo una "Generala"
	 * @return
	 * un true o false
	 */
	public boolean tirarDados() {
		this.tiros=0;
			this.dados=new Dado[5];
		Random a= new Random();	
	System.out.println("Tiro numero: "+(++this.tiros));	
	for(int i=0;i<this.dados.length;i++) {
		
		this.dados[i]=new Dado(1+a.nextInt(6));
	}
	if(this.generala()) {
		verDados();
		return true;
	}else {
		verDados();
		return false;
	}
	
	
}
	private void verDadosGuardados(){
		System.out.println("Dados guardados: ");
		for (Dado dado : DadosGuardados) {
			System.out.print("|"+dado+"|");
			
		}
		System.out.println();
	}
	
	
	
	
	//Metodo para elegir los dados que guardaremos
	public boolean guardarDadosUtiles() {
		Scanner sc=new Scanner(System.in);
		boolean cerrado=false;
		System.out.println("que dados queres guardar");
		System.out.println("1.Los Unos / 2.Los Dos / 3.Los Tres / 4.Los Cuatros / 5.Los Cincos / 6.Los Seis");
		int op=sc.nextInt();
		switch(op) {
		case 1: 
						if(!this.cat.categoria1Cerrada()) {
				 for(int i=0;i<this.dados.length;i++) {
					 if(this.dados[i]!=null) {
						 if(this.dados[i].getDado()==1) {
						this.DadosGuardados.add(this.dados[i]);	
						this.dados[i]=null;
				 }
					 }
					 
				     }
				 verDadosGuardados();break;
				 
				 
						}else {
							cerrado=true;
							System.out.println("La categoria 1 esta cerrada, no podes guardar los dados de 1");break;
						}
						
		case 2: 
						if(!this.cat.categoria2Cerrada()) {
				for(int i=0;i<this.dados.length;i++) {
					if(this.dados[i]!=null) {
						if(this.dados[i].getDado()==2) {
							this.DadosGuardados.add(this.dados[i]);	
							this.dados[i]=null;
						}
					}
		 
				}
				 verDadosGuardados();break;
				 	
	 
			}else {
				cerrado=true;
				System.out.println("La categoria 2 esta cerrada, no podes guardar los dados de 2");break;
			}		
						
						
				case 3: 
							if(!this.cat.categoria3Cerrada()) {
						for(int i=0;i<this.dados.length;i++) {
							if(this.dados[i]!=null) {
								if(this.dados[i].getDado()==3) {
									this.DadosGuardados.add(this.dados[i]);	
									this.dados[i]=null;
								}
							}
				 
						}
			 
						 verDadosGuardados();break;
			 
					}else {
						cerrado=true;
						System.out.println("La categoria 3 esta cerrada, no podes guardar los dados de 3");break;
					}
							
							
				case 4: 
								if(!this.cat.categoria4Cerrada()) {
						for(int i=0;i<this.dados.length;i++) {
							if(this.dados[i]!=null) {
								if(this.dados[i].getDado()==4) {
									this.DadosGuardados.add(this.dados[i]);	
									this.dados[i]=null;
								}
							}
				 
						}
			 
						 verDadosGuardados();break;
			 
					}else {
						cerrado=true;
						System.out.println("La categoria 4 esta cerrada, no podes guardar los dados de 4");break;
					}		
					
								
				case 5: 
								if(!this.cat.categoria5Cerrada()) {
						for(int i=0;i<this.dados.length;i++) {
							if(this.dados[i]!=null) {
								if(this.dados[i].getDado()==5) {
									this.DadosGuardados.add(this.dados[i]);	
									this.dados[i]=null;
								}
							}
				 
						}
			 
						 verDadosGuardados();break;
			 
					}else {
						cerrado=true;
						System.out.println("La categoria 5 esta cerrada, no podes guardar los dados de 5");break;
					}
								
								
				case 6: 
								if(!this.cat.categoria6Cerrada()) {
						for(int i=0;i<this.dados.length;i++) {
							if(this.dados[i]!=null) {
								if(this.dados[i].getDado()==6) {
									this.DadosGuardados.add(this.dados[i]);	
									this.dados[i]=null;
								}
							}
				 
						}
			 
						 verDadosGuardados();break;
			 
					}else {
						cerrado=true;
						System.out.println("La categoria 6 esta cerrada, no podes guardar los dados de 6");break;
					}					
						
		}
			if(cerrado) {
				return true;
			}else {
				return false;
			}
		
	}
	
private boolean generala() {
	int numeros[]=new int[6];
	int c=0;
	boolean si=false;
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(i+1);
		
	}
	
	for(int i=0;i<numeros.length;i++) {
		c=0;
			for(int j=0;j<this.dados.length;j++) {
				if(this.dados[j].getDado()==numeros[i]) {
					c++;
				}
			}
			if(c==5) {
				si=true;
				break;
			
	}
}
	
	if(si) {
		return true;
	}else {
		return false;
	}
	
	
}
	
	//Metodo para saber si tengo todos los dados
private boolean todosLosDados() {
	int c=0;
	
	for(int i=0;i<this.dados.length;i++) {
		if(this.dados[i]!=null) {
			c++;
		}
	}
	
	if(c==5) {
		return true;
	}else {
		return false;
	}
	
}
	
	
	//Metodo para tirar de nuevo;
public int tirarDeNuevo() {
	Random a= new Random();
	System.out.println("Tiro numero: "+(++this.tiros));	
for(int i=0;i<this.dados.length;i++) {
		if(this.dados[i]!=null) {
		this.dados[i].setDado(1+a.nextInt(6));
		}
	}
	verDados();
	return 1;
	
}

//Metodo para sumar los dados que guardamos anteriormente
private void sumarDadosGuardados() {
	this.dados=new Dado[this.DadosGuardados.size()];
	
for(int i=0;i<this.dados.length;i++) {
		
		this.dados[i]=this.DadosGuardados.get(i);
	}
	
	System.out.println("Tus dados guardados son: ");
	verDados();

}
	//Metodo para cerrar Categorias
	public void cerrarCategorias() { //Analizar
		Scanner sc=new Scanner(System.in);
		System.out.println("Que categoria queres cerrar");
		
		categoriasDisponibles();
		
		int op=sc.nextInt();
		 if(op==1) {
			 this.cat.setCat1(0);
			 this.cat.cerrarCategoria1(true);
			 System.out.println("Categoria 1 Cerrada");
		 }else if(op==2) {
			 this.cat.setCat2(0);
			 this.cat.cerrarCategoria2(true);
			 System.out.println("Categoria 2 Cerrada");
		 }else if(op==3) {
			 this.cat.setCat3(0);
			 this.cat.cerrarCategoria3(true);
			 System.out.println("Categoria 3 Cerrada");
		 }else if(op==4) {
			 this.cat.setCat4(0);
			 this.cat.cerrarCategoria4(true);
			 System.out.println("Categoria 4 Cerrada");
		 }else if(op==5) {
			 this.cat.setCat5(0);
			 this.cat.cerrarCategoria5(true);
			 System.out.println("Categoria 5 Cerrada");
		 }else if(op==6) {
			 this.cat.setCat6(0);
			 this.cat.cerrarCategoria6(true);
			 System.out.println("Categoria 6 Cerrada");
		 }else if(op==7) {
			 this.cat.setGenerala(0);
			 this.cat.cerrarCategoriaGenerala(true);
			 System.out.println("Categoria Generala cerrada");
		 }
	
		
	}
	
	
	
	 //metodo para elegir la categoria
	public boolean elegirCategoria() {
		this.DadosGuardados.clear();
		int suma=0;
		boolean cerrado=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Seleccione la categoria");
		System.out.println("1.Categoria 1 / 2.Categoria 2 / 3.Categoria 3 / 4.Categoria 4 / 5.Categoria 5 / 6.Categoria 6 / 7.Generala");
		int op=sc.nextInt();
		
		switch(op) {
		
		case 1: if(!this.cat.categoria1Cerrada()) {
			
			for(int i=0;i<this.dados.length;i++) {
				if(this.dados[i].getDado()==1) {
					suma+=this.dados[i].getDado();
				}
			}
					this.cat.setCat1(suma);
					this.cat.cerrarCategoria1(true);
					cerrado=true;
					System.out.println("Puntaje en la Categoria 1 : "+this.cat.getCat1());
					break;
					
					
			
			
		}else {
			System.out.print("La categoria 1 esta cerrada ");
			cerrado=false;
			break;
			
			
		}
		
		case 2: if(!this.cat.categoria2Cerrada()) {
			
			for(int i=0;i<this.dados.length;i++) {
				if(this.dados[i].getDado()==2) {
					suma+=this.dados[i].getDado();
				}
			}
					this.cat.setCat2(suma);
					this.cat.cerrarCategoria2(true);
					cerrado=true;
					System.out.println("Puntaje en la Categoria 2 : "+this.cat.getCat2());
					break;
					
			
			
		}else {
			System.out.println("La categoria 2 cerrada ");
			cerrado=false;
			break;
			
			
		}
		
			case 3: if(!this.cat.categoria3Cerrada()) {
			
			for(int i=0;i<this.dados.length;i++) {
				if(this.dados[i].getDado()==3) {
					suma+=this.dados[i].getDado();
				}
			}
					this.cat.setCat3(suma);
					this.cat.cerrarCategoria3(true);
					cerrado=true;
					System.out.println("Puntaje en la Cateogoria 3 : "+this.cat.getCat3());
					break;
			
			
		}else {
			System.out.println("La categoria 3 cerrada ");
			cerrado=false;
			break;
			
			
		}
			
			case 4: if(!this.cat.categoria4Cerrada()) {
				
				for(int i=0;i<this.dados.length;i++) {
					if(this.dados[i].getDado()==4) {
						suma+=this.dados[i].getDado();
					}
				}
						this.cat.setCat4(suma);
						this.cat.cerrarCategoria4(true);
						cerrado=true;
						System.out.println("Puntaje en la Categoria 4 : "+this.cat.getCat4());
						break;
				
				
			}else {
				System.out.println("La categoria 4 cerrada ");
				cerrado=false;
				break;
				
				
			}
			
			case 5: if(!this.cat.categoria5Cerrada()) {
				
				for(int i=0;i<this.dados.length;i++) {
					if(this.dados[i].getDado()==5) {
						suma+=this.dados[i].getDado();
					}
				}
						this.cat.setCat5(suma);
						this.cat.cerrarCategoria5(true);
						cerrado=true;
						System.out.println("Puntaje en la Categoria 5 : "+this.cat.getCat5());
						break;
				
				
			}else {
				System.out.println("La categoria 5 cerrada ");
				cerrado=false;
				break;
				
			}
			
			case 6: if(!this.cat.categoria6Cerrada()) {
				
				for(int i=0;i<this.dados.length;i++) {
					if(this.dados[i].getDado()==6) {
						suma+=this.dados[i].getDado();
					}
				}
						this.cat.setCat6(suma);
						this.cat.cerrarCategoria6(true);
						cerrado=true;
						System.out.println("Puntaje en la Categoria 6 : "+this.cat.getCat6());
						break;
				
				
			}else {
				System.out.println("La categoria 6 cerrada ");
				cerrado=false;
				break;
				
			}
			
			case 7:
				if(!this.cat.categoriaGeneralaCerrada()) {
						if(todosLosDados()) {
							if(generala()) {
								System.out.println("Jugador "+ this.nombre +" hizo un Generala");
								System.out.println("Se le sumara 50 puntos");
								this.cat.setGenerala(50);
								this.cat.cerrarCategoriaGenerala(true);
								cerrado=true;
								System.out.println("Puntaje de la Generala: "+this.cat.getGenerala());
							}else {
								System.out.println("No tenes Generala");
								cerrado=false;
							}
							
							
						}else {
							System.out.println("No podes seleccionar la categoria Generala, porque no tenes los 5 dados ");
							cerrado=false;
						}
					
				}else {
					System.out.println("La categoria Generala esta cerrada");
					cerrado=false;
				}
				break;
					
		
	}
		
		if(cerrado) {
			System.out.println("Jugada de "+ this.getNombre()+" terminada");
			System.out.println();
			return true;
		}else {
			
			return false;
		}
		
		
	}
	 //PuntajeTotal
	public int puntajeTotal() {
		
 return this.cat.getCat1()+this.cat.getCat2()+this.cat.getCat3()+this.cat.getCat4()+this.cat.getCat5()+this.cat.getCat6()+this.cat.getGenerala();
		
	}
	
	public void decision() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Elegir categoria y terminar turno // 2.Cerrar categoria abierta y Terminar turno");
		int op=sc.nextInt();
		int categoriaCerrada=0;
		switch(op) {
				
		case 1:
				System.out.println("Las categorias disponibles son las siguientes");
							categoriasDisponibles();
						if(this.DadosGuardados.size()>=1) {
							sumarDadosGuardados();
							while(!elegirCategoria()) {
								System.out.println("Debes elegir una categoria disponible: ");
								categoriasDisponibles();
						System.out.println(" Si no puede seleccionar ninguna categoria pulse la telca '1' y cerrara una categoria abierta");
							op=sc.nextInt();
							if(op==1) {
								cerrarCategorias();
								break;
							}
							
							}
							
							break;
						}else {
							while(!elegirCategoria()) {
								System.out.println("Debes elegir una categoria disponible: ");
								categoriasDisponibles();
				System.out.println("Si no puede seleccionar ninguna categoria pulse la telca '1' y cerrara una categoria abierta, para seguir elegiendo categorias pulse la tecla '2'");
								op=sc.nextInt();
								if(op==1) {
									cerrarCategorias();
									break;
								}
							}
							break;
						}
		case 2:
			cerrarCategorias();break;
		}
		
	}
	
	private void verDados() {
		System.out.print("Dados: ");
		for(int i=0;i<this.dados.length;i++) {
			if(this.dados[i]!=null) {
				
				System.out.print("|"+this.dados[i].getDado()+"|");
			}
			
		}
		System.out.println();
	}
	
	public void categoriasDisponibles() {
		if(!this.cat.categoria1Cerrada()) {
			System.out.print("1.Categoria 1 abierta");
		}else {
			System.out.print("Categoria 1 cerrada");
		}
		if(!this.cat.categoria2Cerrada()) {
			System.out.print(" /2.Categoria 2 abierta");
		}else {
			System.out.print(" /Categoria 2 cerrada");
		}
		if(!this.cat.categoria3Cerrada()) {
			System.out.println(" /3.Categoria 3 abierta");
		}else {
			System.out.println("/ Categoria 3 cerrada");
		}
		if(!this.cat.categoria4Cerrada()) {
			System.out.print("4.Categoria 4 abierta");
		}else {
			System.out.print("Categoria 4 cerrada");
		}
		if(!this.cat.categoria5Cerrada()) {
			System.out.print(" /5.Categoria 5 abierta");
		}else {
			System.out.print(" /Categoria 5 cerrada");
		}
		if(!this.cat.categoria6Cerrada()) {
			System.out.print(" /6.Categoria 6 abierta");
	}else {
		System.out.print(" /Categoria 6 cerrada");
	}
		if(!this.cat.categoriaGeneralaCerrada()) {
			if(todosLosDados()) {
				System.out.println(" /7.Categoria Generala abierta");
			}else {
				System.out.println(" /Categoria Generala no Disponible");
			}
		}else {
			System.out.println(" /Categoria Generala cerrada");
		}
	
		
		}
	
	
}


