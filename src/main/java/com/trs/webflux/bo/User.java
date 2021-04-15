package com.trs.webflux.bo;

/**
 * @Description
 * @DATE 2021.4.15 16:38
 * @Author yangjie
 **/

public class User {
    private String name;
    private String desc;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
