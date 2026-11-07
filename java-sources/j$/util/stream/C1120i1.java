package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1120i1 extends AbstractC1125j1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        G0 g0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f18486d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f18485c == null && (g0A = AbstractC1125j1.a(this.f18487e)) != null) {
                Spliterator spliterator = g0A.spliterator();
                this.f18486d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f18483a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18483a == null) {
            return;
        }
        if (this.f18486d == null) {
            Spliterator spliterator = this.f18485c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    G0 g0A = AbstractC1125j1.a(dequeB);
                    if (g0A != null) {
                        g0A.forEach(consumer);
                    } else {
                        this.f18483a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
