/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.dto;

import java.io.Serializable;
import java.util.SortedSet;
import org.mathison.hits.key.QueryRequestKey;

/**
 *
 * @author Daryl
 */
public class SearchAnswer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String query;
    private QueryRequestKey queryId;
    private SortedSet<LinkEntry> items;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public QueryRequestKey getQueryId() {
        return queryId;
    }

    public void setQueryId(QueryRequestKey queryId) {
        this.queryId = queryId;
    }

    public SortedSet<LinkEntry> getItems() {
        return items;
    }

    public void setItems(SortedSet<LinkEntry> items) {
        this.items = items;
    }
    
}
