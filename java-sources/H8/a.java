package H8;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3586b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3585a = str;
        this.f3586b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3585a.equals(aVar.f3585a) && this.f3586b.equals(aVar.f3586b);
    }

    public final int hashCode() {
        return ((this.f3585a.hashCode() ^ 1000003) * 1000003) ^ this.f3586b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3585a + ", usedDates=" + this.f3586b + "}";
    }
}
