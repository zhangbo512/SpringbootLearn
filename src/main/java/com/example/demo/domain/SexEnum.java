package com.example.demo.domain;

/**
 * 性别枚举
 */
public enum SexEnum {

    /**
     * 男
     */
    MALE(1,"男"),
    /**
     * 女
     */
    FEMALE(2,"女");

    /**
     *  标识
     */
    private final Integer index;
    /**
     * 名称
     */
    private final String name;

    SexEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public SexEnum getEnumById(Integer id) {
        for(SexEnum se : SexEnum.values()) {
            if(se.getIndex().equals(id)) {
                return se;
            }
        }
        return null;
    }
}
