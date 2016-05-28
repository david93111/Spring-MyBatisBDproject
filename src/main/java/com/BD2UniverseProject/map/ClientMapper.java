package com.BD2UniverseProject.map;

import com.BD2UniverseProject.model.Client;
import com.BD2UniverseProject.model.ClientExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientMapper {
    int countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(BigDecimal CLIENT_ID);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(BigDecimal CLIENT_ID);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}