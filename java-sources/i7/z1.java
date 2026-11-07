package i7;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends AbstractC1002n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, D0 d1, int i10) {
        super(d1);
        this.f17706e = i10;
        this.f17707f = obj;
    }

    @Override // i7.AbstractC1002n
    public final void a() {
        switch (this.f17706e) {
            case 0:
                A1 a9 = (A1) this.f17707f;
                B1 b5 = a9.f16819d;
                b5.o();
                C1023u0 c1023u0 = (C1023u0) b5.f16104r;
                c1023u0.f17564B.getClass();
                a9.a(SystemClock.elapsedRealtime(), false, false);
                A a10 = c1023u0.f17567E;
                C1023u0.j(a10);
                c1023u0.f17564B.getClass();
                a10.r(SystemClock.elapsedRealtime());
                break;
            case 1:
                G1 g10 = (G1) this.f17707f;
                g10.s();
                X x9 = ((C1023u0) g10.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17178E.a("Starting upload from DelayedRunnable");
                g10.f17001s.q();
                break;
            default:
                Q1 q10 = (Q1) this.f17707f;
                q10.c().o();
                String str = (String) q10.f17089H.pollFirst();
                if (str != null) {
                    q10.e().getClass();
                    q10.f17102Z = SystemClock.elapsedRealtime();
                    q10.b().f17178E.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Q1.S(q10.f17084C.f17579r, intent);
                }
                q10.H();
                break;
        }
    }
}
