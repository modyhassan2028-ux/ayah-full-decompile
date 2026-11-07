package X4;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f9957u;

    public /* synthetic */ d(String str, String str2, r rVar, int i10, int i11) {
        this.f9954r = i11;
        this.f9955s = str;
        this.f9956t = str2;
        this.f9957u = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9954r;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a.e(this.f9955s, this.f9956t, this.f9957u, c0698o, C0672b.y(385));
                break;
            default:
                p015b4.f.g(this.f9955s, this.f9956t, this.f9957u, c0698o, C0672b.y(1));
                break;
        }
        return y.f19095a;
    }
}
