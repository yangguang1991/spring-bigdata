package com.example.controller;

import com.example.utils.HBaseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2020/9/24 17:22
 */


@RestController
@RequestMapping("/hbase")
@Slf4j
public class HbaseController {


    @PostMapping("/success")
    public Map<String, Object> test() {
        String str = null;
        try {
            str = HBaseUtils.scanAllRecord("sixmonth");//扫描表
            System.out.println("获取到hbase的内容：" + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hbaseContent", str);
        log.info("map=" + map);
        return map;
    }
}
