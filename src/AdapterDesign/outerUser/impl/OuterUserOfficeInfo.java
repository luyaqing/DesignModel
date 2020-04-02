package AdapterDesign.outerUser.impl;

import AdapterDesign.outerUser.IOuterUserOfficeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工的家庭信息
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个的职位是BOSS....");
        officeInfo.put("officeTelNumber", "员工的办公电话是....");
        return officeInfo;
    }
}
