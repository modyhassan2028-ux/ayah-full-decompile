package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17978b;

    public /* synthetic */ l(int i10, int i11) {
        this.f17977a = i11;
        this.f17978b = i10;
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        switch (this.f17977a) {
            case 0:
                int i10 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i11 = this.f17978b;
                if (i10 == i11) {
                    return temporal;
                }
                int i12 = i10 - i11;
                return temporal.d(i12 >= 0 ? 7 - i12 : -i12, ChronoUnit.DAYS);
            default:
                int i13 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i14 = this.f17978b;
                if (i13 == i14) {
                    return temporal;
                }
                int i15 = i14 - i13;
                return temporal.t(i15 >= 0 ? 7 - i15 : -i15, ChronoUnit.DAYS);
        }
    }
}
