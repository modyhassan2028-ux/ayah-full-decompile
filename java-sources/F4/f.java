package F4;

import F.u;
import K9.AbstractC0405x;
import K9.H;
import com.google.android.gms.internal.measurement.J1;
import java.util.List;
import p120l9.m;
import p124m3.j;
import p151p.C1256n;
import p207v2.Y;
import p207v2.Z;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1 f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2395c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(C1256n c1256n) {
        this();
        this.f2394b = 0;
        this.f2395c = c1256n;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object a(Y y10, q9.c cVar) {
        e eVar;
        g gVar;
        int i10 = this.f2394b;
        Object z10 = p161p9.a.f21156r;
        switch (i10) {
            case 0:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i11 = eVar.f2392t;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        eVar.f2392t = i11 - Integer.MIN_VALUE;
                    } else {
                        eVar = new e(this, cVar);
                    }
                } else {
                    eVar = new e(this, cVar);
                }
                e eVar2 = eVar;
                Object objI = eVar2.f2390r;
                int i12 = eVar2.f2392t;
                ?? r10 = 0;
                r10 = 0;
                if (i12 == 0) {
                    p110k9.a.e(objI);
                    Integer num = (Integer) y10.a();
                    int iIntValue = num != null ? num.intValue() : 0;
                    R9.e eVar3 = H.f5322a;
                    R9.d dVar = R9.d.f7436t;
                    u uVar = new u(this, iIntValue, y10, r10, 1);
                    eVar2.f2392t = 1;
                    objI = AbstractC0405x.I(dVar, uVar, eVar2);
                    if (objI != z10) {
                    }
                    return z10;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(objI);
                List list = (List) objI;
                j jVar = (j) m.n0(list);
                Integer num2 = jVar != null ? new Integer(jVar.f19585a + 1) : null;
                if (num2 != null && num2.intValue() < 6236) {
                    r10 = num2;
                }
                z10 = new Z(list, r10, Integer.MIN_VALUE, Integer.MIN_VALUE);
                return z10;
            default:
                if (cVar instanceof g) {
                    gVar = (g) cVar;
                    int i13 = gVar.f2398t;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        gVar.f2398t = i13 - Integer.MIN_VALUE;
                    } else {
                        gVar = new g(this, cVar);
                    }
                } else {
                    gVar = new g(this, cVar);
                }
                g gVar2 = gVar;
                Object objI2 = gVar2.f2396r;
                int i14 = gVar2.f2398t;
                ?? r11 = 0;
                r11 = 0;
                if (i14 == 0) {
                    p110k9.a.e(objI2);
                    Integer num3 = (Integer) y10.a();
                    int iIntValue2 = num3 != null ? num3.intValue() : 1;
                    R9.e eVar4 = H.f5322a;
                    R9.d dVar2 = R9.d.f7436t;
                    u uVar2 = new u(this, iIntValue2, y10, r11, 2);
                    gVar2.f2398t = 1;
                    objI2 = AbstractC0405x.I(dVar2, uVar2, gVar2);
                    if (objI2 != z10) {
                    }
                    return z10;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(objI2);
                List list2 = (List) objI2;
                p124m3.d dVar3 = (p124m3.d) m.n0(list2);
                Integer num4 = dVar3 != null ? new Integer(dVar3.f19550b + 1) : null;
                if (num4 != null && num4.intValue() < 6236) {
                    r11 = num4;
                }
                z10 = new Z(list2, r11, Integer.MIN_VALUE, Integer.MIN_VALUE);
                return z10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(p218w3.f fVar) {
        this();
        this.f2394b = 1;
        p251z9.j.e(fVar, "pageModel");
        this.f2395c = fVar;
    }

    public f() {
        this.f2393a = new J1(6);
    }
}
