package N9;

import K9.InterfaceC0402u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: N9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411d extends O9.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6171w = AtomicIntegerFieldUpdater.newUpdater(C0411d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M9.u f6172u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f6173v;

    public /* synthetic */ C0411d(M9.u uVar, boolean z10) {
        this(uVar, z10, p150o9.i.f20380r, -3, M9.a.f5830r);
    }

    @Override // O9.e
    public final String b() {
        return "channel=" + this.f6172u;
    }

    @Override // O9.e, N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        int i10 = this.f6521s;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i10 == -3) {
            boolean z10 = this.f6173v;
            if (z10 && f6171w.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objO = AbstractC0419l.o(interfaceC0416i, this.f6172u, z10, cVar);
            if (objO == aVar) {
                return objO;
            }
        } else {
            Object objD = super.d(interfaceC0416i, cVar);
            if (objD == aVar) {
                return objD;
            }
        }
        return p110k9.y.f19095a;
    }

    @Override // O9.e
    public final Object e(M9.s sVar, p150o9.c cVar) throws Throwable {
        Object objO = AbstractC0419l.o(new O9.v(sVar), this.f6172u, this.f6173v, cVar);
        return objO == p161p9.a.f21156r ? objO : p110k9.y.f19095a;
    }

    @Override // O9.e
    public final O9.e h(p150o9.h hVar, int i10, M9.a aVar) {
        return new C0411d(this.f6172u, this.f6173v, hVar, i10, aVar);
    }

    @Override // O9.e
    public final InterfaceC0415h i() {
        return new C0411d(this.f6172u, this.f6173v);
    }

    @Override // O9.e
    public final M9.u j(InterfaceC0402u interfaceC0402u) {
        if (this.f6173v && f6171w.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f6521s == -3 ? this.f6172u : super.j(interfaceC0402u);
    }

    public C0411d(M9.u uVar, boolean z10, p150o9.h hVar, int i10, M9.a aVar) {
        super(hVar, i10, aVar);
        this.f6172u = uVar;
        this.f6173v = z10;
    }
}
