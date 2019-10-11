package com.allen.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AllenWong
 * @date 2019/10/7 5:37 PM
 */
@RestController
public class ProviderController {
    Logger logger=LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping("/provider")
    public String provider() throws InterruptedException {
        logger.info("请求到新接口!");
        return "This is Provider!";
    }

    @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        logger.info("hello My Dear!");
        return "This is Provider!";
    }
}
