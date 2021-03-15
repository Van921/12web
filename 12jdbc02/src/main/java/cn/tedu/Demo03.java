package cn.tedu;

import cn.tedu.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03 {
    @Test
    public void test01(){
        try (Connection conn = DBUtils.getConn()){
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select name,type from hero");
            while (rs.next()){
                String name = rs.getString(1);
                String type = rs.getString(2);
                System.out.println(name+":"+type);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
