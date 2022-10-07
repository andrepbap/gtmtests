package com.example.gtmtests;

import androidx.annotation.NonNull;

import com.google.android.gms.tagmanager.CustomTagProvider;

import java.util.Map;

public class GTMCallback implements CustomTagProvider {
    @Override
    public void execute(@NonNull Map<String, Object> map) {
        System.out.println(map);
    }
}