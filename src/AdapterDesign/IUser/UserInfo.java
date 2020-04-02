package AdapterDesign.IUser;

/**
 *  用户实现类
 */
public class UserInfo implements IUserInfo {


    @Override
    public String getUserName() {
        System.out.println("姓名叫做........");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭住址.....");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工的手机号码是000000......");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工的办公室电话是.....");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS.......");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是.........");
        return null;
    }
}
