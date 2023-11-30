package com.continuousQR.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@RedisHash(value = "")
public class Qrcode {

    @Id
    private String tid;             //고유번호
    private String cnt;             //연속카운트
    private String hold_time;       //유지시간

}
