package j$.util.stream;

import j$.util.EnumC1065f;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class G2 extends AbstractC1086b2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Comparator f18263t;

    public G2(AbstractC1096d2 abstractC1096d2) {
        super(abstractC1096d2, Y2.f18408q | Y2.f18406o);
        this.f18262s = true;
        this.f18263t = EnumC1065f.INSTANCE;
    }

    public G2(AbstractC1096d2 abstractC1096d2, Comparator comparator) {
        super(abstractC1096d2, Y2.f18408q | Y2.f18407p);
        this.f18262s = false;
        this.f18263t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        Objects.requireNonNull(interfaceC1136l2);
        if (Y2.SORTED.v(i10) && this.f18262s) {
            return interfaceC1136l2;
        }
        if (Y2.SIZED.v(i10)) {
            return new L2(interfaceC1136l2, this.f18263t);
        }
        return new H2(interfaceC1136l2, this.f18263t);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        if (Y2.SORTED.v(((AbstractC1078a) abstractC1184v1).f18426m) && this.f18262s) {
            return abstractC1184v1.k0(spliterator, false, intFunction);
        }
        Object[] objArrM = abstractC1184v1.k0(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.f18263t);
        return new J0(objArrM);
    }
}
