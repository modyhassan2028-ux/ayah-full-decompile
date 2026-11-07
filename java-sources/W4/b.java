package W4;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p015b4.f;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9604r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f9606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f9610x;

    public /* synthetic */ b(String str, String str2, p241y9.a aVar, r rVar, int i10, int i11) {
        this.f9605s = str;
        this.f9609w = str2;
        this.f9610x = aVar;
        this.f9606t = rVar;
        this.f9607u = i10;
        this.f9608v = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9604r) {
            case 0:
                ((Integer) obj2).getClass();
                Y2.a.c(this.f9605s, (String) this.f9609w, (p241y9.a) this.f9610x, this.f9606t, (C0698o) obj, C0672b.y(this.f9607u | 1), this.f9608v);
                break;
            default:
                ((Integer) obj2).getClass();
                f.m(this.f9605s, this.f9606t, (p241y9.f) this.f9609w, (p074h0.d) this.f9610x, (C0698o) obj, C0672b.y(this.f9607u | 1), this.f9608v);
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ b(String str, r rVar, p241y9.f fVar, p074h0.d dVar, int i10, int i11) {
        this.f9605s = str;
        this.f9606t = rVar;
        this.f9609w = fVar;
        this.f9610x = dVar;
        this.f9607u = i10;
        this.f9608v = i11;
    }
}
