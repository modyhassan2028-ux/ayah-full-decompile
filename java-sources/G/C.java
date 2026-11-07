package G;

import D.C0068k;
import K.AbstractC0314h;
import U0.C0515g;
import W.AbstractC0542b2;
import Z.C0672b;
import Z.C0695m0;
import Z.C0698o;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import java.util.List;
import p223x.q0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2570u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, int i11, Object obj, Object obj2) {
        super(2);
        this.f2567r = i11;
        this.f2569t = obj;
        this.f2570u = obj2;
        this.f2568s = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2567r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    F.i iVar = (F.i) this.f2569t;
                    c0698o.T(-462424778);
                    I i10 = iVar.f2054a.f2023q;
                    int i11 = this.f2568s;
                    AbstractC0190y.b(this.f2570u, i11, i10, p074h0.j.d(-824725566, new C0068k(i11, 3, iVar), c0698o), c0698o, 3072);
                    c0698o.p(false);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0314h.a((C0515g) this.f2569t, (List) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                K.T.e((O.N) this.f2569t, (p074h0.d) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC0542b2.a((U0.L) this.f2569t, (p074h0.d) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                C0695m0[] c0695m0Arr = (C0695m0[]) this.f2569t;
                C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), (p241y9.e) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                C0672b.a((C0695m0) this.f2569t, (p241y9.e) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                ((p074h0.d) this.f2569t).c(this.f2570u, (C0698o) obj, C0672b.y(this.f2568s) | 1);
                break;
            case 7:
                ((Number) obj2).intValue();
                AbstractC0813f2.k((l0.r) this.f2569t, (p241y9.e) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                ((q0) this.f2569t).a(this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p171r0.f.a((l0.r) this.f2569t, (p241y9.c) this.f2570u, (C0698o) obj, C0672b.y(this.f2568s | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(int i10, F.i iVar, Object obj) {
        super(2);
        this.f2567r = 0;
        this.f2569t = iVar;
        this.f2568s = i10;
        this.f2570u = obj;
    }
}
