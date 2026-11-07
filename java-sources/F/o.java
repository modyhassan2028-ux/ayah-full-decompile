package F;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f2082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f2083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o f2084u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2085r;

    static {
        int i10 = 1;
        f2082s = new o(i10, 0);
        f2083t = new o(i10, 1);
        f2084u = new o(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11) {
        super(i10);
        this.f2085r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2085r) {
            case 0:
                return p110k9.y.f19095a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new A(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
