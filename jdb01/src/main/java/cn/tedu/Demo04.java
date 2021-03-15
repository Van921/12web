package cn.tedu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo04 {
    public static void main(String[] args) {
        //��ȡ����
        try (Connection conn = DBUtils.getConn()){
            //�õ�ִ��sql������
            Statement s = conn.createStatement();
            //ִ�в�ѯSQL
            ResultSet rs = s.executeQuery("select ename,sal from emp");
            while (rs.next()){
                //1.ͨ���ֶ�����ȡ����
                String name = rs.getString("ename");
                //2.ͨ���ֶε�λ�û�ȡ����
                double sal = rs.getDouble(2);
                System.out.println(name+":"+sal);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
