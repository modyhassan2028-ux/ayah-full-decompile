package p214w;

import Z.L0;
import p063g1.l;
import p063g1.m;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: w.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1400m extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23514r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1401n f23515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f23516t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400m(C1401n c1401n, c cVar) {
        super(1);
        this.f23515s = c1401n;
        this.f23516t = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23514r) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C1401n c1401n = this.f23515s;
                long j = iIntValue;
                return (Integer) this.f23516t.e(Integer.valueOf(((int) (C1401n.d(c1401n) >> 32)) - ((int) (c1401n.f23518b.a((j << 32) | (j & 4294967295L), C1401n.d(c1401n), m.f16261r) >> 32))));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C1401n c1401n2 = this.f23515s;
                L0 l10 = (L0) c1401n2.f23520d.g(c1401n2.f23517a.f24068d.getValue());
                long j10 = l10 != null ? ((l) l10.getValue()).f16260a : 0L;
                long j11 = iIntValue2;
                return (Integer) this.f23516t.e(Integer.valueOf((-((int) (c1401n2.f23518b.a((j11 & 4294967295L) | (j11 << 32), j10, m.f16261r) >> 32))) + ((int) (j10 >> 32))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400m(c cVar, C1401n c1401n) {
        super(1);
        this.f23516t = cVar;
        this.f23515s = c1401n;
    }
}
