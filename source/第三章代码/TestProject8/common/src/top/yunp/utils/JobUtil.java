package top.yunp.utils;

public class JobUtil {

    private JobUtil()
    {

    }

    public static boolean checkUserName(String userName)
    {

        if(userName.length() > 3)
        {
            CheckDataFromSQL.checkData(userName);
            return true;
        }

        return false;
    }
}
