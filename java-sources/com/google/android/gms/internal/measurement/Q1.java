package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import u.C1349d;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1350e f14101a = new C1350e(0);

    public static synchronized void a() {
        C1350e c1350e = f14101a;
        Iterator it = ((C1349d) c1350e.values()).iterator();
        if (it.hasNext()) {
            ((Q1) it.next()).getClass();
            throw null;
        }
        c1350e.clear();
    }
}
