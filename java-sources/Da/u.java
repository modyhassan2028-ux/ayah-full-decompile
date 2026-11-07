package Da;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f1400f;
    public u g;

    public u() {
        this.f1395a = new byte[8192];
        this.f1399e = true;
        this.f1398d = false;
    }

    public final u a() {
        u uVar = this.f1400f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.g;
        p251z9.j.b(uVar2);
        uVar2.f1400f = this.f1400f;
        u uVar3 = this.f1400f;
        p251z9.j.b(uVar3);
        uVar3.g = this.g;
        this.f1400f = null;
        this.g = null;
        return uVar;
    }

    public final void b(u uVar) {
        p251z9.j.e(uVar, "segment");
        uVar.g = this;
        uVar.f1400f = this.f1400f;
        u uVar2 = this.f1400f;
        p251z9.j.b(uVar2);
        uVar2.g = uVar;
        this.f1400f = uVar;
    }

    public final u c() {
        this.f1398d = true;
        return new u(this.f1395a, this.f1396b, this.f1397c, true);
    }

    public final void d(u uVar, int i10) {
        p251z9.j.e(uVar, "sink");
        byte[] bArr = uVar.f1395a;
        if (!uVar.f1399e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = uVar.f1397c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (uVar.f1398d) {
                throw new IllegalArgumentException();
            }
            int i13 = uVar.f1396b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            p120l9.l.V(0, i13, i11, bArr, bArr);
            uVar.f1397c -= uVar.f1396b;
            uVar.f1396b = 0;
        }
        int i14 = uVar.f1397c;
        int i15 = this.f1396b;
        p120l9.l.V(i14, i15, i15 + i10, this.f1395a, bArr);
        uVar.f1397c += i10;
        this.f1396b += i10;
    }

    public u(byte[] bArr, int i10, int i11, boolean z10) {
        p251z9.j.e(bArr, "data");
        this.f1395a = bArr;
        this.f1396b = i10;
        this.f1397c = i11;
        this.f1398d = z10;
        this.f1399e = false;
    }
}
