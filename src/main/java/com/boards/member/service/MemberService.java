package com.boards.member.service;

import com.boards.member.dto.MemberDTO;
import com.boards.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // repository의 save메서드 호출 ( 조건. entity객체를 넘겨줘야 함)

    }
}
