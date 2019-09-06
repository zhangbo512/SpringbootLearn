package com.example.demo.mybatis;

import com.example.demo.domain.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>
 * description
 * </p>
 *
 * @author KayTin 2018/06/07 13:48
 */

/**
 * JDBC的类型
 */
@MappedJdbcTypes(JdbcType.INTEGER)
/**
 * Java的类型
 */
@MappedTypes(SexEnum.class)
/**
 * Mybatis的类型处理器
 */
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        String ni = String.format("%s hah", "ni");
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {

        return null;
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
