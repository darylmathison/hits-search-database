/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.data;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IAtomicLong;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mathison.hits.dto.SearchAnswer;

/**
 *
 * @author Daryl
 */
public class QueryRequestTest {
    
    private static HazelcastInstance instance;
    public QueryRequestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = Hazelcast.newHazelcastInstance();
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance.shutdown();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class QueryRequest.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        QueryRequest instance = new QueryRequest();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class QueryRequest.
     */
    @Test
    public void testSetId_Long() {
        System.out.println("setId");
        Long id = null;
        QueryRequest instance = new QueryRequest();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuery method, of class QueryRequest.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        QueryRequest instance = new QueryRequest();
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuery method, of class QueryRequest.
     */
    @Test
    public void testSetQuery() {
        System.out.println("setQuery");
        String query = "";
        QueryRequest instance = new QueryRequest();
        instance.setQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotStarted method, of class QueryRequest.
     */
    @Test
    public void testIsNotStarted() {
        System.out.println("isNotStarted");
        QueryRequest instance = new QueryRequest();
        boolean expResult = false;
        boolean result = instance.isNotStarted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotStarted method, of class QueryRequest.
     */
    @Test
    public void testSetNotStarted() {
        System.out.println("setNotStarted");
        boolean notStarted = false;
        QueryRequest instance = new QueryRequest();
        instance.setNotStarted(notStarted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeCount method, of class QueryRequest.
     */
    @Test
    public void testGetNodeCount() {
        System.out.println("getNodeCount");
        QueryRequest instance = new QueryRequest();
        long expResult = 0L;
        long result = instance.getNodeCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increamentCount method, of class QueryRequest.
     */
    @Test
    public void testIncreamentCount() {
        System.out.println("increamentCount");
        QueryRequest instance = new QueryRequest();
        instance.increamentCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementCount method, of class QueryRequest.
     */
    @Test
    public void testDecrementCount() {
        System.out.println("decrementCount");
        QueryRequest instance = new QueryRequest();
        instance.decrementCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class QueryRequest.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        QueryRequest instance = new QueryRequest();
        SearchAnswer expResult = null;
        SearchAnswer result = instance.getAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer method, of class QueryRequest.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        SearchAnswer answer = null;
        QueryRequest instance = new QueryRequest();
        instance.setAnswer(answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class QueryRequest.
     */
    @Test
    public void testSetId_long() {
        System.out.println("setId");
        long id = 0L;
        QueryRequest instance = new QueryRequest();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfLinksToReturn method, of class QueryRequest.
     */
    @Test
    public void testGetNumOfLinksToReturn() {
        System.out.println("getNumOfLinksToReturn");
        QueryRequest instance = new QueryRequest();
        int expResult = 0;
        int result = instance.getNumOfLinksToReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfLinksReturned method, of class QueryRequest.
     */
    @Test
    public void testSetNumOfLinksReturned() {
        System.out.println("setNumOfLinksReturned");
        int numOfLinksToReturn = 0;
        QueryRequest instance = new QueryRequest();
        instance.setNumOfLinksReturned(numOfLinksToReturn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodeCount method, of class QueryRequest.
     */
    @Test
    public void testSetNodeCount() {
        System.out.println("setNodeCount");
        IAtomicLong nodeCount = null;
        QueryRequest instance = new QueryRequest();
        instance.setNodeCount(nodeCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHazelcastInstance method, of class QueryRequest.
     */
    @Test
    public void testSetHazelcastInstance() {
        System.out.println("setHazelcastInstance");
        HazelcastInstance hi = null;
        QueryRequest instance = new QueryRequest();
        instance.setHazelcastInstance(hi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class QueryRequest.
     */
    @Test
    public void testWriteData() throws Exception {
        System.out.println("writeData");
        ObjectDataOutput odo = null;
        QueryRequest instance = new QueryRequest();
        instance.writeData(odo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class QueryRequest.
     */
    @Test
    public void testReadData() throws Exception {
        System.out.println("readData");
        ObjectDataInput odi = null;
        QueryRequest instance = new QueryRequest();
        instance.readData(odi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
