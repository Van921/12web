package cn.tedu;


import org.junit.Test;

import java.sql.*;

public class Demo03 {

    @Test
    public void test01() throws Exception {
        System.out.println("test01");
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.��ȡ���Ӷ���
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root","root");
        System.out.println("�ɹ�:"+conn);
        //3.����ִ��SQL���Ķ���
        Statement s = conn.createStatement();
        String sql = "insert into emp(empno,ename) values(101,'���')";
        s.executeUpdate(sql);
        conn.close();
        System.out.println("ִ�����!");
    }

    @Test
    public void test02() throws Exception {
        System.out.println("test02");
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.��ȡ���Ӷ���
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root","root");
        System.out.println("�ɹ�:"+conn);
        //3.����ִ��SQL���Ķ���
        Statement s = conn.createStatement();
        String sql = "update emp set ename='����' where ename='���'";
        s.executeUpdate(sql);
        conn.close();
        System.out.println("ִ�����!");
    }

    @Test
    public void test03() throws Exception {
        System.out.println("test03");
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.��ȡ���Ӷ���
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root","root");
        System.out.println("�ɹ�:"+conn);
        //3.����ִ��SQL���Ķ���
        Statement s = conn.createStatement();
        String sql = "delete from emp where ename='����'";
        s.executeUpdate(sql);
        conn.close();
        System.out.println("ִ�����!");
    }
    @Test
    public void test04() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.��ȡ���Ӷ���
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root","root");
        System.out.println("�ɹ�:"+conn);
        //3.����ִ��SQL���Ķ���
        Statement s = conn.createStatement();
        String sql = "select * from emp";
        ResultSet rs = s.executeQuery(sql);
        //����������е�����
        while (rs.next()){
            String name = rs.getString("ename");
            double sal = rs.getDouble("sal");
            System.out.println(name+":"+sal);
        }
        conn.close();
    }

}
