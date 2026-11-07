package D4;

import Z.C0672b;
import Z.C0698o;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f1220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f1221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1222v;

    public /* synthetic */ n(int i10, p241y9.c cVar, p241y9.c cVar2, int i11, int i12) {
        this.f1218r = i12;
        this.f1219s = i10;
        this.f1220t = cVar;
        this.f1221u = cVar2;
        this.f1222v = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        Integer num = (Integer) obj2;
        switch (this.f1218r) {
            case 0:
                num.intValue();
                k.d(this.f1219s, this.f1220t, this.f1221u, c0698o, C0672b.y(this.f1222v | 1));
                break;
            default:
                num.getClass();
                p191t5.a.f(this.f1219s, this.f1220t, this.f1221u, c0698o, C0672b.y(this.f1222v | 1));
                break;
        }
        return y.f19095a;
    }
}
