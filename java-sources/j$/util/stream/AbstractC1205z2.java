package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1205z2 extends AbstractC1116h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18595c;

    public AbstractC1205z2(InterfaceC1136l2 interfaceC1136l2, Comparator comparator) {
        super(interfaceC1136l2);
        this.f18594b = comparator;
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        this.f18595c = true;
        return false;
    }
}
