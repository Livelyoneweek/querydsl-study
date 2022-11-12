package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MemberDto {
    private String username;
    private int age;
    public MemberDto() {
    }
    @QueryProjection //compileQuerydsl 하면 이 Dto도 QMemberDto로 생성됌, 쿼리프로젝션에 사용
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
