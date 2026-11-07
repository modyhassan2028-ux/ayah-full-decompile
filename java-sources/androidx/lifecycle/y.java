package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z0.B f12680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12682c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f12683d;

    public y(z zVar, Z0.B b5) {
        this.f12683d = zVar;
        this.f12680a = b5;
    }

    public final void a(boolean z10) {
        if (z10 == this.f12681b) {
            return;
        }
        this.f12681b = z10;
        int i10 = z10 ? 1 : -1;
        z zVar = this.f12683d;
        int i11 = zVar.f12686c;
        zVar.f12686c = i10 + i11;
        if (!zVar.f12687d) {
            zVar.f12687d = true;
            while (true) {
                try {
                    int i12 = zVar.f12686c;
                    if (i11 == i12) {
                        break;
                    } else {
                        i11 = i12;
                    }
                } catch (Throwable th) {
                    zVar.f12687d = false;
                    throw th;
                }
            }
            zVar.f12687d = false;
        }
        if (this.f12681b) {
            zVar.c(this);
        }
    }
}
