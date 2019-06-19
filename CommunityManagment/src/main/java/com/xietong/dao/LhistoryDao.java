package com.xietong.dao;

import com.xietong.bean.Lhistory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**导师历史活动持久层接口
 * Created by hxq on 2019/5/30.
 */
//Repository
public interface LhistoryDao {
    /**
     * 查询所有导师历史活动的信息
     * @return 导师历史活动集合
     */
    @Select("select * from lhistory")
    public List<Lhistory> findAllLhistory();

    /**
     * 通过活动id查找导师历史活动
     * @param aid
     * @return导师历史活动集合
     */
    @Select("select * from history where aid=#{aid}")
    public List<Lhistory> findLhistoryByActivityId(int aid);

    /**
     * 通过导师id查找导师历史活动
     * @param lid
     * @return导师历史活动集合
     */
    @Select("select * from history where lid=#{lid}")
    public List<Lhistory> findLhistoryByLecturerId(int lid);
}
