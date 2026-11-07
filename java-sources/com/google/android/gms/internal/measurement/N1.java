package com.google.android.gms.internal.measurement;

import android.net.Uri;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1350e f14077a = new C1350e(0);

    public static synchronized Uri a() {
        C1350e c1350e = f14077a;
        Uri uri = (Uri) c1350e.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c1350e.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
