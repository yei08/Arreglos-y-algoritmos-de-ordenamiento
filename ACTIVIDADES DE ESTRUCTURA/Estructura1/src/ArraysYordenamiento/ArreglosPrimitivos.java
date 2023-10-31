/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
*/
package ArraysYordenamiento;

/**
 *
 * @author JEIFER ALCALA
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArreglosPrimitivos {

    // declarando arreglos de tipo byte
    static byte[] numerosCortos = new byte[5];

    // declarando un objeto Byte
    static Byte[] objetoByte = new Byte[5];

    // declaro arreglo con tipo de dato char
    static char[] caracter = new char[5];
                
    // declaro un objeto de tipo caracter
    static Character[] objetosCaracter = new Character[5];
    
    // el short tiene un rango que va desde -32,768 hasta 32,767.
    static short[] numeroCorto = new short[5];
    
    // declaro un array del objeto Short
    static Short[] objetosShort = new Short[5];
                                                    
    // declaro un int que va desde -2,147,483,648 (-2^31) hasta 2,147,483,647 (2^31 - 1).
    static int[] numerosEnteros = new int[5];

    // declaro array de la clase integer
    static Integer[] objetosEntero = new Integer[5];

    // declaro un arreglo de tipo de dato primitivo long que va
    // desde-9,223,372,036,854,775,808 (-2^63) hasta 9,223,372,036,854,775,807 (2^63
    // - 1).
    static long[] numerosLargos = new long[5];

    // declaro un array del objeto long
    static Long[] objetosLargo = new Long[5];

    // Declarando arreglos de tipo float
    static float[] numerosFlotantes = new float[5];

    // Declarando un arreglo de objetos Float
    static Float[] objetosFlotante = new Float[5];

    // Declarando arreglos de tipo double
    static double[] numerosDobles = new double[5];

    // Declarando un arreglo de objetos Double
    static Double[] objetosDoble = new Double[5];

    // Declarando arreglos de objetos Object
    static Object[] objetos = new Object[5];

    // Declarando un arreglo de objetos String
    static String[] cadenas = new String[5];

    int[] ventas = new int[5];


    // Función para obtener el promedio de ventas
    public static double obtenerPromedioVentas(int[] ventas) {
        int totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        return (double) totalVentas / ventas.length;
    }
    // funcion que me permite buscar la venta mas alta
    public static int buscarVentaMasAlta(int[] ventas) {
        int ventaMasAlta = ventas[0]; // Suponemos que la primera venta es la más alta

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventaMasAlta) {
                ventaMasAlta = ventas[i];
            }
        }

        return ventaMasAlta;
    }

    // funcion para buscar la venta mas baja
    public static int buscarVentaMasBaja(int[] ventas) {
        int ventaMasBaja = ventas[0]; // Suponemos que la primera venta es la más baja

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaMasBaja) {
                ventaMasBaja = ventas[i];
            }
        }

        return ventaMasBaja;
    }

    public static int ventaMasCercanaAlPromedio(int[] ventas) {
         double promedioVentas = obtenerPromedioVentas(ventas); // Llama a la función que calcula el promedio
        int ventaMasCercana = ventas[0]; // Suponemos que la primera venta es la más cercana

        double diferenciaMinima = Math.abs(ventas[0] - promedioVentas);

        for (int i = 1; i < ventas.length; i++) {
            double diferenciaActual = Math.abs(ventas[i] - promedioVentas);
            if (diferenciaActual < diferenciaMinima) {
                diferenciaMinima = diferenciaActual;
                ventaMasCercana = ventas[i];
            }
        }

        return ventaMasCercana;
    }

    // Función para ordenar las ventas de forma descendente
    public static void ordenarVentasDescendente(int[] ventas) {
        Arrays.sort(ventas);
        for (int i = 0; i < ventas.length / 2; i++) {
            int temp = ventas[i];
            ventas[i] = ventas[ventas.length - 1 - i];
            ventas[ventas.length - 1 - i] = temp;
        }
    }

    // Función para ordenar las ventas de forma ascendente
    public static void ordenarVentasAscendente(int[] ventas) {
        Arrays.sort(ventas);
    }

    // Función para desordenar las ventas
    public static void desordenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            int j = (int) (Math.random() * ventas.length);
            // Intercambia ventas[i] y ventas[j]
            int temp = ventas[i];
            ventas[i] = ventas[j];
            ventas[j] = temp;
        }
    }

    // Función para ordenar las ventas primero los pares y luego los impares
    public static void ordenarVentasParesImpares(int[] ventas) {
        Arrays.sort(ventas);
        int[] pares = new int[ventas.length];
        int[] impares = new int[ventas.length];
        int paresIndex = 0;
        int imparesIndex = 0;

        for (int venta : ventas) {
            if (venta % 2 == 0) {
                pares[paresIndex] = venta;
                paresIndex++;
            } else {
                impares[imparesIndex] = venta;
                imparesIndex++;
            }
        }
        
        // Copia los pares e impares ordenados de vuelta al arreglo original
        System.arraycopy(pares, 0, ventas, 0, paresIndex);
        System.arraycopy(impares, 0, ventas, paresIndex, imparesIndex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // relleno y muestro el arreglo tipo byte haciendo uso de un bucle FOR.
        for (int i = 0; i < numerosCortos.length; i++) {
            numerosCortos[i] = (byte) (i * 10);
        }

        System.out.println("Arreglo de tipo byte:");
        for (int i = 0; i < numerosCortos.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosCortos[i]);
        }

        // relleno y muestro el arreglo tipo Byte haciendo uso de un bucle FOR.
        for (int i = 0; i < objetoByte.length; i++) {
            numerosCortos[i] = (byte) (i * 10);
        }

        System.out.println("Arreglo de tipo Byte:");
        for (int i = 0; i < objetoByte.length; i++) {
            System.out.println("Elemento " + i + ": " + objetoByte[i]);
        }

        // Relleno el arreglo de tipo char haciendo uso de un bucle FOR.
        for (int i = 0; i < caracter.length; i++) {
            caracter[i] = (char) ('A' + i); // Rellena con letras de la A a la E
        }

        // Relleno el arreglo de objetos Character haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosCaracter.length; i++) {
            objetosCaracter[i] = (char) ('Z' - i); // Rellena con letras de la Z a la V
        }

        // Mostrar el arreglo de tipo char
        System.out.println("Arreglo de tipo char:");
        for (int i = 0; i < caracter.length; i++) {
            System.out.println("Elemento " + i + ": " + caracter[i]);
        }

        // Mostrar el arreglo de objetos Character
        System.out.println("\nArreglo de objetos Character:");
        for (int i = 0; i < objetosCaracter.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosCaracter[i]);
        }

        // Relleno el arreglo de tipo short haciendo uso de un bucle FOR.
        for (int i = 0; i < numeroCorto.length; i++) {
            numeroCorto[i] = (short) (i * 100);
        }

        // Relleno el arreglo de objetos Short haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosShort.length; i++) {
            objetosShort[i] = (short) (i * 50);
        }

        // Mostrar el arreglo de tipo short
        System.out.println("Arreglo de tipo short:");
        for (int i = 0; i < numeroCorto.length; i++) {
            System.out.println("Elemento " + i + ": " + numeroCorto[i]);
        }

        // Mostrar el arreglo de objetos Short
        System.out.println("\nArreglo de objetos Short:");
        for (int i = 0; i < objetosShort.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosShort[i]);
        }

        // Relleno el arreglo de tipo int haciendo uso de un bucle FOR.
        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = i * 100;
        }

        // Relleno el arreglo de objetos Integer haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosEntero.length; i++) {
            objetosEntero[i] = i * 50;
        }

        // Mostrar el arreglo de tipo int
        System.out.println("Arreglo de tipo int:");
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosEnteros[i]);
        }

        // Mostrar el arreglo de objetos Integer
        System.out.println("\nArreglo de objetos Integer:");
        for (int i = 0; i < objetosEntero.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosEntero[i]);
        }

        // Relleno el arreglo de tipo long haciendo uso de un bucle FOR.
        for (int i = 0; i < numerosLargos.length; i++) {
            numerosLargos[i] = i * 1000000000L; // La 'L' al final indica que es un valor long
        }

        // Relleno el arreglo de objetos Long haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosLargo.length; i++) {
            objetosLargo[i] = Long.valueOf(i * 500000000L);
        }

        // Mostrar el arreglo de tipo long
        System.out.println("Arreglo de tipo long:");
        for (int i = 0; i < numerosLargos.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosLargos[i]);
        }

        // Mostrar el arreglo de objetos Long
        System.out.println("\nArreglo de objetos Long:");
        for (int i = 0; i < objetosLargo.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosLargo[i]);
        }

        // Relleno el arreglo de tipo float haciendo uso de un bucle FOR.
        for (int i = 0; i < numerosFlotantes.length; i++) {
            numerosFlotantes[i] = i * 1.5f; // La 'f' al final indica que es un valor float
        }

        // Relleno el arreglo de objetos Float haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosFlotante.length; i++) {
            objetosFlotante[i] = Float.valueOf(i * 0.75f);
        }

        // Mostrar el arreglo de tipo float
        System.out.println("Arreglo de tipo float:");
        for (int i = 0; i < numerosFlotantes.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosFlotantes[i]);
        }

        // Mostrar el arreglo de objetos Float
        System.out.println("\nArreglo de objetos Float:");
        for (int i = 0; i < objetosFlotante.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosFlotante[i]);
        }

        // Relleno el arreglo de tipo double haciendo uso de un bucle FOR.
        for (int i = 0; i < numerosDobles.length; i++) {
            numerosDobles[i] = i * 2.5; // No se necesita la 'd' al final, los literales son double por defecto
        }

        // Relleno el arreglo de objetos Double haciendo uso de un bucle FOR.
        for (int i = 0; i < objetosDoble.length; i++) {
            objetosDoble[i] = Double.valueOf(i * 1.25);
        }

        // Mostrar el arreglo de tipo double
        System.out.println("Arreglo de tipo double:");
        for (int i = 0; i < numerosDobles.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosDobles[i]);
        }

        // Mostrar el arreglo de objetos Double
        System.out.println("\nArreglo de objetos Double:");
        for (int i = 0; i < objetosDoble.length; i++) {
            System.out.println("Elemento " + i + ": " + objetosDoble[i]);
        }
        // Relleno el arreglo de objetos Object.
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = "Objeto " + i;
        }

        // Relleno el arreglo de objetos String.
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = "Cadena " + i;
        }

        // Mostrar el arreglo de objetos Object.
        System.out.println("Arreglo de objetos Object:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("Elemento " + i + ": " + objetos[i]);
        }

        // Mostrar el arreglo de objetos String.
        System.out.println("\nArreglo de objetos String:");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Elemento " + i + ": " + cadenas[i]);
        }
        
        // declaro e inicializo un arreglo de tipo String
        String[] dataStructs = { "Listas", "Colas", "Pilas", "Mapas", "Conjuntos" };
        // accedo a los elementos del arreglo
        System.out.println("Elemento 1: " + dataStructs[0]);
        System.out.println("Elemento 2: " + dataStructs[1]);
        System.out.println("Elemento 3: " + dataStructs[2]);
        System.out.println("Elemento 4: " + dataStructs[3]);
        System.out.println("Elemento 5: " + dataStructs[4]);

        // *********************** */
        String[] características = new String[5]; // Declara un arreglo de cadenas con 5 elementos

        // Inicializa cada elemento del arreglo
        características[0] = "Color";
        características[1] = "Tamaño";
        características[2] = "Peso";
        características[3] = "Material";
        características[4] = "Forma";

        // Puedes acceder a los elementos del arreglo de la siguiente manera:
        System.out.println("Característica 1: " + características[0]);
        System.out.println("Característica 2: " + características[1]);
        System.out.println("Característica 3: " + características[2]);
        System.out.println("Característica 4: " + características[3]);
        System.out.println("Característica 5: " + características[4]);

        

        // ingresa valores aletorios de datos para devolvertelos
        System.out.println("ingrese valores aleatorios de datos para hacer una prueba");

        for (int i = 0; i < 5; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            dataStructs[i] = scanner.nextLine();
        }

        // Cerrar el scanner después de su uso
       // scanner.close();

        // Imprimir los datos ingresados
        System.out.println("Los datos ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Dato " + (i + 1) + ": " + dataStructs[i]);
        }
        // aquí se muestra DataStructure con su equivalente a características
        System.out.println("Elementos de dataStructs con sus características:");
        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + " - " + características[i]);
        }

        // declaro un arreglo de enteros con en una variable "ventas"
        int[] ventas;

        // Inicio el arreglo con una cantidad aleatoria de elementos
        int cantidadElementos = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 99
        ventas = new int[cantidadElementos];

        // lleno el arreglo ventas con valores aleatoreos entre 1 y 1000
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 1000) + 1;
        }
        // muestro la cantidad de ventas
        System.out.println("Cantidad de ventas: " + ventas.length);

        // muestro el valor de cada una de las ventas
        System.out.println("Valores de las ventas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1) + ": " + ventas[i]);
        }

        // muestro el total de todas las ventas
        int totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        System.out.println("Total de ventas: " + totalVentas);
        
        // el promedio de todas las ventas
        double promedioVentas = (double) totalVentas / ventas.length;
        System.out.println("Promedio de ventas: " + promedioVentas);

        // invoco la funcion venta mas alta
        int ventaMasAlta = buscarVentaMasAlta(ventas);
        System.out.println("La venta más alta es: " + ventaMasAlta);

        // invoco la funcion para que me retorne el valor de la venta mas baja
        int ventaMasBaja = buscarVentaMasBaja(ventas);
        System.out.println("La venta más baja es: " + ventaMasBaja);

        // invoco la funcion para que me retorne el valor mas cercano al promedio
        int ventaMasCercana = ventaMasCercanaAlPromedio(ventas);
        System.out.println("La venta más cercana al promedio es: " + ventaMasCercana);

      

        // Solicitar al usuario la elección de ordenamiento
        System.out.println("Elige la opción de ordenamiento:");
        System.out.println("1. Descendente");
        System.out.println("2. Ascendente");
        System.out.println("3. Desordenar");
        System.out.println("4. Pares e Impares");
        System.out.print("Ingresa el número de la opción: ");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ordenarVentasDescendente(ventas);
                System.out.println("Ventas ordenadas de forma descendente: " + Arrays.toString(ventas));
                break;
            case 2:
                ordenarVentasAscendente(ventas);
                System.out.println("Ventas ordenadas de forma ascendente: " + Arrays.toString(ventas));
                break;
            case 3:
                desordenarVentas(ventas);
                System.out.println("Ventas desordenadas: " + Arrays.toString(ventas));
                break;
            case 4:
                ordenarVentasParesImpares(ventas);
                System.out.println("Ventas ordenadas primero pares y luego impares: " + Arrays.toString(ventas));
                break;
            default:
                System.out.println("Opción no válida");
        }

        // Cerrar el scanner después de su uso
        scanner.close();
        
        
        
    }

}

   
