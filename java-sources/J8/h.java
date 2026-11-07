package J8;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p118l7.i f4407a;

    public h(p118l7.i iVar) {
        this.f4407a = iVar;
    }

    @Override // J8.j
    public final boolean a(K8.b bVar) {
        int i10 = bVar.f5308b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f4407a.b(bVar.f5307a);
        return true;
    }

    @Override // J8.j
    public final boolean b(Exception exc) {
        return false;
    }
}
