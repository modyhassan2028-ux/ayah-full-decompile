package androidx.lifecycle;

import K0.C0368s0;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class L implements M2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.c f12628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f12630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p110k9.o f12631d;

    public L(L5.c cVar, V v10) {
        p251z9.j.e(cVar, "savedStateRegistry");
        this.f12628a = cVar;
        this.f12631d = p110k9.a.d(new B3.f(10, v10));
    }

    @Override // M2.d
    public final Bundle a() {
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        Bundle bundle = this.f12630c;
        if (bundle != null) {
            bundleP.putAll(bundle);
        }
        for (Map.Entry entry : ((M) this.f12631d.getValue()).f12632b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0368s0) ((H) entry.getValue()).f12619b.f1964f).a();
            if (!bundleA.isEmpty()) {
                Y2.a.b0(bundleP, str, bundleA);
            }
        }
        this.f12629b = false;
        return bundleP;
    }

    public final void b() {
        if (this.f12629b) {
            return;
        }
        Bundle bundleM = this.f12628a.m("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        Bundle bundle = this.f12630c;
        if (bundle != null) {
            bundleP.putAll(bundle);
        }
        if (bundleM != null) {
            bundleP.putAll(bundleM);
        }
        this.f12630c = bundleP;
        this.f12629b = true;
    }
}
