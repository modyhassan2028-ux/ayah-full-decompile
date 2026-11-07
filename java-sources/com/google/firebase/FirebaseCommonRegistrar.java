package com.google.firebase;

import H8.d;
import H8.e;
import H8.f;
import H8.g;
import J1.c;
import O8.b;
import W2.n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p071g9.a;
import p100j8.h;
import p100j8.p;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a aVarB = p100j8.a.b(b.class);
        aVarB.a(new h(2, 0, O8.a.class));
        aVarB.f16340f = new c(19);
        arrayList.add(aVarB.b());
        p pVar = new p(p091i8.a.class, Executor.class);
        a aVar = new a(d.class, new Class[]{f.class, g.class});
        aVar.a(h.b(Context.class));
        aVar.a(h.b(p050e8.f.class));
        aVar.a(new h(2, 0, e.class));
        aVar.a(new h(1, 1, b.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.f16340f = new C6.b(2, pVar);
        arrayList.add(aVar.b());
        arrayList.add(va.g.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(va.g.l("fire-core", "22.0.0"));
        arrayList.add(va.g.l("device-name", b(Build.PRODUCT)));
        arrayList.add(va.g.l("device-model", b(Build.DEVICE)));
        arrayList.add(va.g.l("device-brand", b(Build.BRAND)));
        arrayList.add(va.g.s("android-target-sdk", new n(10)));
        arrayList.add(va.g.s("android-min-sdk", new n(11)));
        arrayList.add(va.g.s("android-platform", new n(12)));
        arrayList.add(va.g.s("android-installer", new n(13)));
        try {
            p110k9.f.f19072s.getClass();
            str = "2.2.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(va.g.l("kotlin", str));
        }
        return arrayList;
    }
}
