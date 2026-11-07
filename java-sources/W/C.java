package W;

import Z.C0698o;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f8481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8482t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(float f3, int i10, Object obj) {
        super(2);
        this.f8480r = i10;
        this.f8482t = obj;
        this.f8481s = f3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8480r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    ((p074h0.d) this.f8482t).d(androidx.compose.foundation.layout.b.b(0.0f, this.f8481s, 7), c0698o, 0);
                }
                return p110k9.y.f19095a;
            default:
                long j = ((p063g1.l) obj).f16260a;
                C0561g1 c0561g1 = (C0561g1) this.f8482t;
                J j10 = new J(c0561g1, p063g1.a.g(((p063g1.a) obj2).f16246a), this.f8481s, (int) (j & 4294967295L));
                X.u uVar = new X.u();
                j10.e(uVar);
                LinkedHashMap linkedHashMap = uVar.f9787a;
                X.F f3 = new X.F(linkedHashMap);
                EnumC0565h1 enumC0565h1 = (EnumC0565h1) c0561g1.f9137b.f9781h.getValue();
                int iOrdinal = enumC0565h1.ordinal();
                EnumC0565h1 enumC0565h2 = EnumC0565h1.f9158r;
                if (iOrdinal != 0) {
                    EnumC0565h1 enumC0565h3 = EnumC0565h1.f9160t;
                    EnumC0565h1 enumC0565h4 = EnumC0565h1.f9159s;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new A6.a();
                        }
                        if (linkedHashMap.containsKey(enumC0565h3)) {
                            enumC0565h1 = enumC0565h3;
                        } else if (linkedHashMap.containsKey(enumC0565h4)) {
                            enumC0565h1 = enumC0565h4;
                        } else if (linkedHashMap.containsKey(enumC0565h2)) {
                            enumC0565h1 = enumC0565h2;
                        }
                    } else if (linkedHashMap.containsKey(enumC0565h4)) {
                        enumC0565h1 = enumC0565h4;
                    } else if (linkedHashMap.containsKey(enumC0565h3)) {
                        enumC0565h1 = enumC0565h3;
                    } else if (linkedHashMap.containsKey(enumC0565h2)) {
                        enumC0565h1 = enumC0565h2;
                    }
                } else if (linkedHashMap.containsKey(enumC0565h2)) {
                    enumC0565h1 = enumC0565h2;
                }
                return new p110k9.j(f3, enumC0565h1);
        }
    }
}
