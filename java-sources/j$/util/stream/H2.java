package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class H2 extends AbstractC1205z2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f18271d;

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18271d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        AbstractC1062c.t(this.f18271d, this.f18594b);
        long size = this.f18271d.size();
        InterfaceC1136l2 interfaceC1136l2 = this.f18474a;
        interfaceC1136l2.c(size);
        if (!this.f18595c) {
            ArrayList arrayList = this.f18271d;
            Objects.requireNonNull(interfaceC1136l2);
            AbstractC1062c.q(arrayList, new C1076q(7, interfaceC1136l2));
        } else {
            ArrayList arrayList2 = this.f18271d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (interfaceC1136l2.e()) {
                    break;
                } else {
                    interfaceC1136l2.n(obj);
                }
            }
        }
        interfaceC1136l2.end();
        this.f18271d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18271d.add(obj);
    }
}
