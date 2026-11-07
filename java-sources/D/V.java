package D;

import A.EnumC0047u0;
import K.B0;
import K.r0;
import K.t0;
import W.AbstractC0567i;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f921v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(1);
        this.f917r = i11;
        this.f919t = obj;
        this.f920u = obj2;
        this.f921v = obj3;
        this.f918s = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f917r) {
            case 0:
                H0.T t2 = (H0.T) obj;
                H0.U[] uArr = (H0.U[]) this.f919t;
                W w9 = (W) this.f920u;
                int[] iArr = (int[]) this.f921v;
                int length = uArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    H0.U u8 = uArr[i10];
                    int i12 = i11 + 1;
                    p251z9.j.b(u8);
                    Object objI = u8.i();
                    T t10 = objI instanceof T ? (T) objI : null;
                    AbstractC0060c abstractC0060c = t10 != null ? t10.f915c : null;
                    int i13 = this.f918s;
                    t2.d(u8, iArr[i11], abstractC0060c != null ? abstractC0060c.b(i13 - u8.f3169s, p063g1.m.f16261r) : w9.f923b.a(0, i13 - u8.f3169s), 0.0f);
                    i10++;
                    i11 = i12;
                }
                return p110k9.y.f19095a;
            case 1:
                H0.T t11 = (H0.T) obj;
                H0.U u10 = (H0.U) this.f921v;
                H0.K k7 = (H0.K) this.f919t;
                K.N n6 = (K.N) this.f920u;
                int i14 = n6.f4492b;
                r0 r0Var = n6.f4491a;
                Z0.F f3 = n6.f4493c;
                t0 t0Var = (t0) n6.f4494d.invoke();
                r0Var.a(EnumC0047u0.f425s, K.T.l(k7, i14, f3, t0Var != null ? t0Var.f4794a : null, k7.getLayoutDirection() == p063g1.m.f16262s, u10.f3168r), this.f918s, u10.f3168r);
                H0.T.g(t11, u10, Math.round(-r0Var.f4766a.g()), 0);
                return p110k9.y.f19095a;
            case 2:
                H0.T t12 = (H0.T) obj;
                H0.U u11 = (H0.U) this.f921v;
                H0.K k10 = (H0.K) this.f919t;
                B0 b5 = (B0) this.f920u;
                int i15 = b5.f4442b;
                r0 r0Var2 = b5.f4441a;
                Z0.F f7 = b5.f4443c;
                t0 t0Var2 = (t0) b5.f4444d.invoke();
                r0Var2.a(EnumC0047u0.f424r, K.T.l(k10, i15, f7, t0Var2 != null ? t0Var2.f4794a : null, false, u11.f3168r), this.f918s, u11.f3169s);
                H0.T.g(t12, u11, 0, Math.round(-r0Var2.f4766a.g()));
                return p110k9.y.f19095a;
            case 3:
                H0.T t13 = (H0.T) obj;
                ArrayList arrayList = (ArrayList) this.f919t;
                H0.K k11 = (H0.K) this.f920u;
                float f10 = AbstractC0567i.f9168c;
                ArrayList arrayList2 = (ArrayList) this.f921v;
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    List list = (List) arrayList.get(i16);
                    int size2 = list.size();
                    int[] iArr2 = new int[size2];
                    int i17 = 0;
                    while (i17 < size2) {
                        iArr2[i17] = ((H0.U) list.get(i17)).f3168r + (i17 < AbstractC0813f2.E(list) ? k11.E(f10) : 0);
                        i17++;
                    }
                    C0059b c0059b = AbstractC0066i.f978b;
                    int[] iArr3 = new int[size2];
                    for (int i18 = 0; i18 < size2; i18++) {
                        iArr3[i18] = 0;
                    }
                    c0059b.b(k11, this.f918s, iArr2, k11.getLayoutDirection(), iArr3);
                    int size3 = list.size();
                    for (int i19 = 0; i19 < size3; i19++) {
                        t13.d((H0.U) list.get(i19), iArr3[i19], ((Number) arrayList2.get(i16)).intValue(), 0.0f);
                    }
                }
                return p110k9.y.f19095a;
            default:
                if (obj == ((Z.C) this.f919t)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof p093j0.v) {
                    int i20 = ((p074h0.e) this.f920u).f16416a;
                    u.z zVar = (u.z) this.f921v;
                    int i21 = i20 - this.f918s;
                    int iD = zVar.d(obj);
                    zVar.g(Math.min(i21, iD >= 0 ? zVar.f22786c[iD] : Integer.MAX_VALUE), obj);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ArrayList arrayList, H0.K k7, int i10, ArrayList arrayList2) {
        super(1);
        this.f917r = 3;
        float f3 = AbstractC0567i.f9166a;
        this.f919t = arrayList;
        this.f920u = k7;
        this.f918s = i10;
        this.f921v = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(H0.U[] uArr, W w9, int i10, int[] iArr) {
        super(1);
        this.f917r = 0;
        this.f919t = uArr;
        this.f920u = w9;
        this.f918s = i10;
        this.f921v = iArr;
    }
}
