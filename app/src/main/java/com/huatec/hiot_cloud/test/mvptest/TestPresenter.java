package com.huatec.hiot_cloud.test.mvptest;

import com.huatec.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {

    private  TestView view;

    public TestPresenter(TestView view) {
        this.view = view;

    }
    void login(User user) {
       if("lzw".equals(user.getUserName()) && "123" .equals(user.getPassword())){
        view.showMessage("登录成功");

}else  {
           view.showMessage("登录失败");
       }
    }
}
