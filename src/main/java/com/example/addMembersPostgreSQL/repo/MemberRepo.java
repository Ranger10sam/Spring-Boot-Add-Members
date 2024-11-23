package com.example.addMembersPostgreSQL.repo;

import com.example.addMembersPostgreSQL.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepo {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MemberRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(Member m) {
        String sql = "insert into members values(?, ?, ?)";
        int rows = jdbcTemplate.update(sql, m.getId(), m.getName(), m.getCountry());
        if (rows == 1) {
            System.out.println("Insert Successfully");
        }
    }

    public List<Member> findAll() {
        String sql = "select * from members";
        RowMapper<Member> rowMapper = (rs, rowNum) ->{
            Member m = new Member();
            m.setId(rs.getInt("id"));
            m.setName(rs.getString("name"));
            m.setCountry(rs.getString("country"));
            return m;
        };
        return jdbcTemplate.query(sql, rowMapper);
    }
}
