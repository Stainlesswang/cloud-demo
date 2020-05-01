package com.allen.consumer.command;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * @author AllenWong
 * @date 2019/10/9 8:24 PM
 */
public class DemoCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;
    private long id;
    public DemoCommand(Setter setter, RestTemplate restTemplate, long id) {
        super(setter);
        this.id=id;
        this.restTemplate=restTemplate;
    }
    public DemoCommand( RestTemplate restTemplate, long id) {
        super(String::new);
        this.id=id;
        this.restTemplate=restTemplate;
    }

    @Override
    protected String run() throws Exception {
        String PROVIDE_ADDRESS = "HTTP://provider/";
        return restTemplate.getForObject(PROVIDE_ADDRESS +"provider",String.class);
    }

    @Override
    protected String getFallback() {
        return "fuck";
    }
}
