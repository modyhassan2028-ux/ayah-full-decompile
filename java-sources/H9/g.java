package H9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f3625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3629v;

    public g(CharSequence charSequence) {
        p251z9.j.e(charSequence, "string");
        this.f3625r = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f3626s;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f3629v < 0) {
            this.f3626s = 2;
            return false;
        }
        CharSequence charSequence = this.f3625r;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f3627t; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f3626s = 1;
                this.f3629v = i10;
                this.f3628u = length;
                return true;
            }
        }
        i10 = -1;
        this.f3626s = 1;
        this.f3629v = i10;
        this.f3628u = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3626s = 0;
        int i10 = this.f3628u;
        int i11 = this.f3627t;
        this.f3627t = this.f3629v + i10;
        return this.f3625r.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
