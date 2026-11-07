package A5;

import D4.k;
import F9.n;
import Z.C0672b;
import Z.C0698o;
import com.ayah.R;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f544t;

    public /* synthetic */ b(int i10, int i11, Object obj) {
        this.f542r = i11;
        this.f544t = obj;
        this.f543s = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f542r) {
            case 0:
                ((Integer) obj2).getClass();
                e.a((p241y9.a) this.f544t, (C0698o) obj, C0672b.y(this.f543s | 1));
                break;
            case 1:
                r rVar = (r) this.f544t;
                ((Integer) obj2).getClass();
                k.f(this.f543s, C0672b.y(49), (C0698o) obj, rVar);
                break;
            case 2:
                String str = (String) this.f544t;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p015b4.f.d(str, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).k(), B9.a.j(R.color.background, c0698o), n.B(20), null, this.f543s, c0698o, 3072, 16);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            default:
                ((Integer) obj2).intValue();
                p157p5.c.c((p136n5.e) this.f544t, (C0698o) obj, C0672b.y(this.f543s | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ b(int i10, int i11, r rVar) {
        this.f542r = 1;
        this.f543s = i10;
        this.f544t = rVar;
    }
}
