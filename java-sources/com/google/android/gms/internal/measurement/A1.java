package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f13990a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13992c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f13991b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f13992c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
