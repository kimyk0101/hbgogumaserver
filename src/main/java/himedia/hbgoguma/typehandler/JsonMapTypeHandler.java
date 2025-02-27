package himedia.hbgoguma.typehandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import java.sql.*;
import java.util.Map;

public class JsonMapTypeHandler extends BaseTypeHandler<Map<Long, String>> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Map<Long, String> parameter, JdbcType jdbcType) throws SQLException {
        try {
            ps.setString(i, objectMapper.writeValueAsString(parameter)); // Map을 JSON 문자열로 변환하여 저장
        } catch (Exception e) {
            throw new SQLException("Error converting Map to JSON", e);
        }
    }

    @Override
    public Map<Long, String> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return getMap(rs.getString(columnName));
    }

    @Override
    public Map<Long, String> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return getMap(rs.getString(columnIndex));
    }

    @Override
    public Map<Long, String> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return getMap(cs.getString(columnIndex));
    }

    private Map<Long, String> getMap(String json) throws SQLException {
        if (json == null || json.isEmpty()) {
            return null;
        }
        try {
            return objectMapper.readValue(json, new TypeReference<Map<Long, String>>() {});
        } catch (Exception e) {
            throw new SQLException("Error converting JSON to Map", e);
        }
    }
}
