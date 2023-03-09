package com.example.webspringboot;

import com.example.webspringboot.aop.TimeTraceAop;
import com.example.webspringboot.repository.JpaMemberRepository;
import com.example.webspringboot.repository.MemberRepository;
import com.example.webspringboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.swing.*;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//
//        return new JpaMemberRepository(em);
//    }
}
