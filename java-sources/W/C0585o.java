package W;

import Z.C0698o;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: W.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585o extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z.X f9292s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0585o(Z.X x9, int i10) {
        super(2);
        this.f9291r = i10;
        this.f9292s = x9;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        int i10 = this.f9291r;
        p110k9.y yVar = p110k9.y.f19095a;
        Z.X x9 = this.f9292s;
        switch (i10) {
            case 0:
                p063g1.k kVar = (p063g1.k) obj;
                p063g1.k kVar2 = (p063g1.k) obj2;
                float f3 = J0.f8603a;
                int i11 = kVar2.f16256a;
                int i12 = kVar2.f16259d;
                int i13 = kVar2.f16258c;
                int i14 = kVar2.f16257b;
                int i15 = kVar.f16258c;
                int i16 = kVar.f16257b;
                int i17 = kVar.f16259d;
                int i18 = kVar.f16256a;
                float fMin2 = 1.0f;
                if (i11 >= i15) {
                    fMin = 0.0f;
                } else if (i13 <= i18) {
                    fMin = 1.0f;
                } else if (kVar2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(kVar.f16258c, i13) + Math.max(i18, i11)) / 2) - i11) / kVar2.d();
                }
                if (i14 >= i17) {
                    fMin2 = 0.0f;
                } else if (i12 > i16) {
                    if (kVar2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i17, i12) + Math.max(i16, i14)) / 2) - i14) / kVar2.b();
                    }
                }
                x9.setValue(new p180s0.M(p180s0.F.h(fMin, fMin2)));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    AbstractC0813f2.k(new AppendedSemanticsElement(p104k1.b.f18896s, false), (p241y9.e) x9.getValue(), c0698o, 0);
                }
                break;
        }
        return yVar;
    }
}
