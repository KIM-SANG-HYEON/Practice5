package com.oracle.prac.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl {
	
	@Autowired
	private SqlSession sqlsession;

}
