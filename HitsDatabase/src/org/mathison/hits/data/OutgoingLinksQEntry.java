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
public class OutgoingLinksQEntry implements DataSerializable {
    private static final long serialVersionUID = 1L;
    
    private QueryRequestKey query;
    private long queryId;
    private long nodeMapEntryKey = -1;
    private String URI;
    private int level;
    private int maxLevel;
    
    private OutgoingLinksQEntry() {}
    
    public OutgoingLinksQEntry(int maxLevel) {
        this.maxLevel = maxLevel;
    }
    
    public QueryRequestKey getQuery() {
        return query;
    }

    public void setQuery(QueryRequestKey query) {
        this.query = query;
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    public long getNodeId() {
        return nodeMapEntryKey;
    }

    public void setNodeId(long nodeId) {
        this.nodeMapEntryKey = nodeId;
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
        odo.writeObject(query);
        odo.writeLong(queryId);
        odo.writeLong(nodeMapEntryKey);
        odo.writeUTF(URI);
        odo.writeInt(level);
        odo.writeInt(maxLevel);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        query = odi.readObject();
        queryId = odi.readLong();
        nodeMapEntryKey = odi.readLong();
        URI = odi.readUTF();
        level = odi.readInt();
        maxLevel = odi.readInt();    }
}
