/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.registrationandlogin;



import org.junit.Test;
import static org.junit.Assert.*;

public class MessageIT {
    
    public MessageIT() {
    }

    /**
     * Test 1: Valid Message ID (less than 10 chars)
     */
    @Test
    public void testCheckMessageID_Valid() {
        Message instance = new Message("12345", "+27831234567", "Hi there");
        assertTrue(instance.checkMessageID());
    }

    /**
     * Test 2: Invalid Message ID (more than 10 chars)
     */
    @Test
    public void testCheckMessageID_Invalid() {
        Message instance = new Message("1234567890123", "+27831234567", "Hi there");
        assertFalse(instance.checkMessageID());
    }

    /**
     * Test 3: Valid Recipient Cell - starts with +27 and 12 chars
     */
    @Test
    public void testCheckRecipientCell_Valid() {
        Message instance = new Message("1", "+27831234567", "Hello");
        assertTrue(instance.checkRecipientCell());
    }

    /**
     * Test 4: Invalid Recipient Cell
     */
    @Test
    public void testCheckRecipientCell_Invalid() {
        Message instance = new Message("1", "0831234567", "Hello");
        assertFalse(instance.checkRecipientCell());
    }

    /**
     * Test 5: Message Hash created
     */
    @Test
    public void testCreateMessageHash() {
        Message instance = new Message("0", "+27831234567", "Hello World");
        String hash = instance.createMessageHash();
        // Hash should not be null or empty
        assertNotNull(hash);
        assertFalse(hash.isEmpty());
    }

    /**
     * Test 6: Sent Message returns correct details
     */
    @Test
    public void testSentMessage() {
        Message instance = new Message("123", "+27831234567", "Test message");
        String details = instance.SentMessage();
        assertTrue(details.contains("123"));
    }
}
    

