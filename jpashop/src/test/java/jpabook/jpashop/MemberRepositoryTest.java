package jpabook.jpashop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
@SpringBootTest
class MemberRepositoryTest {

    //@Autowired MemberRepository memberRepository;
    /*@Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember=  memberRepository.find(saveId);

        //then
        assertThat(findMember.getId(),is(equalTo(member.getId())));
        assertThat(findMember.getUsername(),is(equalTo(member.getUsername())));
        // findMember == member 는 true이다. 같은 영속성 content안에선 같은 entity로 인식
    }*/



}