package Modelo;

public class Tablero {
    
    private Casillas[][] casillas;
    
    public Tablero() {
        this.casillas = new Casillas[9][9];
       }
       public Casillas[][] getCasillas() {
        return this.casillas;
       }
       public void inicializarTablero() {
 
        for (int i = 0; i < this.casillas.length; i++) {
         for (int j = 0; j < this.casillas[i].length; j++) 
        {
          Casillas casilla = new Casillas();
          casilla.setValor(0);
          casilla.setPosX(i);
          casilla.setPosY(j);
          casilla.setEditable(true);
          casilla.establecerSectorSegunPosicion();
          
          this.casillas[i][j] = casilla;
        }
        }
    }
    public void editarCasilla(Casillas casilla) {
        this.casillas[casilla.getPosX()][casilla.getPosY()] = casilla;
       }
       public void reestablecerCasillaPorPosicion(int x, int y) {
        this.casillas[x][y].setValor(0);
       }
}

