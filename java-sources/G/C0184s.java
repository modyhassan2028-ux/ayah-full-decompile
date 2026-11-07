package G;

import p223x.C1411c;

/* JADX INFO: renamed from: G.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0184s extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f2730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2731t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0184s(Object obj, long j, int i10) {
        super(1);
        this.f2729r = i10;
        this.f2731t = obj;
        this.f2730s = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f2729r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f2731t;
        switch (i10) {
            case 0:
                C0185t c0185t = (C0185t) obj2;
                long jB = p063g1.j.b(((p063g1.j) ((C1411c) obj).d()).f16254a, this.f2730s);
                int i11 = C0185t.f2733t;
                c0185t.g(jB);
                c0185t.f2736c.invoke();
                break;
            default:
                p196u0.d dVar = (p196u0.d) obj;
                K.W w9 = (K.W) obj2;
                if (((Boolean) w9.f4569s.getValue()).booleanValue() || ((Boolean) w9.f4570t.getValue()).booleanValue()) {
                    p123m2.c.k(dVar, this.f2730s, 0L, 0L, 126);
                }
                break;
        }
        return yVar;
    }
}
