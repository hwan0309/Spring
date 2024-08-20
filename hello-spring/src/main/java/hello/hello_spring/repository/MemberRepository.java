package hello.hello_spring.repository;

import hello.hello_spring.domain.Member; // 패키지와 클래스 이름 수정

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}