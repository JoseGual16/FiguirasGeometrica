package app;

/*Se importan todas las figuras geometricas:
 * -Circulo
 * -Cuadrado
 * -Rectangulo
 * -TrianguloRectangulo
 */
import model.Circulo;
import model.Cuadrado;
import model.Rectangulo;
import model.TrianguloRectangulo;


/**
 * Esta clase recibe e imprime todos los resultados de los metodos y funciones
 * de cada figura geometrica
 */
public class App {
    public static void main(String[] args) throws Exception {

        //Se genera un salto de linea
        System.out.println("");

        /**
         * Se importa la funcion del ciruclo y se coloca como una variable de tipo objeto
         * ademas le damos el valor al radio
         */
        Circulo objtCirculo = new Circulo(4);

        /** Se imprime el resultado del area del Circulo
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El area del circulo es " + objtCirculo.calculaArea());
        
        /** Se imprime el resultado del perimetro del Circulo
         * y se llama el metodo calcularPerimetro para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El perimetro del circulo es " + objtCirculo.calcularPerimetro());

        //Se hace un salto de linea para separar las diferentes respuestas de cada figura
        System.out.println("");

        // Se importa la funcion del cuadrado y se coloca como una variable de tipo objeto ademas le damos el valor a los lados
        Cuadrado objtCuadrado = new Cuadrado(6);

        /** Se imprime el resultado del area del Cuadrado
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El area del cuadrado es " + objtCuadrado.calculaArea());

        /** Se imprime el resultado del perimetro del Cuadrado
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El perimetro del cuadrado es " + objtCuadrado.calcularPerimetro());

        //Se hace un salto de linea para separar las diferentes respuestas de cada figura 
        System.out.println("");

        /**
         * Se importa la funcion del Rectangulo y se guarda como una variable de tipo objeto
         * y le damos los valores para base y altura
         */
        Rectangulo objtRectangulo = new Rectangulo(6, 12);

        /** Se imprime el resultado del area del Rectangulo
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El area del Rectangulo es " + objtRectangulo.calculaArea());

        /** Se imprime el resultado del perimetro del Rectangulo
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El perimetro del Rectangulo es " + objtRectangulo.calcularPerimetro());

        //Se hace un salto de linea para separar las diferentes respuestas de cada figura
        System.out.println("");

        /**
         * Se importa la funcion del Triangulo Rectangulo y se guarda como una variable de tipo objeto
         * y le damos los valores de la base y la altura
         */
        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(9, 16);

        /** Se imprime el resultado del perimetro del Triangulo Rectangulo
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("El perimetro del Triangulo Rectangulo es " + objTrianguloRectangulo.calcularPerimetro());

        /** Se imprime el resultado del la hipotenusa del Triangulo Rectangulo
         * y se llama el metodo calcularArea para poder hacer
         * el proceso e imprimir por consola el resultado
         */
        System.out.println("la hipotenusa del Triangulo Rectangulo es " + objTrianguloRectangulo.calcularHipotenusa());

        /** Se imprime la funcion determinarTipoTriangulo() para poder determinar si el Triangulo Rectangulo es:
         * - Equilatero: si sus tres lados son iguales
         * - Escaleno: si sus tres lados son todos diferentes
         * - Isosceles: si dos de sus lados son iguales y el otro es diferente de los demas
         */
        objTrianguloRectangulo.determinarTipoTriangulo();

        /*Se genera un salto de linea */
        System.out.println("");
    }
}
