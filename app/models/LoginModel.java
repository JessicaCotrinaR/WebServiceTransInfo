package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 2/15/17.
 */
public class LoginModel extends Model {

    public String username;
    public String password;

    public LoginModel() {
    }

    public int goLogin(LoginModel loginModel) {

        int result;
        String sql1 = "SELECT * FROM User WHERE Username=? and Password=MD5(?)";
        String sql2 = "INSERT INTO UserSession VALUES (UUID(), ?, ?, ?, NOW(), DATE_ADD(NOW(), INTERVAL 8 HOUR))";
        String sql3 = "SELECT *, CONVERT_TZ(ExpirationDate, @@session.time_zone, '+00:00') as ExpirationDateGMT FROM UserSession WHERE UserID=? ORDER BY CreationDate DESC LIMIT 1";
        String sql4 = "SELECT * FROM Officer WHERE OfficerID=?";

        SqlUpdate select1 = Ebean.createSqlUpdate(sql1);
        SqlUpdate insert2 = Ebean.createSqlUpdate(sql2);
        SqlUpdate select3 = Ebean.createSqlUpdate(sql3);
        SqlUpdate select4 = Ebean.createSqlUpdate(sql4);

        select1.setParameter(1,username);
        select1.setParameter(2,password);

        //System.out.println("Update: " + select1.getSql());
        try {
            result = select1.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }
}

//SELECT * FROM User WHERE Username=? and Password=MD5(?);",
//        "INSERT INTO UserSession VALUES (UUID(), ?, ?, ?, NOW(), DATE_ADD(NOW(), INTERVAL 8 HOUR));",
//        "SELECT *, CONVERT_TZ(ExpirationDate, @@session.time_zone, '+00:00') as ExpirationDateGMT FROM UserSession WHERE UserID=? ORDER BY CreationDate DESC LIMIT 1;",
//        "SELECT * FROM Officer WHERE OfficerID=?