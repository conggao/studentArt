package com.gk.entity.master;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_login_record", schema = "master", catalog = "master")
public class UserLoginRecord {
    private long id;
    private long userId;
    private Timestamp loginTime;
    private String loginIp;
    private Byte loginClient;
    private String loginVersion;
    private String machineName;
    private String machineVersion;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "loginTime")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "loginIP")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "loginClient")
    public Byte getLoginClient() {
        return loginClient;
    }

    public void setLoginClient(Byte loginClient) {
        this.loginClient = loginClient;
    }

    @Basic
    @Column(name = "loginVersion")
    public String getLoginVersion() {
        return loginVersion;
    }

    public void setLoginVersion(String loginVersion) {
        this.loginVersion = loginVersion;
    }

    @Basic
    @Column(name = "machineName")
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Basic
    @Column(name = "machineVersion")
    public String getMachineVersion() {
        return machineVersion;
    }

    public void setMachineVersion(String machineVersion) {
        this.machineVersion = machineVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLoginRecord that = (UserLoginRecord) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;
        if (loginClient != null ? !loginClient.equals(that.loginClient) : that.loginClient != null) return false;
        if (loginVersion != null ? !loginVersion.equals(that.loginVersion) : that.loginVersion != null) return false;
        if (machineName != null ? !machineName.equals(that.machineName) : that.machineName != null) return false;
        if (machineVersion != null ? !machineVersion.equals(that.machineVersion) : that.machineVersion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (loginClient != null ? loginClient.hashCode() : 0);
        result = 31 * result + (loginVersion != null ? loginVersion.hashCode() : 0);
        result = 31 * result + (machineName != null ? machineName.hashCode() : 0);
        result = 31 * result + (machineVersion != null ? machineVersion.hashCode() : 0);
        return result;
    }
}
