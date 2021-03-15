package cn.tedu;

import cn.tedu.DBUtils;

import java.sql.Connection;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) {
        try(Connection conn = DBUtils.getConn()){
            Statement s = conn.createStatement();
            String sql=("insert into hero values (null,'诸葛亮','法师'),(null,'孙尚香','射手')");
            s.executeUpdate(sql);
            System.out.println("执行完成!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
