package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        //1.ע������ ���߱�����ʹ�õ����ݿ���ʲô
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.��ȡ���Ӷ���
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root","root");
        System.out.println("�ɹ�:"+conn);
        //3.����ִ��SQL���Ķ���
        Statement s = conn.createStatement();
        //4.ִ��SQL���
        String sql = "drop table jdbct1";
        s.execute(sql);
        //5.�ر���Դ
        conn.close();
        System.out.println("ִ�����!");


    }
}
