package p093j0;

import p063g1.l;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f18629s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(p241y9.c cVar, int i10) {
        super(1);
        this.f18628r = i10;
        this.f18629s = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long j;
        switch (this.f18628r) {
            case 0:
                m mVar = (m) obj;
                synchronized (n.f18661b) {
                    j = n.f18663d;
                    n.f18663d = 1 + j;
                }
                return new h(j, mVar, this.f18629s);
            case 1:
                long j10 = ((l) obj).f16260a;
                return new l((((long) ((Number) this.f18629s.e(Integer.valueOf((int) (j10 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j10 & 4294967295L)))));
            default:
                long j11 = ((l) obj).f16260a;
                return new l((((long) ((Number) this.f18629s.e(Integer.valueOf((int) (j11 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j11 & 4294967295L)))));
        }
    }
}
