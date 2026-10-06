package Ecuaciones_Lineales;

public class Lanzador_gauss {
    static void main(String[] args) {
        // Obtiene la matriz aumentada del sistema
        double [][] matriz = Defmatrizz.defmatriz();

        // Convierte la matriz en triangular superior
        Gauss.eliminacionGaussiana(matriz);

        // Despeja las incógnitas de abajo hacia arriba
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);

        // Imprime cada solución: x1, x2, x3...
        System.out.println("Soluciones del sistema:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = "  + soluciones[i]);
        }
    }
}
