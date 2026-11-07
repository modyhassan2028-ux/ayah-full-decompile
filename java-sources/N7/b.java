package N7;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class b extends B0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f6049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f6050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6051f;

    public b(a aVar, Typeface typeface) {
        this.f6049d = typeface;
        this.f6050e = aVar;
    }

    @Override // B0.c
    public final void W(int i10) {
        if (this.f6051f) {
            return;
        }
        this.f6050e.y(this.f6049d);
    }

    @Override // B0.c
    public final void X(Typeface typeface, boolean z10) {
        if (this.f6051f) {
            return;
        }
        this.f6050e.y(typeface);
    }
}
