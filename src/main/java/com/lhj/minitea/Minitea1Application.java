package com.lhj.minitea;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import lombok.extern.slf4j.Slf4j;

@ServletComponentScan
@SpringBootApplication
@MapperScan(basePackages = {"com.lhj.minitea.mapper"})
@Slf4j
public class Minitea1Application {

	public static void main(String[] args) {
		SpringApplication.run(Minitea1Application.class, args);
		log.info("服务启动");
	}

}
