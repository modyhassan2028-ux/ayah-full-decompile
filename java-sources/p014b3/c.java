package p014b3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l, p017b7.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13208r;

    @Override // p017b7.c
    public int c(Context context, String str) {
        return this.f13208r;
    }

    @Override // p017b7.c
    public int j(Context context, String str, boolean z10) {
        return 0;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Margin must be non-negative");
        }
        this.f13208r = i10;
    }
}
