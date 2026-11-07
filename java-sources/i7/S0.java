package i7;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f17129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y0 f17130t;

    public /* synthetic */ S0(Y0 y10, Bundle bundle, int i10) {
        this.f17128r = i10;
        this.f17129s = bundle;
        this.f17130t = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f17128r) {
            case 0:
                Y0 y10 = this.f17130t;
                y10.o();
                y10.p();
                Bundle bundle2 = this.f17129s;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                U6.y.c(string);
                U6.y.c(string2);
                U6.y.f(bundle2.get("value"));
                C1023u0 c1023u0 = (C1023u0) y10.f16104r;
                if (!c1023u0.a()) {
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17178E.a("Conditional property not set since app measurement is disabled");
                } else {
                    S1 s10 = new S1(string, string2, bundle2.getLong("triggered_timestamp"), bundle2.get("value"));
                    try {
                        V1 v10 = c1023u0.f17587z;
                        C1023u0.k(v10);
                        bundle2.getString("app_id");
                        C1022u c1022uS = v10.S(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        C1023u0.k(v10);
                        bundle2.getString("app_id");
                        C1022u c1022uS2 = v10.S(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        c1023u0.p().H(new C0975e(bundle2.getString("app_id"), string2, s10, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), c1022uS2, bundle2.getLong("trigger_timeout"), c1022uS, bundle2.getLong("time_to_live"), v10.S(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                Y0 y11 = this.f17130t;
                y11.o();
                y11.p();
                Bundle bundle3 = this.f17129s;
                String string3 = bundle3.getString("name");
                U6.y.c(string3);
                C1023u0 c1023u1 = (C1023u0) y11.f16104r;
                if (!c1023u1.a()) {
                    X x10 = c1023u1.f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    S1 s11 = new S1(string3, "", 0L, null);
                    try {
                        V1 v11 = c1023u1.f17587z;
                        C1023u0.k(v11);
                        bundle3.getString("app_id");
                        c1023u1.p().H(new C0975e(bundle3.getString("app_id"), "", s11, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), v11.S(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                Y0 y12 = this.f17130t;
                X4.c cVar = y12.f17231N;
                C1023u0 c1023u2 = (C1023u0) y12.f16104r;
                Bundle bundle4 = this.f17129s;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    C0985h0 c0985h0 = c1023u2.f17583v;
                    V1 v12 = c1023u2.f17587z;
                    C0981g c0981g = c1023u2.f17582u;
                    X x11 = c1023u2.f17584w;
                    C1023u0.k(c0985h0);
                    bundle = new Bundle(c0985h0.f17399P.L());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            C1023u0.k(v12);
                            if (V1.y0(obj)) {
                                V1.E(cVar, null, 27, null, null, 0);
                            }
                            C1023u0.m(x11);
                            x11.f17175B.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (V1.O(str)) {
                            C1023u0.m(x11);
                            x11.f17175B.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            C1023u0.k(v12);
                            c0981g.getClass();
                            if (v12.z0(500, obj, "param", str)) {
                                v12.D(bundle, str, obj);
                            }
                        }
                    }
                    C1023u0.k(v12);
                    V1 v13 = ((C1023u0) c0981g.f16104r).f17587z;
                    C1023u0.k(v13);
                    int i10 = v13.V(201500000) ? 100 : 25;
                    if (bundle.size() > i10) {
                        int i11 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i11++;
                            if (i11 > i10) {
                                bundle.remove(str2);
                            }
                        }
                        C1023u0.k(v12);
                        V1.E(cVar, null, 26, null, null, 0);
                        C1023u0.m(x11);
                        x11.f17175B.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                C0985h0 c0985h1 = c1023u2.f17583v;
                C1023u0.k(c0985h1);
                c0985h1.f17399P.P(bundle);
                if (!bundle4.isEmpty() || c1023u2.f17582u.y(null, G.f16923X0)) {
                    c1023u2.p().t(bundle);
                }
                break;
        }
    }
}
