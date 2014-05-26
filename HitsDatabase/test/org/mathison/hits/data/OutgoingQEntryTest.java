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
public class OutgoingQEntryTest {
    
    public OutgoingQEntryTest() {
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
     * Test of getQuery method, of class OutgoingQEntry.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        OutgoingQEntry instance = null;
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuery method, of class OutgoingQEntry.
     */
    @Test
    public void testSetQuery() {
        System.out.println("setQuery");
        String query = "";
        OutgoingQEntry instance = null;
        instance.setQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueryId method, of class OutgoingQEntry.
     */
    @Test
    public void testGetQueryId() {
        System.out.println("getQueryId");
        OutgoingQEntry instance = null;
        long expResult = 0L;
        long result = instance.getQueryId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQueryId method, of class OutgoingQEntry.
     */
    @Test
    public void testSetQueryId() {
        System.out.println("setQueryId");
        long queryId = 0L;
        OutgoingQEntry instance = null;
        instance.setQueryId(queryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeId method, of class OutgoingQEntry.
     */
    @Test
    public void testGetNodeId() {
        System.out.println("getNodeId");
        OutgoingQEntry instance = null;
        long expResult = 0L;
        long result = instance.getNodeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodeId method, of class OutgoingQEntry.
     */
    @Test
    public void testSetNodeId() {
        System.out.println("setNodeId");
        long nodeId = 0L;
        OutgoingQEntry instance = null;
        instance.setNodeId(nodeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getURI method, of class OutgoingQEntry.
     */
    @Test
    public void testGetURI() {
        System.out.println("getURI");
        OutgoingQEntry instance = null;
        String expResult = "";
        String result = instance.getURI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setURI method, of class OutgoingQEntry.
     */
    @Test
    public void testSetURI() {
        System.out.println("setURI");
        String URI = "";
        OutgoingQEntry instance = null;
        instance.setURI(URI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class OutgoingQEntry.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        OutgoingQEntry instance = null;
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLevel method, of class OutgoingQEntry.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 0;
        OutgoingQEntry instance = null;
        instance.setLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxLevel method, of class OutgoingQEntry.
     */
    @Test
    public void testGetMaxLevel() {
        System.out.println("getMaxLevel");
        OutgoingQEntry instance = null;
        int expResult = 0;
        int result = instance.getMaxLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class OutgoingQEntry.
     */
    @Test
    public void testWriteData() throws Exception {
        System.out.println("writeData");
        ObjectDataOutput odo = null;
        OutgoingQEntry instance = null;
        instance.writeData(odo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class OutgoingQEntry.
     */
    @Test
    public void testReadData() throws Exception {
        System.out.println("readData");
        ObjectDataInput odi = null;
        OutgoingQEntry instance = null;
        instance.readData(odi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
