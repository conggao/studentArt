package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "sms_verification_type", schema = "master", catalog = "master")
public class SmsVerificationType {
    private int id;
    private String decription;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "decription")
    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsVerificationType that = (SmsVerificationType) o;

        if (id != that.id) return false;
        if (decription != null ? !decription.equals(that.decription) : that.decription != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (decription != null ? decription.hashCode() : 0);
        return result;
    }
}
