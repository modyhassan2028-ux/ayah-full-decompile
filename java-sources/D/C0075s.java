package D;

import A.C0023i;
import H0.InterfaceC0205d;
import J0.AbstractC0283f;
import java.io.Serializable;

/* JADX INFO: renamed from: D.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075s extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Serializable f1025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075s(p162q0.u uVar, p162q0.t tVar, p162q0.t tVar2, Object obj, int i10, C0023i c0023i, int i11) {
        super(1);
        this.f1020r = i11;
        this.f1022t = tVar;
        this.f1023u = tVar2;
        this.f1024v = obj;
        this.f1021s = i10;
        this.f1025w = c0023i;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f1020r) {
            case 0:
                H0.T t2 = (H0.T) obj;
                H0.U[] uArr = (H0.U[]) this.f1022t;
                C0076t c0076t = (C0076t) this.f1023u;
                H0.K k7 = (H0.K) this.f1024v;
                int[] iArr = (int[]) this.f1025w;
                int length = uArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    H0.U u8 = uArr[i10];
                    int i12 = i11 + 1;
                    p251z9.j.b(u8);
                    Object objI = u8.i();
                    T t10 = objI instanceof T ? (T) objI : null;
                    p063g1.m layoutDirection = k7.getLayoutDirection();
                    AbstractC0060c abstractC0060c = t10 != null ? t10.f915c : null;
                    int i13 = this.f1021s;
                    t2.d(u8, abstractC0060c != null ? abstractC0060c.b(i13 - u8.f3168r, layoutDirection) : c0076t.f1027b.a(0, i13 - u8.f3168r, layoutDirection), iArr[i11], 0.0f);
                    i10++;
                    i11 = i12;
                }
                return p110k9.y.f19095a;
            case 1:
                InterfaceC0205d interfaceC0205d = (InterfaceC0205d) obj;
                p162q0.t tVar = (p162q0.t) this.f1023u;
                if (((p162q0.t) this.f1022t) != ((p162q0.k) AbstractC0283f.y(tVar).getFocusOwner()).f21209l) {
                    return Boolean.TRUE;
                }
                boolean zC = p162q0.f.C(tVar, (p162q0.t) this.f1024v, this.f1021s, (C0023i) this.f1025w);
                Boolean boolValueOf = Boolean.valueOf(zC);
                if (zC || !interfaceC0205d.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC0205d interfaceC0205d2 = (InterfaceC0205d) obj;
                p162q0.t tVar2 = (p162q0.t) this.f1023u;
                if (((p162q0.t) this.f1022t) != ((p162q0.k) AbstractC0283f.y(tVar2).getFocusOwner()).f21209l) {
                    return Boolean.TRUE;
                }
                boolean zB = p162q0.f.B(this.f1021s, (C0023i) this.f1025w, tVar2, (p171r0.e) this.f1024v);
                Boolean boolValueOf2 = Boolean.valueOf(zB);
                if (zB || !interfaceC0205d2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0075s(H0.U[] uArr, C0076t c0076t, int i10, H0.K k7, int[] iArr) {
        super(1);
        this.f1020r = 0;
        this.f1022t = uArr;
        this.f1023u = c0076t;
        this.f1021s = i10;
        this.f1024v = k7;
        this.f1025w = iArr;
    }
}
