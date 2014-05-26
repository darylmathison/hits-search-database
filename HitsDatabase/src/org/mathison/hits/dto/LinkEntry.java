/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mathison.hits.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Daryl
 */
public class LinkEntry implements Serializable, Comparable<LinkEntry> {
    private static final long serialVersionUID = 1L;
    
    private float authScore;
    private float hubScore;
    private String URI;

    public float getAuthScore() {
        return authScore;
    }

    public void setAuthScore(float authScore) {
        this.authScore = authScore;
    }

    public float getHubScore() {
        return hubScore;
    }

    public void setHubScore(float hubScore) {
        this.hubScore = hubScore;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    @Override
    public int compareTo(LinkEntry o) {
        int i = 0;
        float diff = 0;
        diff = this.authScore - o.authScore;
        if(diff == 0) {
           diff = this.hubScore - o.hubScore;
           if(diff == 0) {
               i = this.URI.compareTo(o.URI);
           } else {
               if (diff > 0) {
                   i = 1;
               } else {
                   i = -1;
               }
           }
        } else {
            if (diff > 0) {
                i = 1;
            } else {
                i = -1;
            }
        }
        return i;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Float.floatToIntBits(this.authScore);
        hash = 71 * hash + Float.floatToIntBits(this.hubScore);
        hash = 71 * hash + Objects.hashCode(this.URI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof LinkEntry) {
            return this.compareTo((LinkEntry)obj) == 0;
        }
        return false;
    }
}
