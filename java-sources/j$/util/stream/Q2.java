package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class Q2 extends U2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.U2
    public final void p(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i10 < i11) {
            intConsumer.accept(iArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.U2
    public final int q(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC1062c.b((P2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.U2
    public final Object[] t() {
        return new int[8][];
    }

    @Override // j$.util.stream.U2
    public final Object newArray(int i10) {
        return new int[i10];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i10) {
        u();
        int[] iArr = (int[]) this.f18373e;
        int i11 = this.f18447b;
        this.f18447b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Z zSpliterator = spliterator();
        Objects.requireNonNull(zSpliterator);
        return new j$.util.i0(zSpliterator);
    }

    @Override // j$.util.stream.U2, java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.Z spliterator() {
        return new P2(this, 0, this.f18448c, 0, this.f18447b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18448c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18448c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
