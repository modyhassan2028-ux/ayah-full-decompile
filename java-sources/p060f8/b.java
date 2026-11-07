package p060f8;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0786a0;
import com.google.android.gms.internal.measurement.C0791b0;
import com.google.android.gms.internal.measurement.C0796c0;
import com.google.android.gms.internal.measurement.C0806e0;
import com.google.android.gms.internal.measurement.C0816g0;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.Z;
import i7.Z0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f16237a;

    public b(C0846m0 c0846m0) {
        this.f16237a = c0846m0;
    }

    @Override // i7.Z0
    public final void a(String str, String str2, Bundle bundle) {
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0816g0(c0846m0, str, str2, bundle, true));
    }

    @Override // i7.Z0
    public final long b() {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0806e0(c0846m0, i10, 2));
        Long l10 = (Long) I.g(i10.c(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i11 = c0846m0.f14360d + 1;
        c0846m0.f14360d = i11;
        return jNextLong + ((long) i11);
    }

    @Override // i7.Z0
    public final void c(String str, String str2, Bundle bundle) {
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0786a0(c0846m0, str, str2, bundle, 0));
    }

    @Override // i7.Z0
    public final String d() {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0806e0(c0846m0, i10, 3));
        return (String) I.g(i10.c(500L), String.class);
    }

    @Override // i7.Z0
    public final String e() {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0806e0(c0846m0, i10, 4));
        return (String) I.g(i10.c(500L), String.class);
    }

    @Override // i7.Z0
    public final List f(String str, String str2) {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0786a0(c0846m0, str, str2, i10, 1));
        List list = (List) I.g(i10.c(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // i7.Z0
    public final void g(Bundle bundle) {
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new Z(c0846m0, bundle, 0));
    }

    @Override // i7.Z0
    public final int h(String str) {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0791b0(c0846m0, str, i10, 1));
        Integer num = (Integer) I.g(i10.c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // i7.Z0
    public final String i() {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0806e0(c0846m0, i10, 1));
        return (String) I.g(i10.c(50L), String.class);
    }

    @Override // i7.Z0
    public final void j(String str) {
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0796c0(c0846m0, str, 1));
    }

    @Override // i7.Z0
    public final String k() {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0806e0(c0846m0, i10, 0));
        return (String) I.g(i10.c(500L), String.class);
    }

    @Override // i7.Z0
    public final Map l(String str, String str2, boolean z10) {
        I i10 = new I();
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0816g0(c0846m0, str, str2, z10, i10));
        Bundle bundleC = i10.c(5000L);
        if (bundleC == null || bundleC.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleC.size());
        for (String str3 : bundleC.keySet()) {
            Object obj = bundleC.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // i7.Z0
    public final void m(String str) {
        C0846m0 c0846m0 = this.f16237a;
        c0846m0.a(new C0796c0(c0846m0, str, 0));
    }
}
