/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es
 */
public class UtilesPrimitivos {
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
     
   
    public static final int RANGE_IN = 0; // Dentro de Rango
    public static final int RANGE_BELOW = 1; // Debajo de Rango
    public static final int RANGE_ABOVE = 2; // Encima de Rango
    
    public static int num = 8;
    public static final int MIN = 1;
    public static final int MAX = 10;
    
    
    public static final int analizarRango(double num, double min, double max){
        int n = 0;
        boolean numOK = false;
        do {    
            try {
                System.out.printf("Número .......: ");
                n = SCN.nextInt();
                
                if (n > MAX) {
                    System.out.println("Análisis .....: FUERA (Arriba)");
                } else if (n < MIN){
                    System.out.println("Análisis .....: FUERA (Abajo)");
                } else if (n < MAX && n > MIN){
                    System.out.println("Análisis .....: DENTRO");
                }
                numOK = true;
            } catch (Exception e) {
                System.out.println("ERROR: Entrada incorrecta.");
                numOK = false;
            } finally {
                SCN.nextLine();
            }
        } while (!numOK);
        return n;
    }
}
