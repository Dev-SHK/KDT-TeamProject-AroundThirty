package com.aroundThirty.model;

import com.aroundThirty.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportReplyDao {
    public static final String SQL_REPORT_REPLY_SELECT = "SELECT * FROM REPORT_REPLY";
    public static final String SQL_REPORT_REPLY_INSERT = "INSERT INTO REPORT_REPLY(reply_Detail, reply_Create_Datetime, User_ID) VALUES (?,?,?)";
    public static final String SQL_REPORT_REPLY_UPDATE = "UPDATE REPORT_REPLY SET reply_Detail=?, reply_Modify_Datetime=? WHERE NO=?";
    public static final String SQL_REPORT_REPLY_DELETE = "DELETE FROM REPORT_REPLY WHERE NO=?";
    public static final String SQL_REPORT_REPLY_SELECT_ONE = "SELECT * REPORT_REPLY WHERE NO=?";

    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rs = null;
    public static Connection conn = null;

    // C
    public static void reReplyInput(ReplyDto replyDto) {
        try {
            conn = JdbcUtil.getConnection();
            pstmt = conn.prepareStatement(SQL_REPORT_REPLY_INSERT);
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

    // D
    public static void reReplyDelete(ReplyDto replyDto) {
        conn = JdbcUtil.getConnection();
        try {
            pstmt = conn.prepareStatement(SQL_REPORT_REPLY_DELETE);
            pstmt.setInt(1, replyDto.getNo());
            int cnt = pstmt.executeUpdate();
            if (cnt == 0){
                System.out.println("삭제 실패");
            }
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                try {
                    if (pstmt != null) pstmt.close();
                    conn.close();
                } catch (SQLException exc) {
                    exc.printStackTrace();
                }
            }
        }

    }

    // U
    public static void reReplyModify(ReplyDto replyDto) {
        conn = JdbcUtil.getConnection(); //DB와 연결하기 위해 JdbcUtil의 getConncection 메소드 소환
        try {
            pstmt = conn.prepareStatement(SQL_REPORT_REPLY_UPDATE); // prepareStatement에 쿼리를 입력하여 DB를 불러와 Statement pstmt에 담는 구문
            pstmt.setString(1, replyDto.getDetail()); // 본문내용 치환
            pstmt.setString(2, replyDto.getReplyModifyDt());   // 게시글 수정 일자 및 시간 치환
            pstmt.setInt(3, replyDto.getNo()); // 업데이트할 데이터의 기준값

            int cnt = pstmt.executeUpdate(); // 업데이트를 성공 했는지 확인하기 위해 결과값을 인트형으로 받는다.
            if (cnt == 0) { // 결과값이 0인 경우에는 업데이트가 되지않은것이기 떄문에 "업데이트 실패"라는 텍스트를 띄워준다.
                System.out.println("업데이트 실패");
            }
        } catch (SQLException e) {
            try {
                conn.rollback(); // DB를 제대로 불러오지 못하는경우(쿼리문이 다른경우?)커넥션 메소드를 초기화 한다.
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

    // R
    public static List<ReplyDto> reReplySelectAll() {
        List<ReplyDto> list = new ArrayList<ReplyDto>();
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_REPORT_REPLY_SELECT);
            while (rs.next()) {
                int no = rs.getInt(1);
                String replyCreateDt = rs.getString(2);
                String replyModifyDt = rs.getString(3);
                String detail = rs.getString(4);
                String userId = rs.getString(5);
                int postNo = rs.getInt(6);

                list.add(new ReplyDto(replyCreateDt, replyModifyDt, detail, userId, no, postNo));

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

    // R
    public static ReplyDto reReplySelectOne(ReplyDto replyDto) { // one
        conn = JdbcUtil.getConnection();
        ReplyDto tmpdto = null;
        try {
            pstmt = conn.prepareStatement(SQL_REPORT_REPLY_SELECT_ONE);
            pstmt.setInt(1, replyDto.getNo());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int no = rs.getInt(1);
                String replyCreateDt = rs.getString(2);
                String replyModifyDt = rs.getString(3);
                String detail = rs.getString(4);
                String userId = rs.getString(5);
                int postNo = rs.getInt(6);
                tmpdto = new ReplyDto(replyCreateDt, replyModifyDt, detail, userId, no, postNo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return tmpdto;
    }
}
