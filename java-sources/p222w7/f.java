package p222w7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23769b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f23771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f23772e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23770c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23773f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23774h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23775i = -1;

    public f(float f3, float f7) {
        this.f23768a = f3;
        this.f23769b = f7;
    }

    public final void a(float f3, float f7, float f10, boolean z10, boolean z11) {
        float fAbs;
        float f11 = f10 / 2.0f;
        float f12 = f3 - f11;
        float f13 = f11 + f3;
        float f14 = this.f23769b;
        if (f13 > f14) {
            fAbs = Math.abs(f13 - Math.max(f13 - f10, f14));
        } else {
            fAbs = 0.0f;
            if (f12 < 0.0f) {
                fAbs = Math.abs(f12 - Math.min(f12 + f10, 0.0f));
            }
        }
        b(f3, f7, f10, z10, z11, fAbs, 0.0f, 0.0f);
    }

    public final void b(float f3, float f7, float f10, boolean z10, boolean z11, float f11, float f12, float f13) {
        if (f10 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.f23770c;
        if (z11) {
            if (z10) {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
            int i10 = this.f23775i;
            if (i10 != -1 && i10 != 0) {
                throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
            }
            this.f23775i = arrayList.size();
        }
        g gVar = new g(Float.MIN_VALUE, f3, f7, f10, z11, f11, f12, f13);
        if (z10) {
            if (this.f23771d == null) {
                this.f23771d = gVar;
                this.f23773f = arrayList.size();
            }
            if (this.g != -1 && arrayList.size() - this.g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f10 != this.f23771d.f23779d) {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
            this.f23772e = gVar;
            this.g = arrayList.size();
        } else {
            if (this.f23771d == null && f10 < this.f23774h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.f23772e != null && f10 > this.f23774h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.f23774h = f10;
        arrayList.add(gVar);
    }

    public final void c(float f3, float f7, float f10, int i10, boolean z10) {
        if (i10 <= 0 || f10 <= 0.0f) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            a((i11 * f10) + f3, f7, f10, z10, false);
        }
    }

    public final h d() {
        if (this.f23771d == null) {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f23770c;
            int size = arrayList2.size();
            float f3 = this.f23768a;
            if (i10 >= size) {
                return new h(f3, arrayList, this.f23773f, this.g);
            }
            g gVar = (g) arrayList2.get(i10);
            arrayList.add(new g((i10 * f3) + (this.f23771d.f23777b - (this.f23773f * f3)), gVar.f23777b, gVar.f23778c, gVar.f23779d, gVar.f23780e, gVar.f23781f, gVar.g, gVar.f23782h));
            i10++;
        }
    }
}
