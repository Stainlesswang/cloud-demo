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
    public String index() throws InterruptedException {
        logger.info("请求到新接口!");
        Thread.sleep(3000);
        return "This is Provider!";
    }
}
