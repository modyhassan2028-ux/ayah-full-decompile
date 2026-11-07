package com.squareup.moshi;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Da.x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f15466r;

    public p(q qVar) {
        this.f15466r = qVar;
    }

    @Override // Da.x
    public final void Z(long j, Da.h hVar) {
        this.f15466r.f15468y.Z(j, hVar);
    }

    @Override // Da.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVar = this.f15466r;
        if (qVar.E() != 9) {
            throw new AssertionError();
        }
        int i10 = qVar.f15483r;
        qVar.f15483r = i10 - 1;
        int[] iArr = qVar.f15486u;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
    }

    @Override // Da.x
    public final Da.A d() {
        return Da.A.f1341d;
    }

    @Override // Da.x, java.io.Flushable
    public final void flush() {
        this.f15466r.f15468y.flush();
    }
}
