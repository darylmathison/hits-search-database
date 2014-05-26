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
public class MapNodeTest {
    
    public MapNodeTest() {
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
     * Test of getId method, of class MapNode.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MapNode instance = new MapNode();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class MapNode.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        MapNode instance = new MapNode();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuery method, of class MapNode.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        MapNode instance = new MapNode();
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuery method, of class MapNode.
     */
    @Test
    public void testSetQuery() {
        System.out.println("setQuery");
        String query = "";
        MapNode instance = new MapNode();
        instance.setQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueryId method, of class MapNode.
     */
    @Test
    public void testGetQueryId() {
        System.out.println("getQueryId");
        MapNode instance = new MapNode();
        Long expResult = null;
        Long result = instance.getQueryId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQueryId method, of class MapNode.
     */
    @Test
    public void testSetQueryId() {
        System.out.println("setQueryId");
        Long queryId = null;
        MapNode instance = new MapNode();
        instance.setQueryId(queryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOutgoing method, of class MapNode.
     */
    @Test
    public void testAddOutgoing() {
        System.out.println("addOutgoing");
        Long nodeId = null;
        MapNode instance = new MapNode();
        instance.addOutgoing(nodeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addIncoming method, of class MapNode.
     */
    @Test
    public void testAddIncoming() {
        System.out.println("addIncoming");
        Long nodeId = null;
        MapNode instance = new MapNode();
        instance.addIncoming(nodeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHubScore method, of class MapNode.
     */
    @Test
    public void testGetHubScore() {
        System.out.println("getHubScore");
        MapNode instance = new MapNode();
        float expResult = 0.0F;
        float result = instance.getHubScore();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHubScore method, of class MapNode.
     */
    @Test
    public void testSetHubScore() {
        System.out.println("setHubScore");
        float hubScore = 0.0F;
        MapNode instance = new MapNode();
        instance.setHubScore(hubScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthScore method, of class MapNode.
     */
    @Test
    public void testGetAuthScore() {
        System.out.println("getAuthScore");
        MapNode instance = new MapNode();
        float expResult = 0.0F;
        float result = instance.getAuthScore();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthScore method, of class MapNode.
     */
    @Test
    public void testSetAuthScore() {
        System.out.println("setAuthScore");
        float authScore = 0.0F;
        MapNode instance = new MapNode();
        instance.setAuthScore(authScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getURI method, of class MapNode.
     */
    @Test
    public void testGetURI() {
        System.out.println("getURI");
        MapNode instance = new MapNode();
        String expResult = "";
        String result = instance.getURI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setURI method, of class MapNode.
     */
    @Test
    public void testSetURI() {
        System.out.println("setURI");
        String uri = "";
        MapNode instance = new MapNode();
        instance.setURI(uri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class MapNode.
     */
    @Test
    public void testWriteData() throws Exception {
        System.out.println("writeData");
        ObjectDataOutput odo = null;
        MapNode instance = new MapNode();
        instance.writeData(odo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class MapNode.
     */
    @Test
    public void testReadData() throws Exception {
        System.out.println("readData");
        ObjectDataInput odi = null;
        MapNode instance = new MapNode();
        instance.readData(odi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
