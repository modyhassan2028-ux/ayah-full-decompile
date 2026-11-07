package p160p8;

import java.io.File;
import p185s8.B;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f21056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f21058c;

    public b(B b5, String str, File file) {
        this.f21056a = b5;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f21057b = str;
        this.f21058c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21056a.equals(bVar.f21056a) && this.f21057b.equals(bVar.f21057b) && this.f21058c.equals(bVar.f21058c);
    }

    public final int hashCode() {
        return ((((this.f21056a.hashCode() ^ 1000003) * 1000003) ^ this.f21057b.hashCode()) * 1000003) ^ this.f21058c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f21056a + ", sessionId=" + this.f21057b + ", reportFile=" + this.f21058c + "}";
    }
}
