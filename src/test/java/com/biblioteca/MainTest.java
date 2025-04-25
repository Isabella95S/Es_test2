package com.biblioteca;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void formatDateTime() {
    assertEquals("1 marzo 2023 ", Main.formatDateTime(OffsetDateTime.parse("2023-03-01T13:00:00Z"), java.time.format.DateTimeFormatter.ofPattern("d MMMM yyyy ", java.util.Locale.ITALIAN)));
    }

    @Test
    void getYear() {

        assertEquals(2023, Main.getYear(OffsetDateTime.parse("2023-03-01T13:00:00Z")));

    }
}