package cn.tedu;

import cn.tedu.DBUtils;

import java.sql.Connection;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) {
        try(Connection conn = DBUtils.getConn()){
            Statement s = conn.createStatement();
            String sql=("insert into hero values (null,'�����','��ʦ'),(null,'������','����')");
            s.executeUpdate(sql);
            System.out.println("ִ�����!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
