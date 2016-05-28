package com.BD2UniverseProject.map;

import com.BD2UniverseProject.model.SaleDetail;
import com.BD2UniverseProject.model.SaleDetailExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SaleDetailMapper {
    int countByExample(SaleDetailExample example);

    int deleteByExample(SaleDetailExample example);

    int deleteByPrimaryKey(BigDecimal SALE_DETAIL_ID);

    int insert(SaleDetail record);

    int insertSelective(SaleDetail record);

    List<SaleDetail> selectByExample(SaleDetailExample example);

    SaleDetail selectByPrimaryKey(BigDecimal SALE_DETAIL_ID);

    int updateByExampleSelective(@Param("record") SaleDetail record, @Param("example") SaleDetailExample example);

    int updateByExample(@Param("record") SaleDetail record, @Param("example") SaleDetailExample example);

    int updateByPrimaryKeySelective(SaleDetail record);

    int updateByPrimaryKey(SaleDetail record);
    
    List<Map<String, Object>> selectDetailTableForSale(Map<String, Object> map);
}