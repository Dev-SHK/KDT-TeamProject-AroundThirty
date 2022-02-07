package com.aroundThirty.model;

import com.aroundThirty.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class XmlDao {
    public static final String SQL_XML_SELECT = "SELECT * FROM XML";


    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rs = null;
    public static Connection conn = null;

    public static List<XmlDto> xmlSelectAll() {
        List<XmlDto> list = new ArrayList<XmlDto>();
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_XML_SELECT);
            while (rs.next()) {
                String age = rs.getString(1);
                String colorCd = rs.getString(2);
                String filename = rs.getString(3);
                int happenDt = rs.getInt(4);
                String happenPlace = rs.getString(5);
                String kindCd = rs.getString(6);
                String neuterYn = rs.getString(7);
                String orgNm = rs.getString(8);
                String processState = rs.getString(9);
                String sexCd = rs.getString(10);
                String specialMark = rs.getString(11);
                String weight = rs.getString(12);

                list.add(new XmlDto(age, colorCd, filename, happenDt, happenPlace, kindCd, neuterYn,
                        orgNm, processState, sexCd, specialMark, weight));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}