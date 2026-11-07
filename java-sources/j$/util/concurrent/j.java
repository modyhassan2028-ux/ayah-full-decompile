package j$.util.concurrent;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18101i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i10, int i11, int i12, long j, int i13) {
        super(lVarArr, i10, i11, i12);
        this.f18101i = i13;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f18101i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f18101i) {
            case 0:
                break;
        }
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f18101i) {
            case 0:
                break;
        }
        return AbstractC1062c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f18101i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f18101i) {
            case 0:
                int i10 = this.f18118f;
                int i11 = this.g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                l[] lVarArr = this.f18113a;
                this.g = i12;
                long j = this.j >>> 1;
                this.j = j;
                return new j(lVarArr, this.f18119h, i12, i11, j, 0);
            default:
                int i13 = this.f18118f;
                int i14 = this.g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                l[] lVarArr2 = this.f18113a;
                this.g = i15;
                long j10 = this.j >>> 1;
                this.j = j10;
                return new j(lVarArr2, this.f18119h, i15, i14, j10, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f18101i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA != null) {
                        consumer.accept(lVarA.f18106b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 != null) {
                        consumer.accept(lVarA2.f18107c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f18101i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA == null) {
                    return false;
                }
                consumer.accept(lVarA.f18106b);
                return true;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 == null) {
                    return false;
                }
                consumer.accept(lVarA2.f18107c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f18101i) {
            case 0:
                break;
        }
        return this.j;
    }
}
