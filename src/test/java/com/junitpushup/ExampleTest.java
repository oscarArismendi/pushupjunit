package com.junitpushup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        // Given - elementos que se tienen para realizar la prueba
        int numberA = 5;
        int numberB = 10;
        // When : Cuando
        int result = example.sumar(numberA, numberB);
        // Then - Entonces
        assertNotNull(result);
        assertEquals(15, result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        // Given - elementos que se tienen para realizar la prueba
        int numberA = 5;
        // When : Cuando
        Boolean result = example.checkPositivo(numberA);
        // Then - Entonces
        assertNotNull(result);
        assertTrue(result);
        assertInstanceOf(Boolean.class, result);
        // assertThrows(null, null)
    }

    @Test
    public void testCheckPositivoError() {
        // Given - elementos que se tienen para realizar la prueba
        int numberA = -5;
        // Then - Entonces
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(numberA);
        });
    }

    // 3. Método para contar el número de letras 'a' en una cadena
    @Test
    public void testContarLetrasA() {
        // Given - elementos que se tienen para realizar la prueba
        String stringA = "aaaaaB";
        // When : Cuando
        int result = example.contarLetrasA(stringA);
        // Then - Entonces
        assertNotNull(result);
        assertEquals(5, result);
        assertInstanceOf(Integer.class, result);
    }

    // 4. Método que retorna un valor booleano si la lista contiene el elemento
    @Test
    public void testContieneElemento() {
        // Given - elementos que se tienen para realizar la prueba
        String stringA = "test";
        List<String> supplierNames = Arrays.asList("sup1", "sup2", "test");
        // When : Cuando
        Boolean result = example.contieneElemento(supplierNames, stringA);
        // Then - Entonces
        assertNotNull(result);
        assertTrue(result);
        assertInstanceOf(Boolean.class, result);
    }

    @Test
    // 5. Método para revertir una cadena
    public void testRevertirCadena() {
        // Given - elementos que se tienen para realizar la prueba
        String stringA = "test";
        // When : Cuando
        String result = example.revertirCadena(stringA);
        // Then - Entonces
        assertNotNull(result);
        assertEquals("tset", result);
        assertInstanceOf(String.class, result);
    }

        // 6. Método que calcula el factorial de un número
        @Test
        public void testFactorial() {
        // Given - elementos que se tienen para realizar la prueba
        int numbereA = 2;
        // When : Cuando
        Long result = example.factorial(numbereA);
        // Then - Entonces
        assertNotNull(result);
        assertEquals(2, result);
        assertInstanceOf(Long.class, result);
        }

        @Test
        public void testFactorialError() {
       // Given - elementos que se tienen para realizar la prueba
       int numberA = -5;
       // Then - Entonces
       assertThrows(IllegalArgumentException.class, () -> {
           example.factorial(numberA);
       });
        }

            @Test
    public void testEsPrimo() {
        // Given
        int number = 3;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMayorACuatro() {
        // Given
        int number = 7;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMenorQueUno() {
        // Given
        int number = 1;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimo() {
        // Given
        int number = 9;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // When
        String result = this.example.mensajeConRetraso();

        // Then
        assertEquals("Listo después de retraso", result);
    }
  @Test
    public void testConvertirAString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<String> result = this.example.convertirAString(numbers);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
    }

    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = this.example.calcularMedia(numbers);

        // Then
        assertEquals(2, result);
    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testConvertirListaAString(){
        //Given
        List<String> lstStrings = List.of("Hello,", " ","There!");
        //When
        String result = this.example.convertirListaAString(lstStrings);
        //Then
        assertEquals("HELLO,, ,THERE!", result);
    }


}
