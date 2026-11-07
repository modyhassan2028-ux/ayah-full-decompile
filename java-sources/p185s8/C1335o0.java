package p185s8;

import android.os.Build;

/* JADX INFO: renamed from: s8.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1335o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22438a;

    public C1335o0(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f22438a = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1335o0)) {
            return false;
        }
        C1335o0 c1335o0 = (C1335o0) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f22438a == c1335o0.f22438a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f22438a ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f22438a + "}";
    }
}
