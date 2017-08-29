package cn.likole.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by likole on 8/28/17.
 */
@Entity
public class Member {
    private int mid;
    private String sid;
    private int gid;
    private String password;
    private String description;

    @OneToMany(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    private List<Picture> pictures;

    @Id
    @Column(name = "mid")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (mid != member.mid) return false;
        if (gid != member.gid) return false;
        if (sid != null ? !sid.equals(member.sid) : member.sid != null) return false;
        if (password != null ? !password.equals(member.password) : member.password != null) return false;
        if (description != null ? !description.equals(member.description) : member.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + gid;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
