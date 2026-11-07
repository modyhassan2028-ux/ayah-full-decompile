package M;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f5587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f5588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f5589u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5590r;

    static {
        int i10 = 1;
        f5587s = new a(i10, 0);
        f5588t = new a(i10, 1);
        f5589u = new a(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f5590r = i11;
    }

    @Override // p241y9.c
    public final /* synthetic */ Object e(Object obj) {
        switch (this.f5590r) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i10 = ((Z0.j) obj).f10928a;
                break;
        }
        return y.f19095a;
    }
}
