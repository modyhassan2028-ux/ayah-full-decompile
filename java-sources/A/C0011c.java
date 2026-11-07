package A;

/* JADX INFO: renamed from: A.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0011c implements InterfaceC0015e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f203b;

    public /* synthetic */ C0011c(int i10) {
        this.f203b = i10;
    }

    @Override // A.InterfaceC0015e
    public final float a(float f3, float f7, float f10) {
        switch (this.f203b) {
            case 0:
                InterfaceC0015e.f226a.getClass();
                float f11 = f7 + f3;
                if ((f3 >= 0.0f && f11 <= f10) || (f3 < 0.0f && f11 > f10)) {
                    return 0.0f;
                }
                float f12 = f11 - f10;
                return Math.abs(f3) < Math.abs(f12) ? f3 : f12;
            default:
                float fAbs = Math.abs((f7 + f3) - f3);
                float f13 = (0.3f * f10) - (0.0f * fAbs);
                float f14 = f10 - f13;
                if ((fAbs <= f10) && f14 < fAbs) {
                    f13 = f10 - fAbs;
                }
                return f3 - f13;
        }
    }
}
