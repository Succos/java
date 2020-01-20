package com.succos.base.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="label")
public class Label implements Serializable {
    @Id
     private String id;
     private String labelname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }
}
