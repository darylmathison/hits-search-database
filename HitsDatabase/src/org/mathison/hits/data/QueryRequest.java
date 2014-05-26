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

/**
 *
 * @author Daryl
 */
public class QueryRequest implements DataSerializable, HazelcastInstanceAware {
    static final long serialVersionUID = 1L;
    
    private transient HazelcastInstance hInstance;
    
    private long id = -1;
    private String query;
    private int numOfLinksToReturn;
    private boolean notStarted = false;
    private IAtomicLong nodeCount;
    private SearchAnswer answer;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isNotStarted() {
        return notStarted;
    }

    public void setNotStarted(boolean notStarted) {
        this.notStarted = notStarted;
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

    public void setId(long id) {
        this.id = id;
    }

    public int getNumOfLinksToReturn() {
        return numOfLinksToReturn;
    }

    public void setNumOfLinksReturned(int numOfLinksToReturn) {
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
        odo.writeLong(id);
        odo.writeUTF(query);
        odo.writeInt(numOfLinksToReturn);
        odo.writeBoolean(notStarted);
        odo.writeUTF(nodeCount.getName());
        odo.writeLong(nodeCount.get());
        odo.writeObject(answer);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        String nodeCountName;
        id = odi.readLong();
        query = odi.readUTF();
        numOfLinksToReturn = odi.readInt();
        notStarted = odi.readBoolean();
        nodeCountName = odi.readUTF();
        nodeCount = hInstance.getAtomicLong(nodeCountName);
        nodeCount.set(odi.readLong());
        answer = odi.readObject();
    }
    
}
