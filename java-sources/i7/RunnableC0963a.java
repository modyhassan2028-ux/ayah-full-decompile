package i7;

import j$.util.Objects;
import u.C1350e;

/* JADX INFO: renamed from: i7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0963a implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f17249u;

    public /* synthetic */ RunnableC0963a(A a9, String str, long j, int i10) {
        this.f17246r = i10;
        this.f17247s = str;
        this.f17248t = j;
        this.f17249u = a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17246r) {
            case 0:
                A a9 = (A) this.f17249u;
                String str = (String) this.f17247s;
                a9.o();
                U6.y.c(str);
                C1350e c1350e = a9.f16808t;
                boolean zIsEmpty = c1350e.isEmpty();
                long j = this.f17248t;
                if (zIsEmpty) {
                    a9.f16809u = j;
                }
                Integer num = (Integer) c1350e.get(str);
                if (num != null) {
                    c1350e.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c1350e.f22703t < 100) {
                    c1350e.put(str, 1);
                    a9.f16807s.put(str, Long.valueOf(j));
                } else {
                    X x9 = ((C1023u0) a9.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17185z.a("Too many ads visible");
                }
                break;
            case 1:
                A a10 = (A) this.f17249u;
                String str2 = (String) this.f17247s;
                C1023u0 c1023u0 = (C1023u0) a10.f16104r;
                a10.o();
                U6.y.c(str2);
                C1350e c1350e2 = a10.f16808t;
                Integer num2 = (Integer) c1350e2.get(str2);
                if (num2 == null) {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    C0992j1 c0992j1 = c1023u0.f17565C;
                    X x11 = c1023u0.f17584w;
                    C1023u0.l(c0992j1);
                    C0983g1 c0983g1U = c0992j1.u(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c1350e2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        c1350e2.remove(str2);
                        C1350e c1350e3 = a10.f16807s;
                        Long l10 = (Long) c1350e3.get(str2);
                        long j10 = this.f17248t;
                        if (l10 == null) {
                            C1023u0.m(x11);
                            x11.f17182w.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l10.longValue();
                            c1350e3.remove(str2);
                            a10.t(str2, jLongValue, c0983g1U);
                        }
                        if (c1350e2.isEmpty()) {
                            long j11 = a10.f16809u;
                            if (j11 != 0) {
                                a10.s(j10 - j11, c0983g1U);
                                a10.f16809u = 0L;
                            } else {
                                C1023u0.m(x11);
                                x11.f17182w.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                C0992j1 c0992j2 = (C0992j1) this.f17249u;
                c0992j2.s((C0983g1) this.f17247s, false, this.f17248t);
                c0992j2.f17430v = null;
                C1021t1 c1021t1P = ((C1023u0) c0992j2.f16104r).p();
                c1021t1P.o();
                c1021t1P.p();
                c1021t1P.C(new p039d8.a(c1021t1P, (C0983g1) null));
                break;
        }
    }

    public RunnableC0963a(C0992j1 c0992j1, C0983g1 c0983g1, long j) {
        this.f17246r = 2;
        this.f17247s = c0983g1;
        this.f17248t = j;
        Objects.requireNonNull(c0992j1);
        this.f17249u = c0992j1;
    }
}
