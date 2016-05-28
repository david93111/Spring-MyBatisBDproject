package com.BD2UniverseProject.map;

import com.BD2UniverseProject.model.ClientType;
import com.BD2UniverseProject.model.ClientTypeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientTypeMapper {
    int countByExample(ClientTypeExample example);

    int deleteByExample(ClientTypeExample example);

    int deleteByPrimaryKey(BigDecimal CLIENT_TYPE_ID);

    int insert(ClientType record);

    int insertSelective(ClientType record);

    List<ClientType> selectByExample(ClientTypeExample example);

    ClientType selectByPrimaryKey(BigDecimal CLIENT_TYPE_ID);

    int updateByExampleSelective(@Param("record") ClientType record, @Param("example") ClientTypeExample example);

    int updateByExample(@Param("record") ClientType record, @Param("example") ClientTypeExample example);

    int updateByPrimaryKeySelective(ClientType record);

    int updateByPrimaryKey(ClientType record);
}