package p122m0;

import J0.I;
import p110k9.y;
import p241y9.g;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f19460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f19461s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, I i10) {
        super(4);
        this.f19460r = dVar;
        this.f19461s = i10;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d dVar = this.f19460r;
        dVar.f19467f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        dVar.f19462a.h(dVar.f19464c, this.f19461s.f3926s, dVar.f19467f);
        return y.f19095a;
    }
}
