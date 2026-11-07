package p143o2;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20298c;

    public q(String str, int i10, int i11) {
        this.f20296a = str;
        this.f20297b = i10;
        this.f20298c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        int i10 = qVar.f20298c;
        String str = qVar.f20296a;
        int i11 = qVar.f20297b;
        int i12 = this.f20298c;
        String str2 = this.f20296a;
        int i13 = this.f20297b;
        if (i13 < 0 || i11 < 0) {
            return TextUtils.equals(str2, str) && i12 == i10;
        }
        return TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f20296a, Integer.valueOf(this.f20298c));
    }
}
