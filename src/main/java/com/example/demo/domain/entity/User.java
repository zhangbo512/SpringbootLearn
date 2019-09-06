package com.example.demo.domain.entity;

import com.example.demo.domain.SexEnum;
import lombok.Builder;
import lombok.Data;


/**
 * <p>
 * description
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */

@Data
@Builder
public class User {

    private Integer id;
    private String name;
    private String note;
    private SexEnum sex;
}
