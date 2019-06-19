package com.xietong.dao;

import com.xietong.bean.Lecturer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**导师持久层Dao接口
 * Created by hxq on 2019/5/29.
 */
//@Repository
public interface LecturerDao {
    /**
     * 根据导师的id删除一个导师的账号
     * @param id 导师账户
     */
    @Delete("delete from lecturer where id=#{id}")
    public void deleteLecturerById(int id);

    /**
     * 查找所有的导师的信息
     * @return 所有导师的集合
     */
    @Select("select * from lecturer")
    public List<Lecturer> findAllLecturers();

    /**
     * 通过id和password查找一个导师，用于登陆
     * @param id 导师id
     * @param password 导师密码
     * @return
     */
    @Select("select * from lecturer where id=#{id} and password=#{password}")
    public Lecturer findLecturerByIdPass(int id,String password);

    /**
     * 更新导师的信息
     * @param lecturer 导师封装类
     */
    @Insert("insert into lecturer(id,name,password,phone,qualified,community,credits,resume) values(#{id},#{name},#{password},#{phone},#{qualified},#{community},#{credits},#{resume})")
    public void updateLecturer(Lecturer lecturer);

    /**8
     * 通过导师id更新导师的认证是否通过
     * @param id 导师id
     */
    @Update("update lecturer set qualified=true where id=#{id}")
    public void updateQualifiedById(int id);

    /***
     * 注册一个导师
     * @param lecturer
     */
    @Insert("insert into lecturer(id,name,password,phone,community,credits,qualified,resume) values(#{id},#{name},#{password},#{phone},#{community},#{credits},false,#{resume})")
    public void insertLecturer(Lecturer lecturer);

}
