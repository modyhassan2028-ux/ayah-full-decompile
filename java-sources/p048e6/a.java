package p048e6;

import j$.time.LocalDate;
import j$.time.chrono.HijrahDate;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HijrahDate f15824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15825c;

    public a(LocalDate localDate, HijrahDate hijrahDate, List list) {
        j.e(localDate, "date");
        this.f15823a = localDate;
        this.f15824b = hijrahDate;
        this.f15825c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f15823a, aVar.f15823a) && j.a(this.f15824b, aVar.f15824b) && j.a(this.f15825c, aVar.f15825c);
    }

    public final int hashCode() {
        return this.f15825c.hashCode() + ((this.f15824b.hashCode() + (this.f15823a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TodayInfo(date=" + this.f15823a + ", hijriDate=" + this.f15824b + ", items=" + this.f15825c + ")";
    }
}
