package com.xietong.dao;

import com.xietong.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 学员持久层接口
 * Created by hxq on 2019/5/29.
 */
//@Repository
public interface StudentDao {
    /**
     * 查找所有的学员
     * @return 学员信息的集合
     */
    @Select("select * from student")
    public List<Student> findAllStudents();

    /**
     * 通过学员的id查找学员的积分
     * @param id 学员
     * @return 积分
     */
    @Select("select credits from student where id=#{id}")
    public int findCreditsById(int id);

    /**
     * 通过id和password查找一个学员，用于登陆
     * @param id 学员id
     * @param password 学员密码
     * @return 学员信息
     */
    @Select("select * from student where id=#{id} and password=#{password}")
    public Student findStudentByIdPass(int id,String password);

    /**
     * 更新学员的积分，加积分
     * @param id 学员id
     * @param Credits
     */
    @Update("update student set credits=#{credits} where id=#{id}")
    public void updateCreditsByIdCredits(int id,int Credits);

    /**
     * 注册一个学员
     * @param student
     */
    @Insert("insert into student(id,name,password,phone,credits,address,)")
    public void insertStudent(Student student);

}
