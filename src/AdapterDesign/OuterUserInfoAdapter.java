package AdapterDesign;

import AdapterDesign.IUser.IUserInfo;
import AdapterDesign.outerUser.IOuterUserBaseInfo;
import AdapterDesign.outerUser.IOuterUserHomeInfo;
import AdapterDesign.outerUser.IOuterUserOfficeInfo;

import java.util.Map;

/**
 * 适配器
 */
public class OuterUserInfoAdapter implements IUserInfo {

    // 源对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    // 数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    // 构造函数传递对象   (依赖关系)
    public OuterUserInfoAdapter(IOuterUserBaseInfo _baseInfo, IOuterUserHomeInfo _homeInfo, IOuterUserOfficeInfo _officeInfo) {
        this.baseInfo = _baseInfo;
        this.homeInfo = _homeInfo;
        this.officeInfo = _officeInfo;

        // 数据处理
        this.baseMap = baseInfo.getUserBaseInfo();
        this.homeMap = homeInfo.getUserHomeInfo();
        this.officeMap = officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) officeMap.get("officeTeNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String  jobPosition = (String) officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeMap.get("jobPosition");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
