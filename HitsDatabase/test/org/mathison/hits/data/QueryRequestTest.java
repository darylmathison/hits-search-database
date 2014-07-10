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
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mathison.hits.dto.LinkEntry;
import org.mathison.hits.dto.SearchAnswer;
import org.mathison.hits.key.QueryRequestKey;
import org.mockito.InOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.mockito.Mockito.*;

/**
 *
 * @author Daryl
 */
public class QueryRequestTest {
    private static final Logger logger = LoggerFactory.getLogger(QueryRequestTest.class);
    
    private static final UUID uuid = UUID.randomUUID();
    private static final String QUERY = "state flower of texas";
    private static final int NUM_OF_LINKS_TO_RETURN = 4;
    private static final LinkEntry[] LINKS = {
        new LinkEntry(1.0f, 2.0f, "http://www.google.com"),
        new LinkEntry(0.001f, .1f, "http://www.yahoo.com"),
        new LinkEntry(2.4f, 2.5f, "http://www.cnn.com"),
        new LinkEntry(3.0f, 3.1f, "http://www.netbeans.org")
    };
    
    private static HazelcastInstance instance;
    private QueryRequest request;
    
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
        request = new QueryRequest();
        request.setId(new QueryRequestKey(uuid.toString()));
        request.setNumOfLinksToReturn(NUM_OF_LINKS_TO_RETURN);
        request.setQuery(QUERY);
        request.setHazelcastInstance(instance);
        IAtomicLong counter = instance.getAtomicLong(request.getId().toString());
        counter.set(0L);
        request.setNodeCount(counter);
        request.setStarted(false);
        request.setAnswer(createSearchAnswer());
    }
    
    @After
    public void tearDown() {
        request = null;
    }


    /**
     * Test of getNodeCount method, of class QueryRequest.
     */
    @Test
    public void testGetNodeCount() {
        logger.info("getNodeCount");
        long expResult = 0L;
        long result = request.getNodeCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of increamentCount method, of class QueryRequest.
     */
    @Test
    public void testIncreamentCount() {
        logger.info("increamentCount");
        request.increamentCount();
        assertEquals(1L, request.getNodeCount());
    }

    /**
     * Test of decrementCount method, of class QueryRequest.
     */
    @Test
    public void testDecrementCount() {
        logger.info("decrementCount");
        request.increamentCount();
        request.decrementCount();
        assertEquals(0L, request.getNodeCount());
    }
    
    /**
     * Test of writeData method, of class QueryRequest.
     */
    @Test
    public void testWriteData() throws Exception {
        logger.info("testWriteData");
        ObjectDataOutput odo = mock(ObjectDataOutput.class);
        request.writeData(odo);
        InOrder inOrder = inOrder(odo);
        inOrder.verify(odo).writeObject(request.getId());
        inOrder.verify(odo).writeUTF(QUERY);
        inOrder.verify(odo).writeInt(request.getNumOfLinksToReturn());
        inOrder.verify(odo).writeBoolean(request.isStarted());
        inOrder.verify(odo).writeUTF(request.getId().toString());
        inOrder.verify(odo).writeLong(request.getNodeCount());
        inOrder.verify(odo).writeObject(request.getAnswer());
    }

    /**
     * Test of readData method, of class QueryRequest.
     */
    @Test
    public void testReadData() throws Exception {
        logger.info("testReadData");
        ObjectDataInput odi = mock(ObjectDataInput.class);
        when(odi.readObject()).thenReturn(request.getId(), request.getAnswer());
        when(odi.readBoolean()).thenReturn(request.isStarted());
        when(odi.readUTF()).thenReturn(request.getQuery(), request.getId().toString());
        when(odi.readLong()).thenReturn(request.getNodeCount());
        when(odi.readInt()).thenReturn(request.getNumOfLinksToReturn());
        
        QueryRequest localRequest = new QueryRequest();
        localRequest.setHazelcastInstance(instance);
        localRequest.readData(odi);
        InOrder inOrder = inOrder(odi);
        inOrder.verify(odi).readObject();
        inOrder.verify(odi).readUTF();
        inOrder.verify(odi).readInt();
        inOrder.verify(odi).readUTF();
        inOrder.verify(odi).readLong();
        inOrder.verify(odi).readObject();
    }
    
    private SearchAnswer createSearchAnswer() {
        SearchAnswer answer = new SearchAnswer();
        answer.setQuery(QUERY);
        answer.setQueryId(new QueryRequestKey(uuid.toString()));
        SortedSet<LinkEntry> links = new TreeSet<>(Arrays.asList(LINKS));
        answer.setItems(links);
        
        return answer;
    }
}
