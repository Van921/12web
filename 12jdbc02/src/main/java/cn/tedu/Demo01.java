package cn.tedu;

import cn.tedu.DBUtils;

import java.sql.Connection;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) {
        try(Connection conn = DBUtils.getConn()){
            Statement s = conn.createStatement();
            String sql=("create table hero(id int primary key auto_increment,name varchar(20),type varchar(20))");
            s.execute(sql);
            System.out.println("Ö´ÐÐÍê³É!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
