package s3;

import java.io.File;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f22130c;

    public b(String str, File file, String str2) {
        j.e(str, "id");
        j.e(str2, "date");
        this.f22128a = str;
        this.f22129b = str2;
        this.f22130c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f22128a, bVar.f22128a) && j.a(this.f22129b, bVar.f22129b) && j.a(this.f22130c, bVar.f22130c);
    }

    public final int hashCode() {
        return this.f22130c.hashCode() + p245z2.a.x(this.f22129b, this.f22128a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BookDownloadRequest(id=" + this.f22128a + ", date=" + this.f22129b + ", filePath=" + this.f22130c + ")";
    }
}
