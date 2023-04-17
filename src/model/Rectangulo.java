package model;

/**
 * Esta clase define objetos de tipo Rectángulo con base y una
 * altura como atributos.
 * 
 * @version 1.2/2020
 */
public class Rectangulo {
    private int base; // Atributo que define la base de un rectángulo
    private int altura; // Atributo que define la altura de un rectángulo
    
    /**
     * Constructor de la clase Rectángulo
     * 
     * @param base   Parámatro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicacíón de la base por la altura
     * 
     * @return Área de un rectangulo 
     */
    public double calculaArea(){
        return base * altura;
    }

    /**
     * Método que calcula y devuelve el perimetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * 
     *@return Perímetro de un rentángulo
     */
    public double calcularPerimetro(){
        return (2 * base) + (2 * altura);
    }
}