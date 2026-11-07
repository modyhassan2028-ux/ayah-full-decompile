package p185s8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22198b;

    public H(String str, byte[] bArr) {
        this.f22197a = str;
        this.f22198b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            H h7 = (H) s0Var;
            if (this.f22197a.equals(h7.f22197a)) {
                if (Arrays.equals(this.f22198b, s0Var instanceof H ? ((H) s0Var).f22198b : h7.f22198b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22197a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22198b);
    }

    public final String toString() {
        return "File{filename=" + this.f22197a + ", contents=" + Arrays.toString(this.f22198b) + "}";
    }
}
