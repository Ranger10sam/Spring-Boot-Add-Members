package com.example.addMembersPostgreSQL.controllers;

import com.example.addMembersPostgreSQL.model.Member;
import com.example.addMembersPostgreSQL.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    private final MemberService memberService;

    public IndexController(MemberService memberService) {
        this.memberService = memberService;
    }


    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("addMembers")
    public String addMembers(Member member, Model model){
        memberService.addMember(member);
        model.addAttribute("member", member);
        return "success";
    }


}
