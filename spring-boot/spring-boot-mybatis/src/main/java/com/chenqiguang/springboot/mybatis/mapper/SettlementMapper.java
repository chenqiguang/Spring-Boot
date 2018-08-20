package com.chenqiguang.springboot.mybatis.mapper;

import com.chenqiguang.springboot.mybatis.bean.Settlement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface SettlementMapper {

    @Select("Select * from chenqiguang.t_settlement where settlement_Id = #{settlementId}")
    public Settlement getSettlement(String settlementId);

    public Settlement getSettlementById(String settlementId);
}
