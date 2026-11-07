package M7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends va.g {
    @Override // va.g
    public final float A(j jVar) {
        return jVar.f5782F.f5798b * 10000.0f;
    }

    @Override // va.g
    public final void P(j jVar, float f3) {
        jVar.f5782F.f5798b = f3 / 10000.0f;
        jVar.invalidateSelf();
    }
}
