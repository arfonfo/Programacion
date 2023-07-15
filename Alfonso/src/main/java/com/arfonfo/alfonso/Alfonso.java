
package com.arfonfo.alfonso;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;



/**
 *
 * @author alfon
 */
public class Alfonso {
    
    final String firstName = "Alfonso José";
    final String lastName = "Sánchez Costa";
    static final LocalDate fechaNac = LocalDate.of(1990, 11, 11);
    String[] hobbies = {"Swimming", "Running", "Coding", "Tech", "Horror movies", "Gaming"};

    public static void main(String[] args) {
        int age = Period.between(fechaNac, LocalDate.now()).getYears();
        System.out.println(age);
    }
}
