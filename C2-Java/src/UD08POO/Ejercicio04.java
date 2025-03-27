package UD08POO;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		class Serie{
			
			protected String titulo;
            protected int numTemporadas;
            protected boolean entregado;
            protected String genero;
            protected String creador;
            
            private static final int NUMEROTEMPORADAS_DEFECTO = 3;
            private static final boolean ENTREGADO_DEFECTO = false;
            private static final String TITULO_DEFECTO = "";
            private static final String GENERO_DEFECTO = "";
            private static final String CREADOR_DEFECTO = "";
            
            public String getTitulo() {
                return titulo;
            }
            public void setTitulo(String titulo) {

                this.titulo = titulo;
            }
         
            public int getNumTemporadas() {
                return numTemporadas;
            }
            public void setNumTemporadas(int numTemporadas) {

                this.numTemporadas = numTemporadas;
            }
      
            public boolean getEntregado() {
                return entregado;
            }
            public void setEntregado(boolean entregado) {

                this.entregado = entregado;
            }
            public String getGenero() {
                return genero;
            }
            public void setGenero(String genero) {

                this.genero = genero;
            }
         
            public String getCreador() {
                return creador;
            }
            public void setCreador(String creador) {

                this.creador = creador;
            }
            
            public Serie() {
                this.titulo = TITULO_DEFECTO;
                this.numTemporadas = NUMEROTEMPORADAS_DEFECTO;
                this.entregado = ENTREGADO_DEFECTO;
                this.genero = GENERO_DEFECTO;
                this.creador = CREADOR_DEFECTO;
            }
            
            public Serie(String titulo, String creador) {
                this.titulo = titulo;
                this.creador = creador;
                this.numTemporadas = NUMEROTEMPORADAS_DEFECTO;
                this.entregado = ENTREGADO_DEFECTO;
                this.genero = GENERO_DEFECTO;
            }
            
            public Serie(String titulo, int numTemporadas, String genero, String creador) {
                this.titulo = titulo;
                this.numTemporadas = numTemporadas;
                this.genero = genero;
                this.creador = creador;
                this.entregado = ENTREGADO_DEFECTO;
			
            }

		}

	}
}
