package p122m0;

import android.graphics.Rect;
import p110k9.y;
import p241y9.g;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f19458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19459s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(4);
        this.f19458r = dVar;
        this.f19459s = i10;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d dVar = this.f19458r;
        dVar.f19462a.e(dVar.f19464c, this.f19459s, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return y.f19095a;
    }
}
