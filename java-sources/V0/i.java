package V0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements CharacterIterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f8367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8369t = 0;

    public i(CharSequence charSequence, int i10) {
        this.f8367r = charSequence;
        this.f8368s = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f8369t;
        if (i10 == this.f8368s) {
            return (char) 65535;
        }
        return this.f8367r.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f8369t = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f8368s;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f8369t;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f8368s;
        if (i10 == 0) {
            this.f8369t = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f8369t = i11;
        return this.f8367r.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f8369t + 1;
        this.f8369t = i10;
        int i11 = this.f8368s;
        if (i10 < i11) {
            return this.f8367r.charAt(i10);
        }
        this.f8369t = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f8369t;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f8369t = i11;
        return this.f8367r.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f8368s || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f8369t = i10;
        return current();
    }
}
