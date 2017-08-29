package cn.likole.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by likole on 8/29/17.
 */
@Entity
public class Info {
    private String id;
    private String name;
    private Byte gender;
    private String bj;
    private String zy;
    private String idcard;

    @Basic
    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender")
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "bj")
    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    @Basic
    @Column(name = "zy")
    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Info info = (Info) o;

        if (id != null ? !id.equals(info.id) : info.id != null) return false;
        if (name != null ? !name.equals(info.name) : info.name != null) return false;
        if (gender != null ? !gender.equals(info.gender) : info.gender != null) return false;
        if (bj != null ? !bj.equals(info.bj) : info.bj != null) return false;
        if (zy != null ? !zy.equals(info.zy) : info.zy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (bj != null ? bj.hashCode() : 0);
        result = 31 * result + (zy != null ? zy.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "idcard")
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
