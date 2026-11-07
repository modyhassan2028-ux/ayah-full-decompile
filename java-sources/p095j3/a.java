package p095j3;

import j$.time.LocalDate;
import j$.time.LocalTime;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f18752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalTime f18756f;

    public a(c cVar, LocalDate localDate, int i10, int i11, boolean z10, LocalTime localTime) {
        j.e(cVar, "khatmahPlan");
        this.f18751a = cVar;
        this.f18752b = localDate;
        this.f18753c = i10;
        this.f18754d = i11;
        this.f18755e = z10;
        this.f18756f = localTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18751a == aVar.f18751a && j.a(this.f18752b, aVar.f18752b) && this.f18753c == aVar.f18753c && this.f18754d == aVar.f18754d && this.f18755e == aVar.f18755e && j.a(this.f18756f, aVar.f18756f);
    }

    public final int hashCode() {
        return this.f18756f.hashCode() + ((((((((this.f18752b.hashCode() + (this.f18751a.hashCode() * 31)) * 31) + this.f18753c) * 31) + this.f18754d) * 31) + (this.f18755e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Khatmah(khatmahPlan=" + this.f18751a + ", startDate=" + this.f18752b + ", startingDayIndex=" + this.f18753c + ", currentDayIndex=" + this.f18754d + ", notificationEnabled=" + this.f18755e + ", notificationTime=" + this.f18756f + ")";
    }
}
