package com.example.addMembersPostgreSQL.controllers;

import com.example.addMembersPostgreSQL.model.Member;
import com.example.addMembersPostgreSQL.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MembersController {

    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("viewAll")
    public String viewAll(Model model){
        List<Member> memberList = memberService.getAllMembers();
        model.addAttribute("members", memberList);
        System.out.println(memberList);
        return "members";
    }
}
