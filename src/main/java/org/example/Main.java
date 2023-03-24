package org.example;

import bean.AdminEmp;
import bean.HardwareEmp;
import bean.SoftwareEmp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg=cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tx=ses.beginTransaction();

        SoftwareEmp emp1=new SoftwareEmp(101,"SHUBHAM","shubhan@gmail.com",50000,"hibernate");
        HardwareEmp emp2=new HardwareEmp(102,"SHUBHAM","shubhan@gmail.com",50000,8);
        AdminEmp emp3=new AdminEmp(103,"SHUBHAM","shubhan@gmail.com",50000,"sales");
        ses.save(emp1);
        ses.save(emp2);
        ses.save(emp3);
        tx.commit();
    }
}