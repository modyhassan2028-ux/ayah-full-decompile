package T8;

import Y9.B;
import Y9.C0650f;
import Y9.C0661q;
import Y9.H;
import Y9.InterfaceC0666w;
import Y9.O;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0666w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7946a;
    private static final W9.f descriptor;

    static {
        e eVar = new e();
        f7946a = eVar;
        O o10 = new O("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        o10.l("sessionsEnabled", false);
        o10.l("sessionSamplingRate", false);
        o10.l("sessionTimeoutSeconds", false);
        o10.l("cacheDurationSeconds", false);
        o10.l("cacheUpdatedTimeSeconds", false);
        descriptor = o10;
    }

    @Override // Y9.InterfaceC0666w
    public final U9.a[] a() {
        U9.a aVarC = B1.C(C0650f.f10509a);
        U9.a aVarC2 = B1.C(C0661q.f10541a);
        B b5 = B.f10451a;
        return new U9.a[]{aVarC, aVarC2, B1.C(b5), B1.C(b5), B1.C(H.f10461a)};
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        g gVar = (g) obj;
        p251z9.j.e(gVar, "value");
        W9.f fVar = descriptor;
        p009aa.n nVarA = nVar.a(fVar);
        nVarA.n(fVar, 0, C0650f.f10509a, gVar.f7947a);
        nVarA.n(fVar, 1, C0661q.f10541a, gVar.f7948b);
        B b5 = B.f10451a;
        nVarA.n(fVar, 2, b5, gVar.f7949c);
        nVarA.n(fVar, 3, b5, gVar.f7950d);
        nVarA.n(fVar, 4, H.f10461a, gVar.f7951e);
        nVarA.t(fVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVar = descriptor;
        X9.a aVarD = bVar.d(fVar);
        int i10 = 0;
        Boolean bool = null;
        Double d5 = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z10 = true;
        while (z10) {
            int iH = aVarD.h(fVar);
            if (iH == -1) {
                z10 = false;
            } else if (iH == 0) {
                bool = (Boolean) aVarD.x(fVar, 0, C0650f.f10509a, bool);
                i10 |= 1;
            } else if (iH == 1) {
                d5 = (Double) aVarD.x(fVar, 1, C0661q.f10541a, d5);
                i10 |= 2;
            } else if (iH == 2) {
                num = (Integer) aVarD.x(fVar, 2, B.f10451a, num);
                i10 |= 4;
            } else if (iH == 3) {
                num2 = (Integer) aVarD.x(fVar, 3, B.f10451a, num2);
                i10 |= 8;
            } else {
                if (iH != 4) {
                    throw new U9.e(iH);
                }
                l10 = (Long) aVarD.x(fVar, 4, H.f10461a, l10);
                i10 |= 16;
            }
        }
        aVarD.t(fVar);
        return new g(i10, bool, d5, num, num2, l10);
    }

    @Override // U9.a
    public final W9.f d() {
        return descriptor;
    }
}
