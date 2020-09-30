package com.example.controller.service.impl;

import com.example.controller.service.HbaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2020/9/25 16:41
 */
@Service
@Slf4j
public class HbaseServiceImpl implements HbaseService {
    @Override
    public String success() {
        log.info("321321");
        return null;
    }
}
