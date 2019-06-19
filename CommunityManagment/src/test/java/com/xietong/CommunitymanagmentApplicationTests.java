package com.xietong;

import com.xietong.bean.Student;
import com.xietong.service.LecturerService;
import com.xietong.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@MapperScan(value = "com.xietong.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunitymanagmentApplicationTests {

	@Autowired
	private LecturerService lecturerService;
	@Autowired
	private StudentService studentService;

	@Test
	public void contextLoads() {
//		Lecturer lecturer=new Lecturer();
//		lecturer.setId(158);
//		lecturer.setPassword("1234");
//		lecturer.setCommunity("复新星苑");
//		lecturer.setCredits(20);
//		lecturer.setName("马陆");
//		lecturer.setPhone("1356985469");
//		lecturer.setQualified(true);
//		lecturer.setResume("resume/11.jsp");
//		lecturerService.insertLecturer(lecturer);
//		System.out.println(lecturer);

		Student student=new Student();
		student.setId(3526);
		student.setName("将胡黄");
		student.setPassword("85964875");
		student.setPhone("13625974596");
		student.setCredits(20);
		student.setAddress("复新星苑");


	}

}
