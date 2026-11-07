package G9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2923b;

    public c(i iVar, int i10) {
        p251z9.j.e(iVar, "sequence");
        this.f2922a = iVar;
        this.f2923b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // G9.d
    public final i a(int i10) {
        int i11 = this.f2923b + i10;
        return i11 < 0 ? new c(this, i10) : new c(this.f2922a, i11);
    }

    @Override // G9.i
    public final Iterator iterator() {
        return new b(this);
    }
}
