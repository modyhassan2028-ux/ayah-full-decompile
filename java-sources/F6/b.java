package F6;

import android.content.Context;
import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.a f2410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N6.a f2411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2412d;

    public b(Context context, N6.a aVar, N6.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f2409a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f2410b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f2411c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f2412d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f2409a.equals(bVar.f2409a) && this.f2410b.equals(bVar.f2410b) && this.f2411c.equals(bVar.f2411c) && this.f2412d.equals(bVar.f2412d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f2409a.hashCode() ^ 1000003) * 1000003) ^ this.f2410b.hashCode()) * 1000003) ^ this.f2411c.hashCode()) * 1000003) ^ this.f2412d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f2409a);
        sb.append(", wallClock=");
        sb.append(this.f2410b);
        sb.append(", monotonicClock=");
        sb.append(this.f2411c);
        sb.append(", backendName=");
        return p.B(sb, this.f2412d, "}");
    }
}
