package com.BD2UniverseProject.map;

import com.BD2UniverseProject.model.SaleStatus;
import com.BD2UniverseProject.model.SaleStatusExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleStatusMapper {
    int countByExample(SaleStatusExample example);

    int deleteByExample(SaleStatusExample example);

    int deleteByPrimaryKey(BigDecimal SALE_STATUS_ID);

    int insert(SaleStatus record);

    int insertSelective(SaleStatus record);

    List<SaleStatus> selectByExample(SaleStatusExample example);

    SaleStatus selectByPrimaryKey(BigDecimal SALE_STATUS_ID);

    int updateByExampleSelective(@Param("record") SaleStatus record, @Param("example") SaleStatusExample example);

    int updateByExample(@Param("record") SaleStatus record, @Param("example") SaleStatusExample example);

    int updateByPrimaryKeySelective(SaleStatus record);

    int updateByPrimaryKey(SaleStatus record);
}