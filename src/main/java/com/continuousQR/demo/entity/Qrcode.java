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
    private String tid;             //transaction_ID
    private int total_cnt;
    private int current_cnt;
    private String hold_time;

    public Qrcode(String tid){
        this.tid = tid;
//        this.total_cnt = total_cnt;
//        this.current_cnt = current_cnt+1;
//        this.hold_time = hold_time;
    }
}
