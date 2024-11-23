package com.example.addMembersPostgreSQL.service;

import com.example.addMembersPostgreSQL.model.Member;
import com.example.addMembersPostgreSQL.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private MemberRepo mRepo;

    public MemberRepo getmRepo() {
        return mRepo;
    }

    @Autowired
    public void setmRepo(MemberRepo mRepo) {
        this.mRepo = mRepo;
    }

    public void addMember(Member m){
        mRepo.save(m);
    }

    public List<Member> getAllMembers(){
        return mRepo.findAll();
    }
}
