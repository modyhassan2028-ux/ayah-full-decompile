package W0;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L5.c f9485a;

    public a(L5.c cVar) {
        this.f9485a = cVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f9485a.e(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f9485a.g(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f9485a.h(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f9485a.d(i10);
    }
}
