package com.abc;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TransactionTest {

    private static final double AMOUNT = 100.0;
     private Date transactionDate;
    private Transaction transaction;

    @Before
    public void setUp() {
        transaction = new Transaction(AMOUNT);
    }

    @Test
    public void testTransactionAmount() {
            assertEquals(AMOUNT, transaction.amount, 0.001);
        }

        @Test
        public void testTransactionDate() {
            assertNotNull(transactionDate);
        }
}
