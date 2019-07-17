package com.bridgeit;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks> {

	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {

		StudentMarks studentMarks = new StudentMarks();

		studentMarks.setId(rs.getInt("ID"));
		studentMarks.setName(rs.getString("StudentName"));
		studentMarks.setAge(rs.getInt("AGE"));
		studentMarks.setSid(rs.getInt("SID"));
		studentMarks.setMarks(rs.getInt("MARKS"));
		studentMarks.setYear(rs.getInt("YearofPassing"));
		return studentMarks;
	}

}
