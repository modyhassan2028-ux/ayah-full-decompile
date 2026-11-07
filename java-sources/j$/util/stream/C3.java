package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class C3 extends AbstractC1082a3 {
    @Override // j$.util.stream.AbstractC1082a3
    public final AbstractC1082a3 e(Spliterator spliterator) {
        return new C3(this.f18433b, spliterator, this.f18432a);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final void d() {
        V2 v10 = new V2();
        this.f18438h = v10;
        Objects.requireNonNull(v10);
        this.f18436e = this.f18433b.F0(new B3(v10, 0));
        this.f18437f = new C1076q(13, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        V2 v10 = (V2) this.f18438h;
        long j = this.g;
        if (v10.f18448c != 0) {
            if (j >= v10.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i10 = 0; i10 <= v10.f18448c; i10++) {
                long j10 = v10.f18449d[i10];
                Object[] objArr = v10.f18379f[i10];
                if (j < ((long) objArr.length) + j10) {
                    obj = objArr[(int) (j - j10)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < v10.f18447b) {
            obj = v10.f18378e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18438h == null && !this.f18439i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            B3 b5 = new B3(consumer, 1);
            this.f18433b.E0(this.f18435d, b5);
            this.f18439i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
