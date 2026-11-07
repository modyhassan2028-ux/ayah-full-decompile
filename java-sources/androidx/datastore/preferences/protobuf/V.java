package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0727a f12412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f12414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12415d;

    public V(AbstractC0746u abstractC0746u, String str, Object[] objArr) {
        this.f12412a = abstractC0746u;
        this.f12413b = str;
        this.f12414c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f12415d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f12415d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f12415d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
