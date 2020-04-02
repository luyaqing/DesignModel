package AdapterDesign.outerUser.impl;

import AdapterDesign.outerUser.IOuterUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 *  用户家庭信息
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工的家庭电话是.......");
        homeInfo.put("homeAddress", "员工的家庭地址是....");
        return homeInfo;
    }
}
