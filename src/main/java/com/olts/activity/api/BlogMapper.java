package com.olts.activity.api;

import com.olts.activity.api.entities.Blog;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * o.tsoy
 * 23.03.2017
 */
public interface BlogMapper {
    @Select("SELECT * FROM subscriber WHERE id = #{id}")
    @Results({
            @Result(property = "refTariff", column = "ref_tariff")
    })
    Blog selectBlog(int id);
}