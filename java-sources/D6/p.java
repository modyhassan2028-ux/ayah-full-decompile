package D6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1305b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f1304a = bArr;
        this.f1305b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            boolean z10 = c10 instanceof p;
            p pVar = (p) c10;
            if (Arrays.equals(this.f1304a, z10 ? pVar.f1304a : pVar.f1304a)) {
                p pVar2 = (p) c10;
                if (Arrays.equals(this.f1305b, z10 ? pVar2.f1305b : pVar2.f1305b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f1304a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1305b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f1304a) + ", encryptedBlob=" + Arrays.toString(this.f1305b) + "}";
    }
}
