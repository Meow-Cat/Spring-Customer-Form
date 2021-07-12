package com.phoenix;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.mapping.Environment;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.phoenix.mapper")
@Log4j2
public class CustomerApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(CustomerApplication.class, args);
        log.info("\n..######..##.....##..######...######..########..######...######.\n" +
                ".##....##.##.....##.##....##.##....##.##.......##....##.##....##\n" +
                ".##.......##.....##.##.......##.......##.......##.......##......\n" +
                "..######..##.....##.##.......##.......######....######...######.\n" +
                ".......##.##.....##.##.......##.......##.............##.......##\n" +
                ".##....##.##.....##.##....##.##....##.##.......##....##.##....##\n" +
                "..######...#######...######...######..########..######...######.");
        ConfigurableEnvironment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        if (StringUtils.isEmpty(path)) {
            path = "";
        }
        log.info("\n----------------------------------------------------------\n\t" +
                "Application  is running! Access URLs:\n\t" +
                "Local访问网址: \t\thttp://localhost:" + port + path + "\n\t" +
                "External访问网址: \thttp://" + ip + ":" + port + path + "\n\t" +
                "----------------------------------------------------------");
    }
}
