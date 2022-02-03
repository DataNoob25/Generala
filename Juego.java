import java.util.*;

public class Juego {

	public static void main(String[] args) {
		Jugador j1=new Jugador("Alex");
		Jugador j2=new Jugador("Brian");
		Jugador jugadores[]=new Jugador[2];
		jugadores[0]=j1;
		jugadores[1]=j2;
		int turnos=0,ganador=0;
		boolean GeneralaServida=false;
		Scanner sc=new Scanner(System.in);
		
		do {
			for(int i=0;i<jugadores.length;i++) {
				int tiros=0;
				boolean cambio=false;
				boolean guardar=false;
				boolean catElegida=false;
				
					System.out.println("Jugador "+jugadores[i].getNombre());
					System.out.println("Tira dados por primera vez!!!! en el turno "+(turnos+1));
					if(jugadores[i].tirarDados()) {
						ganador=i;
						GeneralaServida=true;
						break;
					}
					
					
				do {
					
	System.out.println("1.Elegir categoria // 2.volver a tirar // 3.Guardar dados utiles // 4.Ver categorias Disponibles // 5.Cerrar categoria Abierta");
					int op=sc.nextInt();
					
					if(op==1) {
						
						if(!cambio) {

							if(jugadores[i].elegirCategoria()) {
								break;
							}else {
								System.out.println("Por favor elija una categoria disponible, Jugador "+jugadores[i].getNombre());
								catElegida=true;
								continue;
							}
						
						}else {
							System.out.println("Ya guardaste Los dados Utiles, estas obligado a tirar los tiros restantes");
						}
						
					}
					
					else if(op==2) {
						if(!catElegida) {
						tiros+=jugadores[i].tirarDeNuevo();//j1.tirarDeNuevo();
						if(tiros==2) {
	System.out.println("1.Guardar Dados e ir a las opciones para terminar el turno // 2. ir directamente a las opciones para terminar turno");
					op=sc.nextInt();
						if(op==1) {
							jugadores[i].guardarDadosUtiles();//j1.guardarDadosUtiles();
							jugadores[i].decision();//j1.decision();
							break;
						}else if(op==2) {
							jugadores[i].decision();//j1.decision();
							break;
						}			
						}
						guardar=false;
						
						}else {
							System.out.println("Debes elegir una categoria si o si");
						}
						
						}
					
					else if(op==3) {
							if(!catElegida) {
								
						if(!guardar) {
						if(jugadores[i].guardarDadosUtiles()) {
						System.out.println("Guarda otros dados o vuelve a tirar.");
						continue;
						}else {
							cambio=true;
							guardar=true;
						}
						
						}else {
							System.out.println("Ya guardaste Los dados Utiles, tenes que tirar de nuevo para volver a guardar");
						}
						
							}else {
								System.out.println("Debes elegir una categoria si o si");
							}
					}
					
					else if(op==4) {
						jugadores[i].categoriasDisponibles();//j1.categoriasDisponibles();
					}
					
					else if(op==5) {
						jugadores[i].cerrarCategorias();
						break;
					}
				
				}while(tiros<2);
				
				
				
			}
			
			if(GeneralaServida) {
				break;
			}
			
			turnos++;
	}while(turnos<7);
		
		
		if(GeneralaServida) {
			System.out.println("Generala Servida Felicitaciones!!!");
			System.out.println("El ganador de la GENERALA es el jugador: "+jugadores[ganador].getNombre());
			
		}else {
			ganador(jugadores);
		}
				
		
		
	}
	
	
	public static void ganador(Jugador [] jugadores) {
		int puntajeFinal=0,ganador=0;
	for(int i=0;i<jugadores.length;i++) {
		if(jugadores[i].puntajeTotal()>puntajeFinal) {
			puntajeFinal=jugadores[i].puntajeTotal();
			ganador=i;
			
		}
	}

System.out.println("El ganador de la ´Generala´ es el jugador "+jugadores[ganador].getNombre()+" con un total de "+ puntajeFinal+" puntos");
	
}


}
