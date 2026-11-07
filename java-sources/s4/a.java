package s4;

import android.graphics.Bitmap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f22131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22134d;

    public a(Bitmap bitmap, String str, boolean z10, boolean z11) {
        this.f22131a = bitmap;
        this.f22132b = str;
        this.f22133c = z10;
        this.f22134d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f22131a, aVar.f22131a) && j.a(this.f22132b, aVar.f22132b) && this.f22133c == aVar.f22133c && this.f22134d == aVar.f22134d;
    }

    public final int hashCode() {
        return ((p245z2.a.x(this.f22132b, this.f22131a.hashCode() * 31, 31) + (this.f22133c ? 1231 : 1237)) * 31) + (this.f22134d ? 1231 : 1237);
    }

    public final String toString() {
        return "AlbumArt(bitmap=" + this.f22131a + ", reciterName=" + this.f22132b + ", isArabic=" + this.f22133c + ", isDarkMode=" + this.f22134d + ")";
    }
}
