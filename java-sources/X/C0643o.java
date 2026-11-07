package X;

import Z.C0681f0;

/* JADX INFO: renamed from: X.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643o extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f9766s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0643o(s sVar, int i10) {
        super(0);
        this.f9765r = i10;
        this.f9766s = sVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f9765r) {
            case 0:
                return this.f9766s.d();
            case 1:
                s sVar = this.f9766s;
                return new p110k9.j(sVar.d(), sVar.f9781h.getValue());
            case 2:
                s sVar2 = this.f9766s;
                Object value = sVar2.f9783k.getValue();
                if (value != null) {
                    return value;
                }
                float fG = sVar2.f9782i.g();
                C0681f0 c0681f0 = sVar2.g;
                if (Float.isNaN(fG)) {
                    return c0681f0.getValue();
                }
                Object value2 = c0681f0.getValue();
                F fD = sVar2.d();
                float fD2 = fD.d(value2);
                if (fD2 != fG && !Float.isNaN(fD2)) {
                    if (fD2 < fG) {
                        Object objB = fD.b(fG, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = fD.b(fG, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            default:
                s sVar3 = this.f9766s;
                Object value3 = sVar3.f9783k.getValue();
                if (value3 != null) {
                    return value3;
                }
                float fG2 = sVar3.f9782i.g();
                C0681f0 c0681f1 = sVar3.g;
                return !Float.isNaN(fG2) ? sVar3.c(fG2, 0.0f, c0681f1.getValue()) : c0681f1.getValue();
        }
    }
}
