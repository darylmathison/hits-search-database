/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.key;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.mockito.Mockito.*;

/**
 *
 * @author Daryl
 */
public class QueryRequestKeyTest {
    private static final Logger logger = LoggerFactory.getLogger(QueryRequestKeyTest.class);
    
    private final UUID uuid = UUID.randomUUID();
    private QueryRequestKey requestKey;
    
    public QueryRequestKeyTest() {
    }
    
    @Before
    public void setUp() {
        requestKey = new QueryRequestKey();
        requestKey.setUuid(uuid.toString());
    }
    
    @After
    public void tearDown() {
        requestKey = null;
    }

    /**
     * Test of getUuid method, of class QueryRequestKey.
     */
    @Test
    public void testGetUuid() {
        logger.info("testGetUuid");
        String result = requestKey.getUuid();
        assertEquals(uuid.toString(), result);
    }

    /**
     * Test of setUuid method, of class QueryRequestKey.
     */
    @Test
    public void testSetUuid() {
        logger.info("testSetUuid");
        QueryRequestKey instance = new QueryRequestKey();
        instance.setUuid(uuid.toString());
        assertEquals(uuid.toString(), instance.getUuid());
    }

    /**
     * Test of writeData method, of class QueryRequestKey.
     */
    @Test
    public void testWriteData() throws Exception {
        logger.info("testWriteData");
        ObjectDataOutput odo = mock(ObjectDataOutput.class);
        requestKey.writeData(odo);
        verify(odo).writeUTF(uuid.toString());
    }

    /**
     * Test of readData method, of class QueryRequestKey.
     */
    @Test
    public void testReadData() throws Exception {
        logger.info("testReadData");
        ObjectDataInput odi = mock(ObjectDataInput.class);
        when(odi.readUTF()).thenReturn(uuid.toString());
        QueryRequestKey instance = new QueryRequestKey();
        instance.readData(odi);
        assertEquals(requestKey, instance);
    }

    /**
     * Test of getPartitionKey method, of class QueryRequestKey.
     */
    @Test
    public void testGetPartitionKey() {
        logger.info("testGetPartitionKey");
        assertEquals(uuid.toString(), requestKey.getPartitionKey());
    }

    /**
     * Test of hashCode method, of class QueryRequestKey.
     */
    @Test
    public void testHashCode() {
        logger.info("testHashCode");
        QueryRequestKey instance = new QueryRequestKey();
        instance.setUuid(uuid.toString());
        assertEquals(requestKey.hashCode(), instance.hashCode());
        instance.setUuid(UUID.randomUUID().toString());
        assertFalse(requestKey.hashCode() == instance.hashCode());
    }

    /**
     * Test of equals method, of class QueryRequestKey.
     */
    @Test
    public void testEqualsWhenEqual() {
        logger.info("testEqualsWhenEqual");
        QueryRequestKey instance = new QueryRequestKey();
        instance.setUuid(uuid.toString());
        boolean expResult = true;
        boolean result = instance.equals(requestKey);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsWhenNotEqual() {
        logger.info("testEqualsWhenNotEqual");
        QueryRequestKey instance = new QueryRequestKey();
        instance.setUuid(UUID.randomUUID().toString());
        boolean expResult = false;
        boolean result = instance.equals(requestKey);
        assertEquals(expResult, result);
    }    
    /**
     * Test of toString method, of class QueryRequestKey.
     */
    @Test
    public void testToString() {
        logger.info("toString");
        assertEquals(uuid.toString(), requestKey.toString());
    }
    
}
