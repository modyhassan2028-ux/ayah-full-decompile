package T8;

import Y9.M;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f7948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f7951e;

    public /* synthetic */ g(int i10, Boolean bool, Double d5, Integer num, Integer num2, Long l10) {
        if (31 != (i10 & 31)) {
            M.e(i10, 31, e.f7946a.d());
            throw null;
        }
        this.f7947a = bool;
        this.f7948b = d5;
        this.f7949c = num;
        this.f7950d = num2;
        this.f7951e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p251z9.j.a(this.f7947a, gVar.f7947a) && p251z9.j.a(this.f7948b, gVar.f7948b) && p251z9.j.a(this.f7949c, gVar.f7949c) && p251z9.j.a(this.f7950d, gVar.f7950d) && p251z9.j.a(this.f7951e, gVar.f7951e);
    }

    public final int hashCode() {
        Boolean bool = this.f7947a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d5 = this.f7948b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num = this.f7949c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7950d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f7951e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f7947a + ", sessionSamplingRate=" + this.f7948b + ", sessionTimeoutSeconds=" + this.f7949c + ", cacheDurationSeconds=" + this.f7950d + ", cacheUpdatedTimeSeconds=" + this.f7951e + ')';
    }

    public g(Boolean bool, Double d5, Integer num, Integer num2, Long l10) {
        this.f7947a = bool;
        this.f7948b = d5;
        this.f7949c = num;
        this.f7950d = num2;
        this.f7951e = l10;
    }
}
