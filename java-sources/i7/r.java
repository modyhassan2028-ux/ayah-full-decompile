package i7;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17526f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f17527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f17528i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f17529k;

    public r(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        U6.y.c(str);
        U6.y.c(str2);
        U6.y.a(j >= 0);
        U6.y.a(j10 >= 0);
        U6.y.a(j11 >= 0);
        U6.y.a(j13 >= 0);
        this.f17521a = str;
        this.f17522b = str2;
        this.f17523c = j;
        this.f17524d = j10;
        this.f17525e = j11;
        this.f17526f = j12;
        this.g = j13;
        this.f17527h = l10;
        this.f17528i = l11;
        this.j = l12;
        this.f17529k = bool;
    }

    public final r a(long j) {
        return new r(this.f17521a, this.f17522b, this.f17523c, this.f17524d, this.f17525e, j, this.g, this.f17527h, this.f17528i, this.j, this.f17529k);
    }

    public final r b(Long l10, Long l11, Boolean bool) {
        return new r(this.f17521a, this.f17522b, this.f17523c, this.f17524d, this.f17525e, this.f17526f, this.g, this.f17527h, l10, l11, bool);
    }
}
