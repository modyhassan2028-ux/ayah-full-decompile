package b8;

import com.google.android.gms.internal.measurement.C0902x2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0902x2 f13329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile transient boolean f13330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Object f13331t;

    public e(C0902x2 c0902x2) {
        this.f13329r = c0902x2;
    }

    @Override // b8.d
    public final Object get() {
        if (!this.f13330s) {
            synchronized (this) {
                try {
                    if (!this.f13330s) {
                        Object obj = this.f13329r.get();
                        this.f13331t = obj;
                        this.f13330s = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13331t;
    }

    public final String toString() {
        Object string;
        if (this.f13330s) {
            String strValueOf = String.valueOf(this.f13331t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f13329r;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
