package com.biblioteca;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDateFormatting() {
        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // Formattazione della data in vari stili
        String fullFormat = Main.formatDateTime(dateTime, DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm:ss Ogit", Locale.ITALIAN));
        String mediumFormat = Main.formatDateTime(dateTime, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.ITALIAN));
        String shortFormat = Main.formatDateTime(dateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", Locale.ITALIAN));

        // Verifica dei risultati attesi
        assertEquals("venerdì, 1 marzo 2002 13:00:00 GMT", fullFormat);
        assertEquals("01 mar 2002 13:00:00", mediumFormat);
        assertEquals("01/03/2002 13:00", shortFormat);
    }
}