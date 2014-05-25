/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.data;

import com.hazelcast.core.IAtomicLong;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.DataSerializable;
import java.io.IOException;

/**
 *
 * @author Daryl
 */
public class QueryRequest implements DataSerializable {
    static final long serialVersionUID = 1L;
    
    private long id = -1;
    private String query;
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

    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
