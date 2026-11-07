package p068g6;

import Z.C0672b;
import Z.C0698o;
import p110k9.y;
import p157p5.c;
import p241y9.a;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f16322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f16323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16324u;

    public /* synthetic */ d(String str, a aVar, int i10, int i11) {
        this.f16321r = i11;
        this.f16322s = str;
        this.f16323t = aVar;
        this.f16324u = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16321r;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                b.c(this.f16322s, this.f16323t, c0698o, C0672b.y(this.f16324u | 1));
                break;
            default:
                c.g(this.f16322s, this.f16323t, c0698o, C0672b.y(this.f16324u | 1));
                break;
        }
        return y.f19095a;
    }
}
