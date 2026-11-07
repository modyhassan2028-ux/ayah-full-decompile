package p162q0;

import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f21210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f21211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f21212u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21213r;

    static {
        int i10 = 1;
        f21210s = new m(i10, 0);
        f21211t = new m(i10, 1);
        f21212u = new m(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f21213r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f21213r) {
            case 0:
                return y.f19095a;
            case 1:
                return y.f19095a;
            case 2:
                return Boolean.valueOf(((t) obj).z0(7));
            default:
                return Boolean.valueOf(((t) obj).z0(7));
        }
    }
}
