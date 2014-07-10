/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.data;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import org.mathison.hits.dto.SearchAnswer;
import com.hazelcast.core.IAtomicLong;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.DataSerializable;
import java.io.IOException;
import org.mathison.hits.key.QueryRequestKey;

/**
 *
 * @author Daryl
 */
public class QueryRequest implements DataSerializable, HazelcastInstanceAware {
    static final long serialVersionUID = 1L;
    
    private transient HazelcastInstance hInstance;
    
    private QueryRequestKey id = null;
    private String query;
    private int numOfLinksToReturn;
    private boolean started = false;
    private IAtomicLong nodeCount;
    private SearchAnswer answer;
    
    public QueryRequestKey getId() {
        return id;
    }

    public void setId(QueryRequestKey id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public long getNodeCount() {
        return nodeCount.get();
    }

    public void increamentCount() {
        nodeCount.getAndIncrement();
    }
    
    public void decrementCount() {
        nodeCount.decrementAndGet();
    }
    
    public SearchAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(SearchAnswer answer) {
        this.answer = answer;
    }

    public int getNumOfLinksToReturn() {
        return numOfLinksToReturn;
    }

    public void setNumOfLinksToReturn(int numOfLinksToReturn) {
        this.numOfLinksToReturn = numOfLinksToReturn;
    }

    public void setNodeCount(IAtomicLong nodeCount) {
        this.nodeCount = nodeCount;
    }

    @Override
    public void setHazelcastInstance(HazelcastInstance hi) {
        hInstance = hi;
    }

    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        odo.writeObject(id);
        odo.writeUTF(query);
        odo.writeInt(numOfLinksToReturn);
        odo.writeBoolean(started);
        odo.writeUTF(nodeCount.getName());
        odo.writeLong(nodeCount.get());
        odo.writeObject(answer);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        String nodeCountName;
        id = odi.readObject();
        query = odi.readUTF();
        numOfLinksToReturn = odi.readInt();
        started = odi.readBoolean();
        nodeCountName = odi.readUTF();
        nodeCount = hInstance.getAtomicLong(nodeCountName);
        nodeCount.set(odi.readLong());
        answer = odi.readObject();
    }
    
}
