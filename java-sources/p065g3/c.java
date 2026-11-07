package p065g3;

import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f16288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f16289f;
    public final Object g;

    public c(String str, a aVar, int i10, int i11, double d5, double d9, List list) {
        j.e(str, "trackId");
        j.e(aVar, "reciter");
        this.f16284a = str;
        this.f16285b = aVar;
        this.f16286c = i10;
        this.f16287d = i11;
        this.f16288e = d5;
        this.f16289f = d9;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f16284a, cVar.f16284a) && j.a(this.f16285b, cVar.f16285b) && this.f16286c == cVar.f16286c && this.f16287d == cVar.f16287d && Double.compare(this.f16288e, cVar.f16288e) == 0 && Double.compare(this.f16289f, cVar.f16289f) == 0 && this.g.equals(cVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f16285b.hashCode() + (this.f16284a.hashCode() * 31)) * 31) + this.f16286c) * 31) + this.f16287d) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f16288e);
        int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f16289f);
        return this.g.hashCode() + ((i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "TrackDao(trackId=" + this.f16284a + ", reciter=" + this.f16285b + ", chapterNumber=" + this.f16286c + ", version=" + this.f16287d + ", startTime=" + this.f16288e + ", endTime=" + this.f16289f + ", timings=" + this.g + ")";
    }
}
