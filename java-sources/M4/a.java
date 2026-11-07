package M4;

import D.P;
import N9.U;
import W.Q;
import W.S;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.X;
import com.google.android.gms.internal.measurement.B1;
import j$.time.LocalTime;
import java.util.List;
import l0.r;
import p110k9.y;
import p173r2.A;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f5688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5691v;

    public /* synthetic */ a(M3.a aVar, X x9, X x10, p241y9.e eVar) {
        this.f5687r = 1;
        this.f5688s = eVar;
        this.f5689t = aVar;
        this.f5690u = x9;
        this.f5691v = x10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f5687r;
        y yVar = y.f19095a;
        Object obj3 = this.f5691v;
        p110k9.e eVar = this.f5688s;
        Object obj4 = this.f5690u;
        Object obj5 = this.f5689t;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                B1.b((U) obj5, (H2.j) obj4, (p241y9.e) eVar, (p241y9.e) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 1:
                p241y9.e eVar2 = (p241y9.e) eVar;
                M3.a aVar = (M3.a) obj5;
                X x9 = (X) obj4;
                X x10 = (X) obj3;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    P p10 = S.f8804a;
                    Q qD = S.d(0L, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l(), c0698o, 13);
                    boolean zG = c0698o.g(eVar2) | c0698o.e(aVar.ordinal());
                    Object objH = c0698o.H();
                    if (zG || objH == C0690k.f10683a) {
                        objH = new P3.a(aVar, x9, x10, eVar2);
                        c0698o.e0(objH);
                    }
                    V0.k((p241y9.a) objH, null, false, null, qD, null, P3.e.f6630a, c0698o, 805306368, 494);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                P3.e.a((String) obj5, (M3.a) obj4, (p241y9.e) eVar, (r) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                Y4.a.c((p095j3.c) obj5, (p241y9.e) eVar, (p241y9.e) obj3, (r) obj4, (C0698o) obj, C0672b.y(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                Y4.a.d((A) obj5, (p241y9.e) eVar, (p241y9.e) obj3, (p241y9.a) obj4, (C0698o) obj, C0672b.y(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                Y4.a.e((List) obj5, (p241y9.c) obj4, (p241y9.c) eVar, (r) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                p015b4.f.b((String) obj5, (String) obj4, (p241y9.a) eVar, (p241y9.a) obj3, (C0698o) obj, C0672b.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                p015b4.f.l((String) obj5, (LocalTime) obj4, (p241y9.a) eVar, (p241y9.c) obj3, (C0698o) obj, C0672b.y(385));
                break;
        }
        return yVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, p110k9.e eVar, Object obj3, int i10, int i11) {
        this.f5687r = i11;
        this.f5689t = obj;
        this.f5690u = obj2;
        this.f5688s = eVar;
        this.f5691v = obj3;
    }

    public /* synthetic */ a(Object obj, p241y9.e eVar, p241y9.e eVar2, Object obj2, int i10, int i11) {
        this.f5687r = i11;
        this.f5689t = obj;
        this.f5688s = eVar;
        this.f5691v = eVar2;
        this.f5690u = obj2;
    }
}
