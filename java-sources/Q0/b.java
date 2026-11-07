package Q0;

import p110k9.y;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f6825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f6826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f6827u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6828r;

    static {
        int i10 = 1;
        f6825s = new b(i10, 0);
        f6826t = new b(i10, 1);
        f6827u = new b(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f6828r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f6828r) {
            case 0:
                ((Number) obj).longValue();
                return y.f19095a;
            case 1:
                return Integer.valueOf(((i) obj).f6848b);
            default:
                return Integer.valueOf(((i) obj).f6849c.b());
        }
    }
}
