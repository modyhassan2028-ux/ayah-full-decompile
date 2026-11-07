package U5;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f8195s;

    public /* synthetic */ b(int i10, int i11, r rVar) {
        this.f8194r = i11;
        this.f8195s = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f8194r;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a.b(this.f8195s, c0698o, C0672b.y(1));
                break;
            default:
                p068g6.b.g(this.f8195s, c0698o, C0672b.y(7));
                break;
        }
        return y.f19095a;
    }
}
