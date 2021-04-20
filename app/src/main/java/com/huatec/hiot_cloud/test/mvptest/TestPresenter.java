package com.huatec.hiot_cloud.test.mvptest;

import com.huatec.hiot_cloud.base.BasePresenter;
import com.huatec.hiot_cloud.dagger2test.ThridObj;
import com.huatec.hiot_cloud.test.mvptest.model.User;

import javax.inject.Inject;

public class TestPresenter  extends BasePresenter<TestView> {
    @Inject
    public TestPresenter() {

    }
    @Inject
    ThridObj thirdObj;


    public void login(User user) {
        thirdObj.thirdAction();
       if("lzw".equals(user.getUserName()) && "123" .equals(user.getPassword())){
        getView().showMessage("登录成功");

}else  {
           getView().showMessage("登录失败");
       }
    }


}
