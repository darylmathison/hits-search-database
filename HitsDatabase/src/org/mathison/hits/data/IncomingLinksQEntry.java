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
import org.mathison.hits.key.QueryRequestKey;

/**
 *
 * @author Daryl
 */
public class IncomingLinksQEntry implements DataSerializable {
    private static final long serialVersionUID = 1L;
    private QueryRequestKey queryId;
    private String query;
    private long nodeId = -1;
    private String URI;

    public QueryRequestKey getQueryId() {
        return queryId;
    }

    public void setQueryId(QueryRequestKey queryId) {
        this.queryId = queryId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        odo.writeObject(queryId);
        odo.writeUTF(query);
        odo.writeLong(nodeId);
        odo.writeUTF(URI);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        queryId = odi.readObject();
        query = odi.readUTF();
        nodeId = odi.readLong();
        URI = odi.readUTF();
    }
    
}
