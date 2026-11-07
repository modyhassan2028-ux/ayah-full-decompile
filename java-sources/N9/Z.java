package N9;

import K9.C0389g;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends O9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0389g f6151b;

    @Override // O9.d
    public final boolean a(O9.b bVar) {
        Y y10 = (Y) bVar;
        if (this.f6150a >= 0) {
            return false;
        }
        long j = y10.f6149z;
        if (j < y10.f6142A) {
            y10.f6142A = j;
        }
        this.f6150a = j;
        return true;
    }

    @Override // O9.d
    public final p150o9.c[] b(O9.b bVar) {
        long j = this.f6150a;
        this.f6150a = -1L;
        this.f6151b = null;
        return ((Y) bVar).x(j);
    }
}
