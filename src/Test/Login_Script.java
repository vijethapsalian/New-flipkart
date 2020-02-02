package Test;

import org.testng.annotations.Test;

import Generic.Generic_Test;
import POM.flip_homepage;
import POM.flip_login;

public class Login_Script extends Generic_Test {
@Test
public void flipLogin() throws InterruptedException
{
flip_login f=new flip_login(driver);
f.userTbox("7353479043");
f.pwdTbox("topology");
f.clickBtn();
Thread.sleep(3000);
flip_homepage fh=new flip_homepage(driver);
fh.womenOver(driver);
fh.clickSaree();
fh.logOut(driver);
fh.clickLog();
}
}
