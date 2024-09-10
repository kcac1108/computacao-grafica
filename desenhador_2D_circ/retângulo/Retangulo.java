package ret�ngulo;
import ponto.Ponto;
import java.lang.Math;

/**
 * Escreva uma descri��o da classe Retangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Retangulo
{
    // ATRIBUTOS
    public Ponto p1, p2;

    // CONSTRUTORES
    public Retangulo (int x1, int y1, int x2, int y2) { // CONSTRUTOR de ret�ngulo com inteiros x1, x2, y1, y2
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
    
    public Retangulo (double x1, double y1, double x2, double y2) { // CONSTRUTOR de ret�ngulo com double x1, x2, y1, y2
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
 
    public Retangulo (Ponto p1, Ponto p2) { // CONSTRUTOR de ret�ngulo com dois pontos
        setP1(p1);
        setP2(p2);
    }
    
    public Retangulo (Retangulo r){ // CONSTRUTOR de ret�ngulo a partir de outro ret�ngulo
        setP1(r.getP1());
        setP2(r.getP2());
    }
    
    // GETTERS E SETTERS
    public Ponto getP1 () {
        return this.p1;
    }
    public Ponto getP2 () {
        return this.p2;
    }
    
    public void setP1 (Ponto p1) {
        this.p1 = p1;
    }
    public void setP2 (Ponto p2) {
        this.p2 = p2;
    }
    
}
