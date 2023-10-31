/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysYordenamiento;

/**
 *
 * @author JEIFER ALCALA
 */
import java.util.Arrays;
import java.util.Scanner;

public class arreglosMultidimencionales {
    static Object[][] lenguajes = new Object[5][8];

    public static void main(String[] args) {
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
        infoLenguajes();

        boolean info[] = {true, false, true, true, false};
        mostrarInfoLenguajes(info);

        // Buscar un lenguaje en la matriz
        boolean encontrado = buscarLenguaje("Python");
        System.out.println("¿Se encontró Python? " + encontrado);

        // Obtener las coordenadas de un lenguaje en la matriz
        int[] coordenadas = obtenerCoordenadas("Python");
        if (coordenadas != null) {
            System.out.println("Python se encuentra en la fila " + coordenadas[0] + ", columna " + coordenadas[1]);
        } else {
            System.out.println("Python no se encontró en la matriz");
        }

        // Obtener un registro completo de un lenguaje por fila
        try {
            Object[] registro = obtenerRegistro(1);
            System.out.println("Registro en la fila 1: " + Arrays.toString(registro));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Obtener todos los datos de una columna
        try {
            Object[] columna = obtenerColumna(0);
            System.out.println("Datos en la columna 0: " + Arrays.toString(columna));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void infoLenguajes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("Ingrese el valor para la fila " + i + " y la columna " + j);
                lenguajes[i][j] = scanner.next();
            }
        }
    }

    public static boolean buscarLenguaje(String nombre) {
        for (int i = 0; i < 5; i++) {
            if (lenguajes[i][0].equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static int[] obtenerCoordenadas(String nombre) {
        for (int i = 0; i < 5; i++) {
            if (lenguajes[i][0].equals(nombre)) {
                return new int[]{i, 0};
            }
        }
        return null;
    }

    public static Object[] obtenerRegistro(int fila) throws Exception {
        if (fila < 0 || fila >= 5) {
            throw new Exception("La fila está fuera de rango");
        }
        return lenguajes[fila];
    }

    public static Object[] obtenerColumna(int columna) throws Exception {
        if (columna < 0 || columna >= 8) {
            throw new Exception("La columna está fuera de rango");
        }
        Object[] columnData = new Object[5];
        for (int i = 0; i < 5; i++) {
            columnData[i] = lenguajes[i][columna];
        }
        return columnData;
    }

    public static void mostrarInfoLenguajes(boolean[] info) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < info.length; j++) {
                if (info[j]) {
                    System.out.print(lenguajes[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

