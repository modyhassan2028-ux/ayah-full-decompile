package p227x3;

import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24370b;

    public c(String str, String str2) {
        this.f24369a = str;
        this.f24370b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24369a.equals(cVar.f24369a) && this.f24370b.equals(cVar.f24370b);
    }

    public final int hashCode() {
        return this.f24370b.hashCode() + a.x(this.f24369a, 428178039, 31);
    }

    public final String toString() {
        return p123m2.c.t("Request(permission=android.permission.POST_NOTIFICATIONS, rationaleTitle=", this.f24369a, ", rationaleDescription=", this.f24370b, ")");
    }
}
