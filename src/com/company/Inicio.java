package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Inicio {

    public static void main(String[] args) {
	// Introducir un número con la clase Scanner e ir sumando todos los números anteriores. Ej: Número 5, Resultado = 15

    Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número para hallar el sumatorio de todos los anteriores");
        int numeroUsuario = sc.nextInt();

            ArrayList todosNumeros = new ArrayList();
            while (numeroUsuario != 0) {
                todosNumeros.add(numeroUsuario);
                numeroUsuario --;
            }

            System.out.println(todosNumeros);
            int resultado = 0;
            int extra = 0;

            for (int i = 0; i <todosNumeros.size(); i++){
                extra = (int) todosNumeros.get(i);
                resultado = resultado + extra;
                extra = 0;
            }

        System.out.println(resultado);


    }
}
