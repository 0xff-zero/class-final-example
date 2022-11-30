package org.example;



import fit.ome.IService;
import fit.ome.RealSrv;
import fit.ome.Service1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SpringApplication.run(App.class);
    }
    @Bean
    public Service1 srv1(){
        return new Service1();
    }
    @Bean
    public IService srv2(){
        return new RealSrv();
    }
    @RestController
    @RequestMapping
    static class InnerController{
        @Resource
        Service1 srv1;
        @Resource
        IService srv2;
        @GetMapping("srv1")
        public String srv1(){
            return srv1.srvName();
        }
        @GetMapping("srv2")
        public String srv2(){
            return srv2.realName();
        }
    }
}
