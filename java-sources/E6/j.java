package E6;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.c f1939c;

    public j(String str, byte[] bArr, B6.c cVar) {
        this.f1937a = str;
        this.f1938b = bArr;
        this.f1939c = cVar;
    }

    public static android.support.v4.media.session.r a() {
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(5, false);
        rVar.f11366u = B6.c.f644r;
        return rVar;
    }

    public final j b(B6.c cVar) {
        android.support.v4.media.session.r rVarA = a();
        rVarA.N(this.f1937a);
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        rVarA.f11366u = cVar;
        rVarA.f11365t = this.f1938b;
        return rVarA.x();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f1937a.equals(jVar.f1937a) && Arrays.equals(this.f1938b, jVar.f1938b) && this.f1939c.equals(jVar.f1939c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1937a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1938b)) * 1000003) ^ this.f1939c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f1938b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f1937a);
        sb.append(", ");
        sb.append(this.f1939c);
        sb.append(", ");
        return android.support.v4.media.session.p.B(sb, strEncodeToString, ")");
    }
}
