package de.vogella.mysql.first.MYSQLAccess;

import de.vogella.mysql.first.MYSQLAccess.App;

public class Main {
  public static void main(String[] args) throws Exception {
    App dao = new App();
    dao.readDataBase();
  }


} 