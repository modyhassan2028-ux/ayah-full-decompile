package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1082a3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1078a f18433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Supplier f18434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f18435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1136l2 f18436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BooleanSupplier f18437f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractC1088c f18438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18439i;

    public abstract void d();

    public abstract AbstractC1082a3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    public AbstractC1082a3(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10) {
        this.f18433b = abstractC1078a;
        this.f18434c = supplier;
        this.f18435d = null;
        this.f18432a = z10;
    }

    public AbstractC1082a3(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10) {
        this.f18433b = abstractC1078a;
        this.f18434c = null;
        this.f18435d = spliterator;
        this.f18432a = z10;
    }

    public final void c() {
        if (this.f18435d == null) {
            this.f18435d = (Spliterator) this.f18434c.get();
            this.f18434c = null;
        }
    }

    public final boolean a() {
        AbstractC1088c abstractC1088c = this.f18438h;
        if (abstractC1088c == null) {
            if (this.f18439i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.f18436e.c(this.f18435d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z10 = j < abstractC1088c.count();
        if (z10) {
            return z10;
        }
        this.g = 0L;
        this.f18438h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f18432a || this.f18438h != null || this.f18439i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f18435d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.f18438h.count() == 0) {
            if (this.f18436e.e() || !this.f18437f.getAsBoolean()) {
                if (this.f18439i) {
                    return false;
                }
                this.f18436e.end();
                this.f18439i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f18435d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (Y2.SIZED.v(this.f18433b.f18426m)) {
            return this.f18435d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i10 = this.f18433b.f18426m;
        int i11 = i10 & ((~i10) >> 1) & Y2.j & Y2.f18399f;
        return (i11 & 64) != 0 ? (i11 & (-16449)) | (this.f18435d.characteristics() & 16448) : i11;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f18435d);
    }
}
