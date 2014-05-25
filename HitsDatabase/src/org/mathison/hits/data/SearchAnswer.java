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
import java.util.SortedSet;

/**
 *
 * @author Daryl
 */
public class SearchAnswer implements DataSerializable {
    private static final long serialVersionUID = 1L;
    
    private String query;
    private Long queryId;
    private SortedSet<MapNode> items;

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

    public SortedSet<MapNode> getItems() {
        return items;
    }

    public void setItems(SortedSet<MapNode> items) {
        this.items = items;
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
