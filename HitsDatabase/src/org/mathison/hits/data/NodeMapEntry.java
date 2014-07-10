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
import org.mathison.hits.key.NodeMapKey;

/**
 *
 * @author Daryl
 */
public class NodeMapEntry implements DataSerializable {
    static final long serialVersionUID = 1L;
    
    private NodeMapKey id = null;
    private String query;
    private String URI;
    private long queryId;
    private float hubScore;
    private float authScore;
    private Set<NodeMapKey> outgoing;
    private Set<NodeMapKey> incoming;

    public NodeMapKey getId() {
        return id;
    }

    public void setId(NodeMapKey id) {
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
    
    public void addOutgoing(NodeMapKey nodeId) {
        outgoing.add(nodeId);
    }
    
    public void addIncoming(NodeMapKey nodeId) {
        incoming.add(nodeId);

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
        odo.writeObject(id);
        odo.writeUTF(query);
        odo.writeUTF(URI);
        odo.writeLong(queryId);
        odo.writeFloat(hubScore);
        odo.writeFloat(authScore);
        odo.writeObject(outgoing);
        odo.writeObject(incoming);
    }
    
    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        id = odi.readObject();
        query = odi.readUTF();
        URI = odi.readUTF();
        queryId = odi.readLong();
        hubScore = odi.readFloat();
        authScore = odi.readFloat();
        outgoing = odi.readObject();
        incoming = odi.readObject();
    }
 }
