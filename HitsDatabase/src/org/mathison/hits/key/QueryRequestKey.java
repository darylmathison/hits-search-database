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

/**
 *
 * @author Daryl
 */
public class QueryRequestKey implements DataSerializable, PartitionAware<String> {
    private String uuid;

    public QueryRequestKey() {}
    
    public QueryRequestKey(String uuid) {
        this.uuid = uuid;
    }
    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void writeData(ObjectDataOutput odo) throws IOException {
        odo.writeUTF(uuid);
    }

    @Override
    public void readData(ObjectDataInput odi) throws IOException {
        uuid = odi.readUTF();
    }

    @Override
    public String getPartitionKey() {
        return uuid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.uuid);
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
        final QueryRequestKey other = (QueryRequestKey) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return uuid;
    }
}
