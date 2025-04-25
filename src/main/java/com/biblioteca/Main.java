package com.biblioteca;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {
public static void main(String[] args) {
    // Creazione dell'oggetto OffsetDateTime dalla stringa
    OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");


    // Formattazione della data in vari stili
    //String fullFormat = formatDateTime(dateTime, DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm:ss O", Locale.ITALIAN));
    //String mediumFormat = formatDateTime(dateTime, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.ITALIAN));
    //String shortFormat = formatDateTime(dateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", Locale.ITALIAN));
    String longFormat = formatDateTime(dateTime, DateTimeFormatter.ofPattern("d MMMM yyyy ", Locale.ITALIAN)); //funzione che restituisce : 1 marzo 2023
    // Stampa delle versioni formattate
    //System.out.println("Formato FULL: " + fullFormat);
   // System.out.println("Formato MEDIUM: " + mediumFormat);
    System.out.println("Formato LONG: " + longFormat);
}

// Metodo per formattare la data
public static String formatDateTime(OffsetDateTime dateTime, DateTimeFormatter formatter) {
    return dateTime.format(formatter);
}

public static int getYear(OffsetDateTime dateTime) {
    return dateTime.getYear();

}
}