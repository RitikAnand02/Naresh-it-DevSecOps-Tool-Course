package com.nt.dao;

public interface ILoginDAO {
   public int   authenticate(String user,String pwd);
   public   String  addUser(String user,String pwd);
}
