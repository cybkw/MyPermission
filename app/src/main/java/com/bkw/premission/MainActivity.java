package com.bkw.premission;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bkw.library.annotation.Permission;
import com.bkw.library.annotation.PermissionCancel;
import com.bkw.library.annotation.PermissionDenied;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Permission(value = Manifest.permission.WRITE_EXTERNAL_STORAGE, requestCode = 200)
    public void testRequest() {
        Log.e("TAG", "权限申请成功");
    }

    /**
     * 授权被取消
     */
    @PermissionCancel
    public void testCancel() {
        Log.e("TAG", "授权被拒绝。。。。");
    }

    @PermissionDenied
    public void testDenied() {
        Log.e("TAG", "授权被拒绝，用户勾选了不再提示。。。。");
    }
}
