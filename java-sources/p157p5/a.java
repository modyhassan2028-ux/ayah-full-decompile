package p157p5;

import Z.C0672b;
import Z.C0698o;
import p110k9.y;
import p136n5.d;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f20986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p136n5.e f20987t;

    public /* synthetic */ a(d dVar, p136n5.e eVar, int i10, int i11) {
        this.f20985r = i11;
        this.f20986s = dVar;
        this.f20987t = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f20985r;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                c.b(this.f20986s, this.f20987t, c0698o, C0672b.y(1));
                break;
            case 1:
                c.e(this.f20986s, this.f20987t, c0698o, C0672b.y(1));
                break;
            default:
                c.f(this.f20986s, this.f20987t, c0698o, C0672b.y(1));
                break;
        }
        return y.f19095a;
    }
}
