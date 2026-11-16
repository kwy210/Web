package com.office.ex.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	
	final public static int SIGN_IN_OK = 1;
	final public static int SIGN_IN_NG = 0;

	Map<String, MemberDto> memDB = new HashMap<String, MemberDto>();
	
	public int insertNewMember(MemberDto memberDto) {
		
		memDB.put(memberDto.getMemId(), memberDto);
		
		return memDB.get(memberDto.getMemId()) != null 
				? 
				MemberService.SIGN_IN_OK
				: 
				MemberService.SIGN_IN_NG;
		
	}

	public MemberDto selectMemberByMemIdAndMemPw(String memId) {
	
		System.out.println("memDB.get(memId): " + memDB.get(memId));
		
		return memDB.get(memId);
	}
	
	

}
