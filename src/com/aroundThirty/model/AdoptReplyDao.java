package com.aroundThirty.model;

import com.aroundThirty.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdoptReplyDao {
    public static final String SQL_ADOPTREPLY_SELECT = "SELECT * FROM ADOPTREPLY";
    public static final String SQL_ADOPTREPLY_INSERT = "INSERT INTO ADOPTREPLY(reply_Detail, reply_Create_Datetime, User_ID) VALUES (?,?,?)";
    public static final String SQL_ADOPTREPLY_UPDATE = "UPDATE ADOPTREPLY reply_Detail=?, reply_Modify_Datetime=? WHERE NO=?";
    public static final String SQL_ADOPTREPLY_DELETE = "DELETE FROM ADOPTREPLY WHERE NO=?";


    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rs = null;
    public static Connection conn = null;

    // SelectAll
    public static List<ReplyDto> adoptReplySelectAll() {
        List<ReplyDto> list = new ArrayList<ReplyDto>();
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_ADOPTREPLY_SELECT);
            while (rs.next()) {
                int no = rs.getInt(1);
                String detail = rs.getString(2);
                String replyCreateDt = rs.getString(3);
                String replyModifyDt = rs.getString(4);
                String userId = rs.getString(5);
                int postNo = rs.getInt(6);
                list.add(new ReplyDto(detail,replyCreateDt,replyModifyDt,userId, no, postNo));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    // Input
    public static void adoptReplyInput(ReplyDto replyDto) {
        try {
            conn = JdbcUtil.getConnection();
            pstmt = conn.prepareStatement(SQL_ADOPTREPLY_INSERT);
            pstmt.setString(1, replyDto.getDetail());
            pstmt.setString(2, replyDto.getReplyCreateDt());
            pstmt.setString(3, replyDto.getUserId());
            int cnt = pstmt.executeUpdate();
            if (cnt == 0) {
                System.out.println(">>> 입력 실패!");
                conn.rollback();
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception....");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // update
    public static void adoptReplyModify(ReplyDto replyDto) {
        conn = JdbcUtil.getConnection();
        try {
            pstmt = conn.prepareStatement(SQL_ADOPTREPLY_UPDATE);
            pstmt.setString(1, replyDto.getDetail());
            pstmt.setString(2, replyDto.getReplyModifyDt());
            pstmt.setInt(3, replyDto.getNo());

            int cnt = pstmt.executeUpdate();
            if (cnt == 0) {
                System.out.println("업데이트 실패");
            }
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Delete
    public static void adoptReplyDelete(ReplyDto replyDto) {
        conn = JdbcUtil.getConnection();
        try {
            pstmt = conn.prepareStatement(SQL_ADOPTREPLY_DELETE);
            pstmt.setInt(1, replyDto.getNo());
            int cnt = pstmt.executeUpdate();
            if (cnt == 0) {
                System.out.println(">>> 삭제 실패!");
            }
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}