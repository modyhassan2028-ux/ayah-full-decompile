package com.google.firebase.crashlytics;

import J8.e;
import R8.d;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p050e8.f;
import p091i8.a;
import p091i8.b;
import p091i8.c;
import p100j8.h;
import p100j8.p;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15399d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f15400a = new p(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f15401b = new p(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f15402c = new p(c.class, ExecutorService.class);

    static {
        Map map = R8.c.f7405b;
        d dVar = d.f7406r;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new R8.a(new S9.c(true)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p071g9.a aVarB = p100j8.a.b(p119l8.b.class);
        aVarB.f16337c = "fire-cls";
        aVarB.a(h.b(f.class));
        aVarB.a(h.b(e.class));
        aVarB.a(new h(this.f15400a, 1, 0));
        aVarB.a(new h(this.f15401b, 1, 0));
        aVarB.a(new h(this.f15402c, 1, 0));
        aVarB.a(new h(0, 2, m8.a.class));
        aVarB.a(new h(0, 2, p070g8.a.class));
        aVarB.a(new h(0, 2, P8.a.class));
        aVarB.f16340f = new C6.b(20, this);
        aVarB.e();
        return Arrays.asList(aVarB.b(), g.l("fire-cls", "20.0.0"));
    }
}
