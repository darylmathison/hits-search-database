/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.data;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daryl
 */
public class IncomingQEntryTest {
    
    public IncomingQEntryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQueryId method, of class IncomingQEntry.
     */
    @Test
    public void testGetQueryId() {
        System.out.println("getQueryId");
        IncomingQEntry instance = new IncomingQEntry();
        long expResult = 0L;
        long result = instance.getQueryId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQueryId method, of class IncomingQEntry.
     */
    @Test
    public void testSetQueryId() {
        System.out.println("setQueryId");
        long queryId = 0L;
        IncomingQEntry instance = new IncomingQEntry();
        instance.setQueryId(queryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuery method, of class IncomingQEntry.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        IncomingQEntry instance = new IncomingQEntry();
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuery method, of class IncomingQEntry.
     */
    @Test
    public void testSetQuery() {
        System.out.println("setQuery");
        String query = "";
        IncomingQEntry instance = new IncomingQEntry();
        instance.setQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeId method, of class IncomingQEntry.
     */
    @Test
    public void testGetNodeId() {
        System.out.println("getNodeId");
        IncomingQEntry instance = new IncomingQEntry();
        long expResult = 0L;
        long result = instance.getNodeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodeId method, of class IncomingQEntry.
     */
    @Test
    public void testSetNodeId() {
        System.out.println("setNodeId");
        long nodeId = 0L;
        IncomingQEntry instance = new IncomingQEntry();
        instance.setNodeId(nodeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getURI method, of class IncomingQEntry.
     */
    @Test
    public void testGetURI() {
        System.out.println("getURI");
        IncomingQEntry instance = new IncomingQEntry();
        String expResult = "";
        String result = instance.getURI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setURI method, of class IncomingQEntry.
     */
    @Test
    public void testSetURI() {
        System.out.println("setURI");
        String URI = "";
        IncomingQEntry instance = new IncomingQEntry();
        instance.setURI(URI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class IncomingQEntry.
     */
    @Test
    public void testWriteData() throws Exception {
        System.out.println("writeData");
        ObjectDataOutput odo = null;
        IncomingQEntry instance = new IncomingQEntry();
        instance.writeData(odo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class IncomingQEntry.
     */
    @Test
    public void testReadData() throws Exception {
        System.out.println("readData");
        ObjectDataInput odi = null;
        IncomingQEntry instance = new IncomingQEntry();
        instance.readData(odi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
