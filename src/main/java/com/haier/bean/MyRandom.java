package com.haier.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Admin on 2017/12/16.
 * @author  ycm
 */
@ConfigurationProperties(prefix = "my")
public class MyRandom {

    /**
     *   my.secret=${random.value}
         my.number=${random.int}
         my.bignumber=${random.long}
         my.uuid=${random.uuid}
         my.lessThanTenNumber=${random.int(10)}
         my.inRangeNumber=${random.int[1024,65536]}
     */
    private String secret;
    private int number;
    private long bignumber;
    private String uuid;
    private int lessThanTenNumber;
    private int inRangeNumber;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getLessThanTenNumber() {
        return lessThanTenNumber;
    }

    public void setLessThanTenNumber(int lessThanTenNumber) {
        this.lessThanTenNumber = lessThanTenNumber;
    }

    public int getInRangeNumber() {
        return inRangeNumber;
    }

    public void setInRangeNumber(int inRangeNumber) {
        this.inRangeNumber = inRangeNumber;
    }

    @Override
    public String toString() {
        return "MyRandom{" +
                "secret='" + secret + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", uuid='" + uuid + '\'' +
                ", lessThanTenNumber=" + lessThanTenNumber +
                ", inRangeNumber=" + inRangeNumber +
                '}';
    }
}
