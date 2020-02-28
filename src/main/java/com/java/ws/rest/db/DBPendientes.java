package com.java.ws.rest.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pendientes")
public class DBPendientes implements Serializable
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPendient")
    private Integer idPendient;
 
    @Column(name = "title")
    private String title;
 
    @Column(name = "context")
    private String context;
 
    private static final long serialVersionUID = -5290198995172316155L;
 
    public Integer getIdPendient() {
        return idPendient;
    }
 
    public void setIdPendient(Integer idPendient) {
        this.idPendient = idPendient;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getContext() {
        return context;
    }
 
    public void setPassword(String context) {
        this.context = context;
    }
 
    @Override
    public String toString() {
        return "User [idPendient=" + idPendient + ", title=" + title + "]";
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPendient == null) ? 0 : idPendient.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DBPendientes other = (DBPendientes) obj;
        if (idPendient == null) {
            if (other.idPendient != null)
                return false;
        } else if (!idPendient.equals(other.idPendient))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}
