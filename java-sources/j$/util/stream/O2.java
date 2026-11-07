package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class O2 extends U2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.U2
    public final void p(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i10 < i11) {
            doubleConsumer.accept(dArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.U2
    public final int q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC1062c.a((N2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.U2
    public final Object[] t() {
        return new double[8][];
    }

    @Override // j$.util.stream.U2
    public final Object newArray(int i10) {
        return new double[i10];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d5) {
        u();
        double[] dArr = (double[]) this.f18373e;
        int i10 = this.f18447b;
        this.f18447b = i10 + 1;
        dArr[i10] = d5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.W wSpliterator = spliterator();
        Objects.requireNonNull(wSpliterator);
        return new j$.util.k0(wSpliterator);
    }

    @Override // j$.util.stream.U2, java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.W spliterator() {
        return new N2(this, 0, this.f18448c, 0, this.f18447b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18448c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18448c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
