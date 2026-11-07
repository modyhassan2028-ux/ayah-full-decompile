package p214w;

import p063g1.l;
import p223x.AbstractC1413d;
import p241y9.e;
import p251z9.k;

/* JADX INFO: renamed from: w.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393f extends k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1393f f23499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1393f f23500t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23501r;

    static {
        int i10 = 2;
        f23499s = new C1393f(i10, 0);
        f23500t = new C1393f(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1393f(int i10, int i11) {
        super(i10);
        this.f23501r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23501r) {
            case 0:
                long j = ((l) obj).f16260a;
                long j10 = ((l) obj2).f16260a;
                long j11 = 1;
                return AbstractC1413d.p(400.0f, 1, new l((j11 & 4294967295L) | (j11 << 32)));
            default:
                x xVar = (x) obj2;
                return Boolean.valueOf(((x) obj) == xVar && xVar == x.f23551t);
        }
    }
}
