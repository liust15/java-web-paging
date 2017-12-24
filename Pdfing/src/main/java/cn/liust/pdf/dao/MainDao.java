package cn.liust.pdf.dao;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.liust.pdf.bean.Toutiao;
import cn.liust.pdf.util.DBFactory;

public class MainDao {
    Connection conn = null;
    PreparedStatement ps;

    public String getAlldata() {
        String json = "{\"state\": 0}";
        ObjectMapper mapper = new ObjectMapper();
        List<Toutiao> list = new ArrayList<Toutiao>();
        try {
            conn = DBFactory.INSTANCE.getConnection();
            String sql = "select * from pytest";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Toutiao toutiao = new Toutiao((int) rs.getLong(1), rs.getString(2), rs.getString(3), (int) rs.getLong(4), rs.getString(5));
                list.add(toutiao);
            }
            json = mapper.writeValueAsString(list);
            ps.close();
            rs.close();
        } catch (Exception e) {
            json = "{\"state\": 0}";
            System.out.println("系统错误2" + e);
        } finally {
            DBFactory.INSTANCE.closeConnection(conn);
        }
        return json;
    }

    public int getTotalrecord() {
        String sql = "SELECT COUNT(*) FROM pytest";
        int rowCount = 0;
        try {
            conn = DBFactory.INSTANCE.getConnection();
            Statement sta = conn.createStatement();
            ResultSet res = sta.executeQuery(sql);
            while (res.next()) {
                rowCount = res.getInt(1);
            }
        } catch (Exception e) {
            rowCount = 0;
            System.out.println("系统错误2" + e);
        } finally {
            DBFactory.INSTANCE.closeConnection(conn);
        }
        return rowCount;
    }

    //获取所有数据
    public List getPageData(int pageindex, int row) {
        List<Toutiao> list = new ArrayList<Toutiao>();
        try {
            conn = DBFactory.INSTANCE.getConnection();
            String sql = "select * from pytest limit " + pageindex + "," + row;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Toutiao toutiao = new Toutiao((int) rs.getLong(1), rs.getString(2), rs.getString(3), (int) rs.getLong(4), rs.getString(5));
                list.add(toutiao);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("系统错误2" + e);
        } finally {
            DBFactory.INSTANCE.closeConnection(conn);
        }
        return list;
    }
}
