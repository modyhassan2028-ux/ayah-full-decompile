package p173r2;

import F9.n;
import android.os.Bundle;
import p251z9.j;

/* JADX INFO: renamed from: r2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1285e extends E {
    @Override // p173r2.E
    public final Object a(String str, Bundle bundle) {
        j.e(bundle, "bundle");
        float f3 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f3 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f3);
        }
        n.J(str);
        throw null;
    }

    @Override // p173r2.E
    public final String b() {
        return "float";
    }

    @Override // p173r2.E
    public final Object d(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // p173r2.E
    public final void e(Bundle bundle, String str, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        j.e(str, "key");
        bundle.putFloat(str, fFloatValue);
    }
}
