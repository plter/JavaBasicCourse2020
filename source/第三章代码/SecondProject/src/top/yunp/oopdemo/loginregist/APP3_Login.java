package top.yunp.oopdemo.loginregist;

public class APP3_Login implements I_Login{
    @Override
    public boolean checkName(String userName) {
        return false;
    }

    @Override
    public boolean checkPwd(String passwd) {
        return false;
    }

    @Override
    public boolean checkCode(String code) {
        return false;
    }

    @Override
    public void sendMsg(String userName, String passwd) {

    }
}
