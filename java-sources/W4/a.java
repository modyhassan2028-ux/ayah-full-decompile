package W4;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9599r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9603v;

    public /* synthetic */ a(int i10, int i11, int i12, r rVar, p241y9.a aVar) {
        this.f9600s = i10;
        this.f9601t = i11;
        this.f9602u = aVar;
        this.f9603v = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9599r) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = C0672b.y(1);
                Y2.a.a(this.f9600s, this.f9601t, (p241y9.a) this.f9602u, (r) this.f9603v, (C0698o) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = C0672b.y(this.f9601t | 1);
                Y4.a.a(this.f9600s, (String) this.f9602u, (p241y9.c) this.f9603v, (C0698o) obj, iY2);
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ a(int i10, String str, p241y9.c cVar, int i11) {
        this.f9600s = i10;
        this.f9602u = str;
        this.f9603v = cVar;
        this.f9601t = i11;
    }
}
