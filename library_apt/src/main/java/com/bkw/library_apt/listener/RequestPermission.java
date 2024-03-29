package com.bkw.library_apt.listener;

import android.support.annotation.NonNull;

public interface RequestPermission<T> {
    // 请求权限组
    void requestPermission(T target, String[] permissions);

    // 授权结果返回
    void onRequestPermissionsResult(T target, int requestCode, @NonNull int[] grantResults);

}
