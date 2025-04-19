package org.kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeNumberIdentifierTest {

    @Test
    public void testNonPrimeNumbers() {
        PrimeNumberIdentifier checker = new PrimeNumberIdentifier();
        assertFalse(checker.isPrime(1));
        assertFalse(checker.isPrime(4));
        assertFalse(checker.isPrime(9));
        assertFalse(checker.isPrime(15));
    }

    @Test
    public void testPrimeNumbers() {
        PrimeNumberIdentifier checker = new PrimeNumberIdentifier();
        assertTrue(checker.isPrime(2));
        assertTrue(checker.isPrime(3));
        assertTrue(checker.isPrime(5));
        assertTrue(checker.isPrime(7));
        assertTrue(checker.isPrime(11));
        assertTrue(checker.isPrime(13));
    }
}
