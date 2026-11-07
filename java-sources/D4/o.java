package D4;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1223r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f1227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1228w;

    public /* synthetic */ o(int i10, int i11, int i12, r rVar, p241y9.a aVar) {
        this.f1224s = i10;
        this.f1227v = aVar;
        this.f1228w = rVar;
        this.f1225t = i11;
        this.f1226u = i12;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1223r) {
            case 0:
                ((Integer) obj2).getClass();
                k.e(this.f1224s, this.f1225t, (p241y9.c) this.f1227v, (p241y9.e) this.f1228w, (C0698o) obj, C0672b.y(this.f1226u | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                Y2.a.b(this.f1224s, (p241y9.a) this.f1227v, (r) this.f1228w, (C0698o) obj, C0672b.y(this.f1225t | 1), this.f1226u);
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ o(int i10, int i11, p241y9.c cVar, p241y9.e eVar, int i12) {
        this.f1224s = i10;
        this.f1225t = i11;
        this.f1227v = cVar;
        this.f1228w = eVar;
        this.f1226u = i12;
    }
}
