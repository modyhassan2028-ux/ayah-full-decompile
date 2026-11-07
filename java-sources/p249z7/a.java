package p249z7;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements TypeEvaluator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24848b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24849a = new d();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        d dVar = (d) obj;
        d dVar2 = (d) obj2;
        float fP = p000a.a.P(dVar.f24852a, dVar2.f24852a, f3);
        float fP2 = p000a.a.P(dVar.f24853b, dVar2.f24853b, f3);
        float fP3 = p000a.a.P(dVar.f24854c, dVar2.f24854c, f3);
        d dVar3 = this.f24849a;
        dVar3.f24852a = fP;
        dVar3.f24853b = fP2;
        dVar3.f24854c = fP3;
        return dVar3;
    }
}
