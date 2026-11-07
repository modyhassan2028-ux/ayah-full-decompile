package N9;

import A.C0030l0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6176a;

    @Override // N9.d0
    public final InterfaceC0415h a(O9.x xVar) {
        switch (this.f6176a) {
            case 0:
                return new C4.e(7, a0.f6156r);
            default:
                return new C4.e(new C0030l0(xVar, (p150o9.c) null, 26));
        }
    }

    public final String toString() {
        switch (this.f6176a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
