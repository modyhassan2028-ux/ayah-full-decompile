package K;

import A.C0023i;
import O.InterfaceC0444l;
import W.C0610w1;
import W.V0;
import Z.C0672b;
import Z.C0698o;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4811v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f4807r = i11;
        this.f4809t = obj;
        this.f4810u = obj2;
        this.f4811v = obj3;
        this.f4808s = i10;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [y9.a, z9.k] */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4807r) {
            case 0:
                ((Number) obj2).intValue();
                w0 w0Var = (w0) this.f4809t;
                Object[] objArr = (Object[]) this.f4810u;
                w0Var.b(Arrays.copyOf(objArr, objArr.length), (p241y9.c) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                B9.a.b((InterfaceC0444l) this.f4809t, (l0.e) this.f4810u, (p074h0.d) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                V0.j((C0610w1) this.f4809t, (l0.r) this.f4810u, (p241y9.f) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                p074h0.d dVar = (p074h0.d) this.f4809t;
                int iY = C0672b.y(this.f4808s) | 1;
                dVar.f(this.f4810u, this.f4811v, (C0698o) obj, iY);
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC0813f2.a((p241y9.a) this.f4809t, (p104k1.n) this.f4810u, (p074h0.d) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                p242z.j jVar = (p242z.j) this.f4809t;
                p241y9.a aVar = (p241y9.a) this.f4810u;
                C0023i c0023i = (C0023i) this.f4811v;
                p171r0.a.a(jVar, aVar, l0.o.f19333a, c0023i, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                p242z.k.b((String) this.f4809t, (p242z.a) this.f4810u, (p251z9.k) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p242z.k.c((p104k1.s) this.f4809t, (p241y9.a) this.f4810u, (C0023i) this.f4811v, (C0698o) obj, C0672b.y(this.f4808s | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(String str, p242z.a aVar, p241y9.a aVar2, int i10) {
        super(2);
        this.f4807r = 6;
        this.f4809t = str;
        this.f4810u = aVar;
        this.f4811v = (p251z9.k) aVar2;
        this.f4808s = i10;
    }
}
