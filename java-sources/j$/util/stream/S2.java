package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class S2 extends U2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.U2
    public final void p(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i10 < i11) {
            longConsumer.accept(jArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.U2
    public final int q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC1062c.c((R2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.U2
    public final Object[] t() {
        return new long[8][];
    }

    @Override // j$.util.stream.U2
    public final Object newArray(int i10) {
        return new long[i10];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        u();
        long[] jArr = (long[]) this.f18373e;
        int i10 = this.f18447b;
        this.f18447b = i10 + 1;
        jArr[i10] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.c0 c0VarSpliterator = spliterator();
        Objects.requireNonNull(c0VarSpliterator);
        return new j$.util.j0(c0VarSpliterator);
    }

    @Override // j$.util.stream.U2, java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.c0 spliterator() {
        return new R2(this, 0, this.f18448c, 0, this.f18447b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18448c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18448c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
