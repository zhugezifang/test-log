package com.vince.xq.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogMain {
    private static final Logger log = LoggerFactory.getLogger(LogMain.class);

    public static void main(String[] args) {
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.info("start:{}", "info");
    }
}
