package com.gura.spring03.member.dao;

import java.util.List;

import com.gura.spring03.member.dto.MemberDto;

public interface MemberDao {
	
	public List<MemberDto> getList();
	public void delete(int num);
	
}
