package ka;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f19161k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f19162l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f19163m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f19164n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19170f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19172i;
    public final String j;

    public j(String str, String str2, long j, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f19165a = str;
        this.f19166b = str2;
        this.f19167c = j;
        this.f19168d = str3;
        this.f19169e = str4;
        this.f19170f = z10;
        this.g = z11;
        this.f19171h = z12;
        this.f19172i = z13;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p251z9.j.a(jVar.f19165a, this.f19165a) && p251z9.j.a(jVar.f19166b, this.f19166b) && jVar.f19167c == this.f19167c && p251z9.j.a(jVar.f19168d, this.f19168d) && p251z9.j.a(jVar.f19169e, this.f19169e) && jVar.f19170f == this.f19170f && jVar.g == this.g && jVar.f19171h == this.f19171h && jVar.f19172i == this.f19172i && p251z9.j.a(jVar.j, this.j);
    }

    public final int hashCode() {
        int iX = p245z2.a.x(this.f19166b, p245z2.a.x(this.f19165a, 527, 31), 31);
        long j = this.f19167c;
        int iX2 = (((((((p245z2.a.x(this.f19169e, p245z2.a.x(this.f19168d, (iX + ((int) (j ^ (j >>> 32)))) * 31, 31), 31) + (this.f19170f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.f19171h ? 1231 : 1237)) * 31) + (this.f19172i ? 1231 : 1237)) * 31;
        String str = this.j;
        return iX2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19165a);
        sb.append('=');
        sb.append(this.f19166b);
        if (this.f19171h) {
            long j = this.f19167c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) pa.b.f21168a.get()).format(new Date(j));
                p251z9.j.d(str, "format(...)");
                sb.append(str);
            }
        }
        if (!this.f19172i) {
            sb.append("; domain=");
            sb.append(this.f19168d);
        }
        sb.append("; path=");
        sb.append(this.f19169e);
        if (this.f19170f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
