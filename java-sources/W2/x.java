package W2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9590b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9589a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9591c = new ArrayList();

    public x(View view) {
        this.f9590b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f9590b == xVar.f9590b && this.f9589a.equals(xVar.f9589a);
    }

    public final int hashCode() {
        return this.f9589a.hashCode() + (this.f9590b.hashCode() * 31);
    }

    public final String toString() {
        String strZ = android.support.v4.media.session.p.z(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9590b + "\n", "    values:");
        HashMap map = this.f9589a;
        for (String str : map.keySet()) {
            strZ = strZ + "    " + str + ": " + map.get(str) + "\n";
        }
        return strZ;
    }
}
