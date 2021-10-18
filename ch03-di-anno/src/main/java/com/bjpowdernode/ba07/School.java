package com.bjpowdernode.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author gjd
 * @create 2021/10/3  10:28:19
 */
@Component
public class School {

    @Value("新乡学院")
    private String name;
    @Value("新乡市")
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
