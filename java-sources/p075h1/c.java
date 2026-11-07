package p075h1;

import R7.f;
import java.util.Arrays;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f16433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f16434b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f16433a = fArr;
        this.f16434b = fArr2;
    }

    @Override // p075h1.a
    public final float a(float f3) {
        return f.f(f3, this.f16434b, this.f16433a);
    }

    @Override // p075h1.a
    public final float b(float f3) {
        return f.f(f3, this.f16433a, this.f16434b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f16433a, cVar.f16433a) && Arrays.equals(this.f16434b, cVar.f16434b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16434b) + (Arrays.hashCode(this.f16433a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f16433a);
        j.d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f16434b);
        j.d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
