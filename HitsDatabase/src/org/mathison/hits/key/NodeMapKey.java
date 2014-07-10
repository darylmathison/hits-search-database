/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.key;

import com.hazelcast.core.PartitionAware;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.DataSerializable;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author Daryl
 */
public class NodeMapKey implements PartitionAware<String>, DataSerializable {
    //UUID
    private String uuid;
    private String URI;

    public NodeMapKey(String uuid, String URI) {
        this.uuid = uuid;
        this.URI = URI;
    }
    
    public NodeMapKey(String URI) {
        this.uuid = UUID.randomUUID().toString();
        this.URI = URI;
    }
    
    private NodeMapKey() {}  
    
    public String getUuid() {
        return uuid;
    }

    public String getURI() {
        return URI;
    }

    @Override
    public String getPartitionKey() {
        return uuid;
    }

    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        odo.writeUTF(uuid);
        odo.writeUTF(URI);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        uuid = odi.readUTF();
        URI = odi.readUTF();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.uuid);
        hash = 61 * hash + Objects.hashCode(this.URI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodeMapKey other = (NodeMapKey) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.URI, other.URI)) {
            return false;
        }
        return true;
    }
}
