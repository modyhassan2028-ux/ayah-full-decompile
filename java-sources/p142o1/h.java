package p142o1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20246a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20250e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20255l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20247b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20248c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20249d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20251f = false;
    public final float[] g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f20252h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c[] f20253i = new c[16];
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20254k = 0;

    public h(int i10) {
        this.f20255l = i10;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.j;
            if (i10 >= i11) {
                c[] cVarArr = this.f20253i;
                if (i11 >= cVarArr.length) {
                    this.f20253i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f20253i;
                int i12 = this.j;
                cVarArr2[i12] = cVar;
                this.j = i12 + 1;
                return;
            }
            if (this.f20253i[i10] == cVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(c cVar) {
        int i10 = this.j;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f20253i[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f20253i;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.j--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f20255l = 5;
        this.f20249d = 0;
        this.f20247b = -1;
        this.f20248c = -1;
        this.f20250e = 0.0f;
        this.f20251f = false;
        int i10 = this.j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20253i[i11] = null;
        }
        this.j = 0;
        this.f20254k = 0;
        this.f20246a = false;
        Arrays.fill(this.f20252h, 0.0f);
    }

    public final void d(c cVar) {
        int i10 = this.j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20253i[i11].h(cVar, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f20247b;
    }
}
