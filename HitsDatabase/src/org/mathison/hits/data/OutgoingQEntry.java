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

/**
 *
 * @author Daryl
 */
public class OutgoingQEntry implements DataSerializable {
    private static final long serialVersionUID = 1L;
    
    private String query;
    private long queryId;
    private long nodeId = -1;
    private String URI;
    private int level;
    private int maxLevel;
    
    private OutgoingQEntry() {}
    
    public OutgoingQEntry(int maxLevel) {
        this.maxLevel = maxLevel;
    }
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
    
    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        odo.writeUTF(query);
        odo.writeLong(queryId);
        odo.writeLong(nodeId);
        odo.writeUTF(URI);
        odo.writeInt(level);
        odo.writeInt(maxLevel);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        query = odi.readUTF();
        queryId = odi.readLong();
        nodeId = odi.readLong();
        URI = odi.readUTF();
        level = odi.readInt();
        maxLevel = odi.readInt();    }
}
