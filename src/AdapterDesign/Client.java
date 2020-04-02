package AdapterDesign;

import AdapterDesign.IUser.IUserInfo;
import AdapterDesign.outerUser.IOuterUserBaseInfo;
import AdapterDesign.outerUser.IOuterUserHomeInfo;
import AdapterDesign.outerUser.IOuterUserOfficeInfo;
import AdapterDesign.outerUser.impl.OuterUserBaseInfo;
import AdapterDesign.outerUser.impl.OuterUserHomeInfo;
import AdapterDesign.outerUser.impl.OuterUserOfficeInfo;

/**
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        // 外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        // 传递三个对象
        IUserInfo youngGirl = new OuterUserInfoAdapter(baseInfo, homeInfo, officeInfo);

        // 从数据中查找101个
        for (int i = 0; i < 101; i++ ) {
            youngGirl.getMobileNumber();
        }

    }
}
