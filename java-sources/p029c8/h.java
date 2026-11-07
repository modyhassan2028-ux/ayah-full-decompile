package p029c8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13555s;

    public h(Object obj) {
        this.f13555s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13554r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13554r) {
            throw new NoSuchElementException();
        }
        this.f13554r = true;
        return this.f13555s;
    }
}
