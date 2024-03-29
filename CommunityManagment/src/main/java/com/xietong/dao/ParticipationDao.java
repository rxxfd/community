package com.xietong.dao;

import com.xietong.bean.Participation;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**学员参与活动信息的持久层接口
 * Created by hxq on 2019/5/29.
 */
//@Repository
public interface ParticipationDao {

    /**
     * 查找所有的学员参与活动信息
     * @return 参与信息的集合
     */
    @Select("select * from participation")
    public List<Participation> findAllParticipations();

    /**
     * 根据活动的id查找所有参与此活动学员活动参与信息
     * @param aid 活动id
     * @return 参与信息的集合
     */
    @Select("select * from participation where aid=#{aid}")
    public List<Participation> findParticipationByActivityId(int aid);

    /**
     * 根据学员的id查找该学员参与过的活动
     * @param sid 学员id
     * @return 参与信息的集合
     */
    @Select("selecr * from participation where sid=#{sid}")
    public  List<Participation> findParticipationByStudentId(int sid);

    /**
     * 根据学员id查找学员没有签到的活动
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    @Select("select * from student where isSign=0 and sid=#{sid}")
    public List<Participation> findNotSignParticipationByStudentId(int sid);

    /**
     * 根据学员id查找学员已经签到的活动
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    @Select("select * from student where isSign=1 and sid=#{sid}")
    public List<Participation> findSignedParticipationByStudentId(int sid);
}
