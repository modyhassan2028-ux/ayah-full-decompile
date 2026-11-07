package p205v0;

import p110k9.y;
import p180s0.q;
import p196u0.d;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f23001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f23002t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23003r;

    static {
        int i10 = 1;
        f23001s = new a(i10, 0);
        f23002t = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f23003r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23003r) {
            case 0:
                break;
            default:
                p123m2.c.k((d) obj, q.f21843f, 0L, 0L, 126);
                break;
        }
        return y.f19095a;
    }
}
