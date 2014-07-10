/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.key;

import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.ObjectDataInput;
import static org.mockito.Mockito.*;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Daryl
 */
public class NodeMapKeyTest {
    
    static final Logger logger = LoggerFactory.getLogger(NodeMapKeyTest.class);
    static final UUID uuid = UUID.randomUUID();
    static final String URI = "http://darylmathison.wordpress.com";
    
    private NodeMapKey key = null;
    
    public NodeMapKeyTest() {
    }
    
    @Before
    public void setUp() {
        key = new NodeMapKey(uuid.toString(), URI);
    }
    
    @After
    public void tearDown() {
        key = null;
    }

    @Test
    public void testUUIDAndURIConstructor() {
        logger.info("testUUIDAndURIConstructor");
        String id = UUID.randomUUID().toString();
        String URI = "http://www.somewhere.com";
        NodeMapKey key = new NodeMapKey(id, URI);
        assertEquals("uuids are not equal", id, key.getUuid());
        assertEquals("URIs are not equal", URI, key.getURI());
    }
    
    @Test
    public void testURIConstructor() {
        logger.info("testURIConstructor");
        String URI = "http://darylmathison.wordpress.com";
        NodeMapKey key = new NodeMapKey(URI);
        assertEquals("URIs are not equals", URI, key.getURI());
    }
    
    /**
     * Test of getPartitionKey method, of class NodeMapKey.
     */
    @Test
    public void testGetPartitionKey() {
        logger.info("testGetPartitionKey");
        assertEquals("PartitionKey is not uuid", uuid.toString(), key.getUuid());
    }

    /**
     * Test of writeData method, of class NodeMapKey.
     */
    @Test
    public void testWriteData() throws Exception {
        ObjectDataOutput output = mock(ObjectDataOutput.class);
        key.writeData(output);
        InOrder inOrder = inOrder(output);
        inOrder.verify(output).writeUTF(uuid.toString());
        inOrder.verify(output).writeUTF(URI);
    }

    /**
     * Test of readData method, of class NodeMapKey.
     */
    @Test
    public void testReadData() throws Exception {
        ObjectDataInput input = mock(ObjectDataInput.class);
        key.readData(input);
        verify(input, times(2)).readUTF();
    }

    //I decided not to test hashCode because it is variable and it really 
    //needs to be tested with equals.
    
    /**
     * Test of equals method, of class NodeMapKey.
     */
    @Test
    public void testEquals() {
        NodeMapKey test = new NodeMapKey(uuid.toString(), URI);
        assertTrue(key.equals(test));
    }
    
    /** 
     * Tests the contract of HashCode and Equals
     */
    @Test
    public void testHashCodeAndEquals() {
        NodeMapKey test = new NodeMapKey(uuid.toString(), URI);
        assertTrue(key.equals(test));
        assertEquals(key.hashCode(), test.hashCode());
        NodeMapKey test2 = new NodeMapKey(UUID.randomUUID().toString(), URI);
        assertFalse(key.equals(test2));
        assertFalse(key.hashCode() == test2.hashCode());
    }
}
