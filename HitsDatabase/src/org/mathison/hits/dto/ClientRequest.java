/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.dto;

import java.io.Serializable;

/**
 *
 * @author Daryl
 */
public class ClientRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String query;
    private int numOfLinksReturned;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getNumOfLinksReturned() {
        return numOfLinksReturned;
    }

    public void setNumOfLinksReturned(int numOfLinksReturned) {
        this.numOfLinksReturned = numOfLinksReturned;
    }
    
}
