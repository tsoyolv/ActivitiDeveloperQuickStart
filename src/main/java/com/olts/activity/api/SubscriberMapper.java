package com.olts.activity.api;

import com.olts.activity.api.entities.Subscriber;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * o.tsoy
 * 23.03.2017
 */
public interface SubscriberMapper {
    @Select("SELECT * FROM subscriber WHERE id = #{id}")
    @Results({
            @Result(property = "refTariff", column = "ref_tariff")
    })
    Subscriber selectSubscriber(int id);
}