package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2 f9183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0554e2 f9184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9185u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(C2 c10, C0554e2 c0554e2, int i10, int i11) {
        super(2);
        this.f9182r = i11;
        this.f9183s = c10;
        this.f9184t = c0554e2;
        this.f9185u = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9182r;
        C0698o c0698o = (C0698o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                A2.a(this.f9183s, this.f9184t, c0698o, C0672b.y(this.f9185u | 1));
                break;
            case 1:
                A2.c(this.f9183s, this.f9184t, c0698o, C0672b.y(this.f9185u | 1));
                break;
            default:
                A2.i(this.f9183s, this.f9184t, c0698o, C0672b.y(this.f9185u | 1));
                break;
        }
        return p110k9.y.f19095a;
    }
}
