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
import java.util.Collection;
import java.util.HashSet;
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
    private long queryId;
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
        odo.writeLong(id);
        odo.writeUTF(query);
        odo.writeUTF(URI);
        odo.writeLong(queryId);
        odo.writeFloat(hubScore);
        odo.writeFloat(authScore);
        writeCollection(odo, outgoing);
        writeCollection(odo, incoming);
    }

    private void writeCollection(ObjectDataOutput odo, Collection<Long> collection)
        throws IOException {
        
        long[] array = new long[collection.size()];
        int i = 0;
        for (long entry: collection) {
            array[i] = entry;
            i++;
        }
        odo.writeLongArray(array);
    }
    
    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        id = odi.readLong();
        query = odi.readUTF();
        URI = odi.readUTF();
        queryId = odi.readLong();
        hubScore = odi.readFloat();
        authScore = odi.readFloat();
        outgoing = readSet(odi);
        incoming = readSet(odi);
    }
    
    private Set<Long> readSet(ObjectDataInput odi) throws IOException {
        Set<Long> retSet = null;
        long[] array = odi.readLongArray();
        retSet = new HashSet<>(array.length);
        for( int i = 0; i < array.length; i++) {
            retSet.add(array[i]);
        }
        return retSet;
    }
 }
