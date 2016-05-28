package com.BD2UniverseProject.map;

import com.BD2UniverseProject.model.Sale;
import com.BD2UniverseProject.model.SaleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
    int countByExample(SaleExample example);

    int deleteByExample(SaleExample example);

    int deleteByPrimaryKey(BigDecimal SALE_ID);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(BigDecimal SALE_ID);

    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}