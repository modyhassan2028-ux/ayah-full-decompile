package E6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.b f1947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1948b;

    public n(B6.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1947a = bVar;
        this.f1948b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f1947a.equals(nVar.f1947a)) {
            return Arrays.equals(this.f1948b, nVar.f1948b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1947a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1948b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1947a + ", bytes=[...]}";
    }
}
