package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0732f extends C0733g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12450w;

    public C0732f(byte[] bArr, int i10, int i11) {
        super(bArr);
        C0733g.c(i10, i10 + i11, bArr.length);
        this.f12449v = i10;
        this.f12450w = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.C0733g
    public final byte b(int i10) {
        int i11 = this.f12450w;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f12454s[this.f12449v + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(p123m2.c.r(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(android.support.v4.media.session.p.w(i10, i11, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0733g
    public final void e(int i10, byte[] bArr) {
        System.arraycopy(this.f12454s, this.f12449v, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C0733g
    public final int f() {
        return this.f12449v;
    }

    @Override // androidx.datastore.preferences.protobuf.C0733g
    public final byte g(int i10) {
        return this.f12454s[this.f12449v + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C0733g
    public final int size() {
        return this.f12450w;
    }
}
