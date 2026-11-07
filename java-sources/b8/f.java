package b8;

import com.google.android.gms.internal.measurement.C0902x2;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile C0902x2 f13332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f13333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13334t;

    @Override // b8.d
    public final Object get() {
        if (!this.f13333s) {
            synchronized (this) {
                try {
                    if (!this.f13333s) {
                        C0902x2 c0902x2 = this.f13332r;
                        Objects.requireNonNull(c0902x2);
                        Object obj = c0902x2.get();
                        this.f13334t = obj;
                        this.f13333s = true;
                        this.f13332r = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13334t;
    }

    public final String toString() {
        Object string = this.f13332r;
        if (string == null) {
            String strValueOf = String.valueOf(this.f13334t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
