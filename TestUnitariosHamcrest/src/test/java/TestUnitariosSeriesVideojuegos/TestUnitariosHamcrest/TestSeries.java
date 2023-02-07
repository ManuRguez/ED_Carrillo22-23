package TestUnitariosSeriesVideojuegos.TestUnitariosHamcrest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSeries {
	

	 @Test
	 public void testEntregar(){
		 Serie serie1= new Serie();
		 serie1.entregar();
		 assertThat(serie1.isEntregado(),is(true));
	 }
	 @Test
	 public void testDevolver(){
		 Serie serie1= new Serie();
		 serie1.devolver();
		 assertThat(serie1.isEntregado(),is(false));
	 }
	 @Test
	 public void testCompareTo(){
		 Serie serie1= new Serie();
		 serie1.setnumeroTemporadas(4);
		 Serie serie2=new Serie();
		 serie2.setnumeroTemporadas(1);
		 assertThat(serie1.compareTo(serie2),is(Serie.MAYOR));
	 }
	 @Test
	 public void testNumeroTemporadasPorDefecto() {
	     Serie serie = new Serie();
	     assertThat(serie.getnumeroTemporadas(), is(equalTo(Serie.NUM_TEMPORADAS_DEF)));
	 }
	 @Test
	 public void testCompareToIgual() {
	     Serie serie1 = new Serie();
	     serie1.setnumeroTemporadas(3);
	     Serie serie2 = new Serie();
	     serie2.setnumeroTemporadas(3);
	     assertThat(serie1.compareTo(serie2), is(equalTo(Serie.IGUAL)));
	 }
	 @Test
	 public void testCompareToMenor(){
	 Serie serie1 = new Serie();
	 serie1.setnumeroTemporadas(1);
	 Serie serie2 = new Serie();
	 serie2.setnumeroTemporadas(2);
	 assertThat(serie1.compareTo(serie2), is(Serie.MENOR));
	 }
	 @Test
	 public void testCreador(){
	 Serie serie = new Serie();
	 serie.setcreador("Paco");
	 assertThat(serie.getcreador(), is("Paco"));
	 }
	 @Test
	 public void testGenero(){
	 Serie serie = new Serie();
	 serie.setGenero("Drama");
	 assertThat(serie.getGenero(), is("Drama"));
	 }
	 @Test
	 public void testTitulo(){
	 Serie serie = new Serie();
	 serie.setTitulo("Torrente 4");
	 assertThat(serie.getTitulo(), is("Torrente 4"));
	 }
	 @Test
	 public void testNumeroTemporadas(){
	 Serie serie = new Serie();
	 serie.setnumeroTemporadas(2);
	 assertThat(serie.getnumeroTemporadas(), is(2));
	 }
	 @Test
	 public void testSerieEntregado(){
	     Serie s = new Serie("Titulo", 2, "Genero", "Creador");
	     s.entregar();
	     assertThat(s.isEntregado(), is(true));
	     s.devolver();
	     assertThat(s.isEntregado(), is(false));
	 }
	 @Test
	 public void testSerieSettersGetters(){
	     Serie s = new Serie("Titulo", 2, "Genero", "Creador");
	     assertThat(s.getTitulo(), is("Titulo"));
	     s.setTitulo("TituloNuevo");
	     assertThat(s.getTitulo(), is("TituloNuevo"));

	     assertThat(s.getnumeroTemporadas(), is(2));
	     s.setnumeroTemporadas(3);
	     assertThat(s.getnumeroTemporadas(), is(3));

	     assertThat(s.getGenero(), is("Genero"));
	     s.setGenero("GeneroNuevo");
	     assertThat(s.getGenero(), is("GeneroNuevo"));

	     assertThat(s.getcreador(), is("Creador"));
	     s.setcreador("CreadorNuevo");
	     assertThat(s.getcreador(), is("CreadorNuevo"));
	 }

	}

