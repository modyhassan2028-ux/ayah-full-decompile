package q9;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(p150o9.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != p150o9.i.f20380r) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return p150o9.i.f20380r;
    }
}
