package org.kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeNumberIdentifierTest {
    @Test
    public void testIsPrime() {
        PrimeNumberIdentifier checker = new PrimeNumberIdentifier();
        assertTrue(checker.isPrime(2));
    }
}
