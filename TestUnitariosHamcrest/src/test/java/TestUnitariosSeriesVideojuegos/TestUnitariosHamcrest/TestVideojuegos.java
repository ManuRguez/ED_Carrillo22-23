package TestUnitariosSeriesVideojuegos.TestUnitariosHamcrest;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class TestVideojuegos {

	@Test
	 public void testEntregar() {
	     Videojuego videojuego = new Videojuego();
	     videojuego.entregar();
	     assertThat(videojuego.isEntregado(), equalTo(true));
	}
	 
	 @Test
	 public void testDevolver(){
		 Videojuego videojuego = new Videojuego();
		 videojuego.devolver();
		 assertThat(videojuego.isEntregado(),is(false));
	 }
	 @Test
	 public void testCompareToMayor(){
		 Videojuego videojuego1 = new Videojuego();
		 videojuego1.setHorasEstimadas(300);
		 Videojuego videojuego2 = new Videojuego();
		 videojuego2.setHorasEstimadas(200);
		 assertThat(videojuego1.compareTo(videojuego2),is(Videojuego.MAYOR));
	 }
	 @Test
	 public void testCompareToIgual() {
	     Videojuego videojuego1 = new Videojuego();
	     videojuego1.setHorasEstimadas(300);
	     Videojuego videojuego2 = new Videojuego();
	     videojuego2.setHorasEstimadas(300);
	     assertThat(videojuego1.compareTo(videojuego2), is(equalTo(Videojuego.IGUAL)));
	 }
	 @Test
	 public void testCompania(){
	Videojuego videojuego1 = new Videojuego();
	 videojuego1.setcompania("Sony");
	 assertThat(videojuego1.getcompania(), is("Sony"));
	 }

	 @Test
	 public void testGenero(){
	Videojuego videojuego1 = new Videojuego();
	 videojuego1.setGenero("Shooter");
	 assertThat(videojuego1.getGenero(), is("Shooter"));
	 }
	 
	 @Test
	 public void testTitulo(){
	Videojuego videojuego1 = new Videojuego();
	 videojuego1.setTitulo("Valorant");
	 assertThat(videojuego1.getTitulo(), is("Valorant"));
	 }
	 
	 @Test
	 public void testHorasEstimadas(){
	Videojuego videojuego1 = new Videojuego();
	 videojuego1.setHorasEstimadas(30);
	 assertThat(videojuego1.getHorasEstimadas(), is(30));
	 }
	 
	 @Test
	 public void testVideojuegoEntregado(){
	     Videojuego videojuego1 = new Videojuego("Titulo", 300, "Genero", "Creador");
	     videojuego1.entregar();
	     assertThat(videojuego1.isEntregado(), is(true));
	     videojuego1.devolver();
	     assertThat(videojuego1.isEntregado(), is(false));
	 }
	 @Test
	 public void testVideojuegosSettersGetters(){
	     Videojuego videojuego1 = new Videojuego("Titulo", 150, "Genero", "Creador");
	     assertThat(videojuego1.getTitulo(), is("Titulo"));
	     videojuego1.setTitulo("TituloNuevo");
	     assertThat(videojuego1.getTitulo(), is("TituloNuevo"));

	     assertThat(videojuego1.getHorasEstimadas(), is(150));
	     videojuego1.setHorasEstimadas(3);
	     assertThat(videojuego1.getHorasEstimadas(), is(3));

	     assertThat(videojuego1.getGenero(), is("Genero"));
	     videojuego1.setGenero("GeneroNuevo");
	     assertThat(videojuego1.getGenero(), is("GeneroNuevo"));

	     assertThat(videojuego1.getcompania(), is("Creador"));
	     videojuego1.setcompania("CreadorNuevo");
	     assertThat(videojuego1.getcompania(), is("CreadorNuevo"));
	 }


}





   




	
	
	



