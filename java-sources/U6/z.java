package U6;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Exception {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R6.b f8314r;

    public z(R6.b bVar) {
        if (!((bVar.f7234s == 0 || bVar.f7235t == null) ? false : true)) {
            throw new IllegalArgumentException("ResolvableConnectionException can only be created with a connection result containing a resolution.");
        }
        this.f8314r = bVar;
    }
}
