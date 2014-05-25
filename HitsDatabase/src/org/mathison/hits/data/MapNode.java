/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.data;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.DataSerializable;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @author Daryl
 */
public class MapNode implements DataSerializable {
    static final long serialVersionUID = 1L;
    
    private long id = -1;
    private String query;
    private String URI;
    private Long queryId;
    private float hubScore;
    private float authScore;
    private Set<Long> outgoing;
    private Set<Long> incoming;

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

    public Long getQueryId() {
        return queryId;
    }

    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }
    
    public void addOutgoing(Long nodeId) {
        if(!outgoing.contains(nodeId)) {
            outgoing.add(nodeId);
        }
    }
    
    public void addIncoming(Long nodeId) {
        if(!incoming.contains(nodeId)) {
            incoming.add(nodeId);
        }
    }

    public float getHubScore() {
        return hubScore;
    }

    public void setHubScore(float hubScore) {
        this.hubScore = hubScore;
    }

    public float getAuthScore() {
        return authScore;
    }

    public void setAuthScore(float authScore) {
        this.authScore = authScore;
    }
    
    public String getURI() {
        return URI;
    }
    
    public void setURI(String uri) {
        URI = uri;
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
