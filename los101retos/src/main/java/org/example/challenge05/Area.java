package org.example.challenge05;

public class Area {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */
    public static float calculateArea(String polygonType, float val1, float val2){
        float area = 0;
        switch (polygonType){
            case "Triangle":
                area = (val1 * val2)/2;
                break;
            case "Rectangle":
                area = val1 * val2;
                break;
            case "Square":
                area = val1 * val1;
                break;
            default:
                System.out.println("Polygon type should be Triangle, Rectangle or Square.");
        }
        return area;
    }
}
