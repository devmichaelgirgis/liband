package com.liband.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/liband/utils/NetUtil;", "", "()V", "getNetworkCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "isGPSEnable", "", "isNetworkAvailable", "liband_debug"})
public final class NetUtil {
    public static final com.liband.utils.NetUtil INSTANCE = null;
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean isGPSEnable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Cache getNetworkCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private NetUtil() {
        super();
    }
}