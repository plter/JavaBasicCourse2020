package top.yunp.oopdemo.loginregist;

public interface I_Login {

    public abstract boolean checkName(String userName);

    public abstract boolean checkPwd(String passwd);

    public abstract boolean checkCode(String code);

    public abstract void sendMsg(String userName,String passwd);
}
